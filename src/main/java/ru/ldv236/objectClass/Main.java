package ru.ldv236.objectClass;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        Departament<Client> departament = new Departament<>();
//        departament.addPeople(new Person("Ivan1", 30));
//        departament.addPeople(new Employee("Ivan2", 30, 10_000));
        departament.addPeople(new Client("Ivan3", 30));



//        Employee employee = new Employee();

//        Person vanya = new Person("Ivan", 30);
//        Person vanya2 = new Person("Ivan", 31);
//
//        if (vanya.getClass().equals(Person.class)) {
//            System.out.println("это класс персон");
//        }

//        if (vanya.equals(vanya2)) {
//            System.out.println("они одинаковые");
//        } else {
//            System.out.println("они разные");
//        }
//
//        if (vanya.hashCode() == vanya2.hashCode()) {
//            System.out.println("хэшкод равен");
//        } else {
//            System.out.println("хэшкод разный");
//        }
    }

    static void addAnimal(List<? super Animal> animals) {

    }
}

class Animal {}