package ru.ldv236.patterns.adapter;

public class PlugAdapter implements EuropeanPlug {
    private BritishPlug britishPlug;

    public PlugAdapter(BritishPlug britishPlug) {
        this.britishPlug = britishPlug;
    }

    @Override
    public void useEuropeanPlug() {
        britishPlug.useBritishPlug();
    }
}