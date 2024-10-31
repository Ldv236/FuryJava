package ru.ldv236.OOP.nestedClass.House;

public class Main {
    public static void main(String[] args) {

        // Создаем объект дома
        House house = new House("456 Oak Street");

        // Добавляем квартиры в дом
        house.addApartment(1, 85.0);
        house.addApartment(2, 120.5);

        // Отображаем информацию о доме и квартирах
//        house.showHouseInfo();

        // Получаем объект Apartment по номеру и работаем с ним
        House.Apartment apartment = house.getApartment(2);
        if (apartment != null) {
            apartment.showApartmentInfo();
        } else {
            System.out.println("Apartment not found.");
        }
    }
}
