import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfInt {

    static void addIfEven(int num, List<Integer> evenNumbers) {
        if (num % 2 == 0) {
            evenNumbers.add(num);
        }
    }

    static List<Integer> getEvenNumForEach(List<Integer> intNum) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : intNum) {
            addIfEven(num, evenNumbers);
        }
        return evenNumbers;
    }

    static List<Integer> getEvenNumWhile(List<Integer> intNum) {
        List<Integer> evenNumbers = new ArrayList<>();
        int i = 0;
        while (i < intNum.size()) {
            int num = intNum.get(i);
            addIfEven(num, evenNumbers);
            i++;
        }
        return evenNumbers;
    }

    static List<Integer> getEvenNumFor(List<Integer> intNum) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int j = 0; j < intNum.size(); j++) {
            int num = intNum.get(j);
            addIfEven(num, evenNumbers);
        }
        return evenNumbers;
    }

    static List<Integer> getEvenNumStream(List<Integer> intNum) {
        return intNum.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> intNum = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            intNum.add(i);
        }

        List<Integer> evenNumForEach = getEvenNumForEach(intNum);
        System.out.println("Even numbers in the list using for each loop: " + evenNumForEach);

        List<Integer> evenNumWhile = getEvenNumWhile(intNum);
        System.out.println("Even numbers in the list using while loop: " + evenNumWhile);

        List<Integer> evenNumFor = getEvenNumFor(intNum);
        System.out.println("Even numbers in the list using for loop: " + evenNumFor);

        List<Integer> evenNumStream = getEvenNumStream(intNum);
        System.out.println("Even numbers in the list using streams: " + evenNumStream);
    }
}
