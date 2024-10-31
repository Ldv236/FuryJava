package ru.ldv236.OOP.nestedClass.House;

import java.util.ArrayList;
import java.util.List;

public class House {

    private String address;
    private List<Apartment> apartments;

    // Конструктор для Дома
    public House(String address) {
        this.address = address;
        this.apartments = new ArrayList<>();
    }

    // Метод для добавления квартиры в дом
    public void addApartment(int number, double area) {
        Apartment apartment = new Apartment(number, area); // Создаем объект внутреннего класса
        apartments.add(apartment); // Добавляем квартиру в список
    }

    // Метод для получения квартиры по номеру
    public Apartment getApartment(int number) {
        for (Apartment apartment : apartments) {
            if (apartment.getNumber() == number) {
                return apartment; // Возвращаем объект Apartment
            }
        }
        return null; // Если квартира не найдена
    }

    // Метод для отображения информации о доме и квартирах в нем
    public void showHouseInfo() {
        System.out.println("House at " + address);
        System.out.println("Apartments:");
        for (Apartment apartment : apartments) {
            apartment.showApartmentInfo();
        }
    }

    // Внутренний (нестатический чтобы иметь доступ к нестатическому адресу) класс Квартира
    public class Apartment {
        private int number;
        private double area;

        // Конструктор для Квартиры
        public Apartment(int number, double area) {
            this.number = number;
            this.area = area;
        }

        // Метод для получения номера квартиры
        public int getNumber() {
            return number;
        }

        // Метод для отображения информации о квартире
        public void showApartmentInfo() {
            System.out.println("Apartment #" + number + ", Area: " + area + " sqm (адрес дома -" + address + ")");
        }
    }
}
