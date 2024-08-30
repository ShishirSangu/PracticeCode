import java.util.Scanner;
public class Main {

    static void palindrome(int n){
        int m = n;
        int sum = 0;
        while(n != 0){
            int d = n % 10;
            sum = sum * 10 + d;
            n /= 10;
        }
        if(sum == m){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        palindrome(n);
    }
}