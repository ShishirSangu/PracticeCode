import java.util.ArrayList;
import java.util.List;

public class ListOfInt {
    public static void main(String[] args) {
        List<Integer> intNum = new ArrayList<>();

        for (int i=1; i<=10; i++) {
            intNum.add(i);
        }

        System.out.println("Even numbers in the list using for each loop : ");
        for (int num : intNum) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("Even numbers in the list using while loop : ");
        int i=0;
        while (i < intNum.size()) {
            int num= intNum.get(i);
            if (num % 2 == 0) {
                System.out.println(num);
            }
            i++;
        }

        System.out.println("Even numbers in the list using for loop : ");
        for(int j=0; j<intNum.size(); j++) {
            int num= intNum.get(j);
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("Even numbers in the list using streams : ");
        intNum.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

    }
}