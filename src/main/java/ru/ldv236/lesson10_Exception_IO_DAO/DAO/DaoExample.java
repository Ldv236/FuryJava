package ru.ldv236.lesson10_Exception_IO_DAO.DAO;

public class DaoExample {
    public static void main(String[] args) {
        PersonDao personDao = new FilePersonDao("people.txt");

        personDao.addPerson(new Person("John Doe", 30));
        personDao.addPerson(new Person("Jane Doe", 25));

        System.out.println("All people:");
        for (Person person : personDao.getAllPeople()) {
            System.out.println(person);
        }

        System.out.println("\nFinding John Doe:");
        Person found = personDao.findPerson("John Doe");
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Person not found.");
        }
    }
}