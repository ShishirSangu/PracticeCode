package com.function.lamda;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LamdaFunction {

    public static void main(String[] args) {

        // No parameter lambda

        //  The Supplier is a functional interface in Java that represents a function which takes no arguments and returns a result.
        //  It has only 1 get abstract method.
        Supplier<String> greet = () -> "Hello, World!";
        System.out.println(greet.get());

        // Single parameter lambda
        //The Consumer is a functional interface in Java that represents an operation that takes a single input argument and performs some action on it, without returning any result. It is often used for processing or performing operations on elements in a collection, such as printing or modifying them.

        Consumer<String> printMsg = msg -> System.out.println(msg);
        printMsg.accept("Hello, Friends");

        // Multiple parameter lambda

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3));

        // Lambda with a block of code
        Function<Integer, Integer> square = (n) -> {
            int res = n * n;
            return res;
        };
        System.out.println(square.apply(4));

        List<String> names = Arrays.asList("Pooran", "Shravan", "Dhanush", "Shishir");

        // Using lambda with Streams
        names.stream().filter(name -> name.startsWith("J")).forEach(name -> System.out.println(name));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Mapping numbers to their squares
        List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println(squares);

    }


}
