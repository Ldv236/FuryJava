package ru.ldv236.core.Clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address("New York");
        Person person1 = new Person("John", address);

        // Поверхностное копирование
        Person person2 = (Person) person1.clone();

        // Изменяем адрес во втором объекте
        person2.address.city = "Los Angeles";

        // Оба объекта теперь ссылаются на один и тот же адрес
        System.out.println(person1.address.city);  // Los Angeles
        System.out.println(person2.address.city);  // Los Angeles
    }
}
