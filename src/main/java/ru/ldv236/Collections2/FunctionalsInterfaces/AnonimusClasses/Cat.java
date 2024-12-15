package ru.ldv236.Collections2.FunctionalsInterfaces.AnonimusClasses;

public class Cat implements Pet{

    @Override
    public void play() {
        System.out.println("Играется с клубком");
    }

    @Override
    public String beFriendly(String name) {
        return name + " кряхтит";
    }
}
