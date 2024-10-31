package ru.tasks.atm_bank;

import java.util.EnumMap;
import java.util.Map;

public class ATM {
    private final Map<Denomination, Integer> availableBanknotes;

    public ATM(Map<Denomination, Integer> initialBanknotes) {
        this.availableBanknotes = new EnumMap<>(initialBanknotes);
    }

    public Map<Denomination, Integer> withdraw(int amount) {
        Map<Denomination, Integer> result = new EnumMap<>(Denomination.class);

        // Сортируем номиналы в порядке убывания
        Denomination[] denominations = Denomination.values();
        java.util.Arrays.sort(denominations, (a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for (Denomination denomination : denominations) {
            int denominationValue = denomination.getValue();
            int availableCount = availableBanknotes.getOrDefault(denomination, 0);

            if (amount >= denominationValue && availableCount > 0) {
                int requiredCount = amount / denominationValue;
                int countToDispense = Math.min(requiredCount, availableCount);

                if (countToDispense > 0) {
                    result.put(denomination, countToDispense);
                    amount -= countToDispense * denominationValue;
                    availableBanknotes.put(denomination, availableCount - countToDispense);
                }
            }
        }

        if (amount > 0) {
            throw new IllegalArgumentException("Невозможно выдать запрашиваемую сумму с доступными номиналами.");
        }

        return result;
    }

    public void addBanknotes(Denomination denomination, int count) {
        availableBanknotes.put(denomination, availableBanknotes.getOrDefault(denomination, 0) + count);
    }

    public Map<Denomination, Integer> getAvailableBanknotes() {
        return new EnumMap<>(availableBanknotes);
    }
}