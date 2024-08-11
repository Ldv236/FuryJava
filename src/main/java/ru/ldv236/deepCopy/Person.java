package ru.ldv236.deepCopy;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {

    private String name;
    private int age;
    private List<Hobby> hobbies;

    public Person() {
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

    @Override
    public Person clone() {
        try {
            Person cloned = (Person) super.clone();
            if (this.hobbies != null) {
                cloned.hobbies = new ArrayList<>(this.hobbies); // Глубокая копия списка
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Не должно произойти, так как мы реализуем Cloneable
        }
    }
}

class Hobby {

    private String name;

    public Hobby(Hobby hobby) {
        this.name = hobby.name;
    }
}