package ru.ldv236.QuestionRoulette;

public class QuestionRoulette4 {
    public static void main(String[] args) {
        Object[][] rouletteList = initList();

        printList(rouletteList);






    }

    static void incrementAnswerCount() {

    }

    static void printList(Object[][] rouletteList) {
        for (Object[] objects : rouletteList) {
            System.out.println(objects[0] + " " + objects[1] + " " + objects[2]);
        }
    }

    static Object[][] initList() {
        Object[] names = {
                "Арсланов Эдуард",
                "Богданова Кристина",
                "Вавилин Константин",
                "Власов Артём",
                "Горчаков Михаил",
                "Губарев Андрей",
                "Даймонд Анна",
                "Дубовицкий Вячеслав",
                "Жиров Максим",
                "Иванов Артемий ",
                "Иванова Анастасия",
                "Клементьев Никита",
                "Корякин Вячеслав",
                "Матвеев Владислав",
                "Медведев Игорь",
                "Моисеева Ярослава",
                "Морозов Никита",
                "Петин Евгений",
                "Пляшечников Виталий",
                "Прусов Дмитрий",
                "Сергеенков Андрей",
                "Соколов Константин",
                "Сташевский Вадим",
                "Ферт Глеб",
                "Харьков Александр",
                "Челидзе Теона",
                "Шестаков Александр",
                "Юришин Алексей",
                "Юрченко Алексей",
                "Яшнов Александр"
        };

        Object[][] rouletteList = new Object[names.length][3];

        for (int i = 0; i < rouletteList.length; i++) {
            rouletteList[i][0] = i;
            rouletteList[i][1] = names[i];
            rouletteList[i][2] = 0;
        }

        return rouletteList;
    }
}
