    package com.JavaStream.Example;

    import java.util.Arrays;
    import java.util.List;
    import java.util.stream.IntStream;

    public class StreamExample {

        public static void main(String[] args) {

            // Even numbers
            List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
            num.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

    //        Converts each string to uppercase
            List<String> names = Arrays.asList("apple", "banana", "cherry");
            names.stream()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);


            // Default natural sorting
            List<String> fruits = Arrays.asList("banana", "apple", "cherry");
            fruits.stream()
                    .sorted()
                    .forEach(System.out::println);


            // Removes duplicates
            List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
            numbers.stream()
                    .distinct()
                    .forEach(System.out::println);


            // forEach(Consumer<? super T> action): Performs an action for each element.
            List<String> name = Arrays.asList("John", "Jane", "Jack");
            name.stream()
                    .forEach(System.out::println);


        // count(): Returns the count of elements in the stream.
            List<String> name1 = Arrays.asList("John", "Jane", "Jack");
            long count = name1.stream().count();

            // Specialized stream

            IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
            int sum = intStream.sum();
            System.out.println("Sum : " + sum);

            int[] num1 = {1, 2, 3, 4, 5};
            IntStream intStream1 = Arrays.stream(num1);
            intStream1.forEach(num2 -> System.out.println("Nums is : " + num2));


        }
    }
