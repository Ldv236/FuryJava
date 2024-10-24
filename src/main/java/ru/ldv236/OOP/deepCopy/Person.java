package ru.ldv236.OOP.deepCopy;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {

    private String name;
    private int age;
    private List<Hobby> hobbies = new ArrayList<>();

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addHobby(Hobby hobby) {
        hobbies.add(hobby);
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    // Конструктор копирования
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        // Для списка hobbies необходимо также создать глубокую копию, чтобы обеспечить полную независимость копий
        if (other.hobbies != null) {
            this.hobbies = new ArrayList<>();
            for (Hobby hobby : other.hobbies) {
                this.hobbies.add(new Hobby(hobby)); // Предполагается, что класс Hobby имеет конструктор копирования
            }
        }
    }

    // поверхностное (шeллоу) клонирование
//    @Override
//    protected Person clone() throws CloneNotSupportedException {
//        return (Person) super.clone();  // Поверхностная копия
//    }

    // глубокое клонирование
    @Override
    public Person clone() {
        try {
            Person cloned = (Person) super.clone();
            if (this.hobbies != null) {
                // Глубокая копия списка, но не самих объектов в списке, их изменения коснутся исходного объекта
//                cloned.hobbies = new ArrayList<>(this.hobbies);

                // поэтому надо каждый объект клонировать (не забыть имплементировать клонебл в классе хобби
                cloned.hobbies = new ArrayList<>();
                for (Hobby hobby : this.hobbies) {
                    cloned.hobbies.add(hobby.clone());
                }
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Не должно произойти, так как мы реализуем Cloneable
        }
    }
}