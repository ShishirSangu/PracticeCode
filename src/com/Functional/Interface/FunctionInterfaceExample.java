package com.Functional.Interface;

import java.util.function.Function;

public class FunctionInterfaceExample {

    public static void main(String[] args) {
        // Function to check if a number is even
        Function<Integer, Boolean> isEven = (n) -> n % 2 == 0;

        System.out.println(isEven.apply(4));
        System.out.println(isEven.apply(7));


        Function<Integer, String> intToString = (n) -> "Number: " + n;

        // Function to calculate the square of an Integer
        Function<Integer, Integer> square = (n) -> n * n;

        // Using andThen to chain functions: First convert to String, then append some text
        Function<Integer, String> squareToString = square.andThen((s) -> "Square is: " + s);

        // Applying functions
        System.out.println(intToString.apply(5));
        System.out.println(square.apply(4));
        System.out.println(squareToString.apply(4));

    }
}
