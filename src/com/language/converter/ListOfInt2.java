package com.language.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListOfInt2 {

    static Function<Integer, Boolean> isEven = n -> n % 2 == 0;
    static Function<Integer, Boolean> isDivisibleBy3 = n -> n % 3 == 0;
    static Function<Integer, Boolean> isOdd = n -> n % 2 != 0;

    static List<Integer> getEvenNumForEach(List<Integer> intNum) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : intNum) {
            if (isEven.apply(num)) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    static List<Integer> getEvenNumForEach(List<Integer> intNum, Function<Integer, Boolean> function) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : intNum) {
            if (function.apply(num)) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    static List<Integer> getEvenNumWhile(List<Integer> intNum) {
        List<Integer> evenNumbers = new ArrayList<>();
        int i = 0;
        while (i < intNum.size()) {
            int num = intNum.get(i);
            if (isEven.apply(num)) {
                evenNumbers.add(num);
            }
            i++;
        }
        return evenNumbers;
    }

    static List<Integer> getEvenNumWhile(List<Integer> intNum, Function<Integer, Boolean> function) {
        List<Integer> evenNumbers = new ArrayList<>();
        int i = 0;
        while (i < intNum.size()) {
            int num = intNum.get(i);
            if (function.apply(num)) {
                evenNumbers.add(num);
            }
            i++;
        }
        return evenNumbers;
    }

    static List<Integer> getEvenNumFor(List<Integer> intNum) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int j = 0; j < intNum.size(); j++) {
            int num = intNum.get(j);
            if (isEven.apply(num)) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    static List<Integer> getEvenNumFor(List<Integer> intNum, Function<Integer, Boolean> function) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int j = 0; j < intNum.size(); j++) {
            int num = intNum.get(j);
            if (function.apply(num)) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    static List<Integer> getEvenNumStream(List<Integer> intNum) {
        return intNum.stream()//
                .filter(n -> isEven.apply(n))//
                .collect(Collectors.toList());
    }

    static List<Integer> getEvenNumStream(List<Integer> intNum, Function<Integer, Boolean> function) {
        return intNum.stream()//
                .filter(n -> function.apply(n))//
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> intNum = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            intNum.add(i);
        }

        List<Integer> evenNumForEach = getEvenNumForEach(intNum);
        System.out.println("Even numbers in the list using for each loop: " + evenNumForEach);

        List<Integer> evenNumForEachUsingFunctional = getEvenNumForEach(intNum, isEven);
        System.out.println("Even numbers in the list using for each loop: " + evenNumForEachUsingFunctional);

        List<Integer> evenNumWhile = getEvenNumWhile(intNum);
        System.out.println("Even numbers in the list using while loop: " + evenNumWhile);

        List<Integer> evenNumWhileUsingFunctional = getEvenNumWhile(intNum, isEven);
        System.out.println("Even numbers in the list using while loop: " + evenNumWhileUsingFunctional);

        List<Integer> evenNumFor = getEvenNumFor(intNum);
        System.out.println("Even numbers in the list using for loop: " + evenNumFor);

        List<Integer> evenNumForUsingFunctional = getEvenNumFor(intNum, isEven);
        System.out.println("Even numbers in the list using for loop: " + evenNumForUsingFunctional);

        List<Integer> evenNumStream = getEvenNumStream(intNum);
        System.out.println("Even numbers in the list using streams: " + evenNumStream);

        List<Integer> evenNumStreamUsingFunctional = getEvenNumStream(intNum, isEven);
        System.out.println("Even numbers in the list using streams: " + evenNumStreamUsingFunctional);
    }
}