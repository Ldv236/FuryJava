package ru.ldv236.OOP.objectsClasses2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Lada";
        car.color = "White";
        car.year = 2020;

        //это пока не надо, переопределение туСтринг будет дальше в уроках
//        System.out.println(car);

        //дальше методы объявить и вызвать
        car.start();
        car.ride();
        car.stop();

        Car car2 = new Car();
//        car2.model = "Audi";
        car2.model = "Lada"; //чтобы показать, что одной модели выводить не достаточно
        car2.color = "Black";
        car2.year = 2015;

        //теперь вызвать методы для второй машины
        car2.start();
        car2.ride();
        car2.stop();

        //показать в консоли что нифига не понятно
        //потом переименовать кары в лада и ауди
        //потом добавить в методы имя, показать
        //сделать обе модели ладой, опять нифига не понятно
        //сделать метод гетИнфо мол не добавлть же все поля во все места, легко ошибиться
        //потом сделать акцент еще раз на шаблон - реализация и закрепить тойотой

        Car toyota = new Car();
        toyota.model = "Toyota";
        toyota.color = "Blue";
        toyota.year = 2016;

        toyota.start();
        toyota.ride();
        toyota.stop();
    }
}
