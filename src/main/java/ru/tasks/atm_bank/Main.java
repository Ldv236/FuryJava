package ru.tasks.atm_bank;

import java.util.EnumMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Инициализация банкомата с ограниченным количеством купюр
        Map<Denomination, Integer> initialBanknotes = new EnumMap<>(Denomination.class);
        initialBanknotes.put(Denomination.FIVE_THOUSAND, 10);  // 10 купюр по 5000
        initialBanknotes.put(Denomination.TWO_THOUSAND, 10);   // 10 купюр по 2000
        initialBanknotes.put(Denomination.THOUSAND, 10);       // 10 купюр по 1000
        initialBanknotes.put(Denomination.FIVE_HUNDRED, 10);   // 10 купюр по 500
        initialBanknotes.put(Denomination.TWO_HUNDRED, 10);    // 10 купюр по 200
        initialBanknotes.put(Denomination.HUNDRED, 10);        // 10 купюр по 100
        initialBanknotes.put(Denomination.FIFTY, 10);          // 10 купюр по 50

        ATM atm = new ATM(initialBanknotes);

        int amountToWithdraw = 7350;

        try {
            Map<Denomination, Integer> result = atm.withdraw(amountToWithdraw);
            System.out.println("Выдача для суммы " + amountToWithdraw + ":");
            for (Map.Entry<Denomination, Integer> entry : result.entrySet()) {
                System.out.println("Купюра " + entry.getKey().getValue() + " руб.: " + entry.getValue() + " шт.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Печать оставшихся купюр
        System.out.println("\nОставшиеся купюры в банкомате:");
        for (Map.Entry<Denomination, Integer> entry : atm.getAvailableBanknotes().entrySet()) {
            System.out.println("Купюра " + entry.getKey().getValue() + " руб.: " + entry.getValue() + " шт.");
        }
    }
}
