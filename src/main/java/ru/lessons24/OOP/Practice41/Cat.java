package ru.lessons24.OOP.Practice41;

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
