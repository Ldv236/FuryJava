package ru.ldv236.Collections2.streamExample;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //получить из этих коллекций мапу с комментариями каждого юзера (ключ - юзер, а не его id, значение - лист комментов со всех постов)
        List<Comment> commentsSource = List.of(new Comment("b", 1l), new Comment("a", 2l));
        List<Comment> commentsSource2 = List.of(new Comment("d", 2l), new Comment("c", 2l));
        List<Post> posts = List.of(new Post(commentsSource), new Post(commentsSource2));
        List<User> users = List.of(new User(1l), new User(2l));


        // Преобразуем список пользователей в карту для быстрого доступа по id
        Map<Long, User> userMap = users.stream()
//                .collect(Collectors.toMap(User::getId,  u -> u));
            .collect(Collectors.toMap(User::getId, Function.identity()));

        // собирание в мапу по юзеру (с использованием его id) через группингБай
        // Создаем карту User -> List<Comment>
        Map<User, List<Comment>> result = posts.stream() // сначала у нас тут стрим постов
            .flatMap(p -> p.getComments().stream()) // из каждого поста достаем лист комментов, переводим в стрим, это всё соединяется в один стрим
            .filter(c -> userMap.containsKey(c.getUserId())) // Фильтруем комментарии, чтобы убедиться, что для userId существует пользователь
            .collect(Collectors.groupingBy(
                c -> userMap.get(c.getUserId()), // Группируем комментарии по пользователям
                Collectors.toList() // Собираем комментарии в список
            ));

        // пробуем партишинингБай - мапа с разделением на два списка с ключами тру и фальш
        // просто для эксперимента Создаем карту SomeCondition -> Set<Comment>
//        Map<Boolean, Set<Comment>> result2 = posts.stream() // сначала у нас тут стрим постов
//            .flatMap(p -> p.getComments().stream()) // из каждого поста достаем лист комментов, переводим в стрим, это всё соединяется в один стрим
//            .filter(c -> userMap.containsKey(c.getUserId())) // Фильтруем комментарии, чтобы убедиться, что для userId существует пользователь
//            .collect(Collectors.partitioningBy(
//                c -> c.getUserId() > 1,
////                Collectors.toSet()
//                Collectors.toCollection(() -> new TreeSet<>((c1, c2) -> c2.getText().compareTo(c1.getText())))
//            )); //мапа с двумя ключами - тру/фальш и соотв. листы по условию

        // Выводим результат
        result.forEach((u, c) -> {
            System.out.println("User: " + u.getId() + " has comments: " + c);
        });

//         Выводим результат 2
//        result2.forEach((b, c) -> {
//            System.out.println("UserId > 1: " + b + " has comments: " + c);
//        });

    }
}

class Post {
    private List<Comment> comments;

    public Post(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Comment> getComments() {
        return comments;
    }
}

class Comment {
    private String text;
    private Long userId;

    public Comment(String text, Long userId) {
        this.text = text;
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public Long getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Comment{" + text + ", userId=" + userId + '}';
    }
}

class User {
    private Long id;

    public User(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" + id + '}';
    }
}
