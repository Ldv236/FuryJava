package ru.LeetCode.core;

public class Main {
    public static void main(String[] args) {
        ThingEntity thingEntity = new ThingEntity();
        
        thingEntity.setSomeType(Type.FIRST);
        thingEntity.setSomeType(Type.valueOf("SECOND"));

        System.out.println(thingEntity);
        System.out.println(thingEntity.getSomeType().getNum());
    }

}

enum Type {
    FIRST(111),
    SECOND(222),
    THIRD(333);

    private Integer num;

    Type(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }
}

class ThingEntity {
    private Type someType;

    public Type getSomeType() {
        return someType;
    }

    public void setSomeType(Type type) {
        this.someType = type;
    }

    @Override
    public String toString() {
        return this.getClass().toString() + " " + someType;
    }
}
