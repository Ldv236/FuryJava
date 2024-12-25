package ru.ldv236.core2.enums.abstractMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double result = Operation.ADDITION.apply(5, 2);
        System.out.println(result);

        result = Operation.SUBTRACTION.apply(5, 2);
        System.out.println(result);

        result = Operation.MULTIPLICATION.apply(5, 2);
        System.out.println(result);

        result = Operation.DIVISION.apply(5, 2);
        System.out.println(result);




        List<Operation> operations = new ArrayList<>();
        operations.add(Operation.ADDITION);
        operations.add(Operation.SUBTRACTION);
        operations.add(Operation.MULTIPLICATION);
        operations.add(Operation.DIVISION);

        List<Double> results = new ArrayList<>();

        operations.forEach(o -> results.add(o.apply(6, 4)));

        System.out.println(results);
    }
}
