package ru.ldv236.OOP.practice1;

public class Cat extends Animal {
    private boolean indoor;

    public Cat(String name, int age, boolean indoor) {
        super(name, age);
        this.indoor = indoor;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Indoor: " + (indoor ? "Yes" : "No");
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }
}
