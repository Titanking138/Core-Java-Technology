package lab2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Which fibonacci th term you want to find : ");
        int n = scanner.nextInt();

        System.out.println("Your " + n + " Term is :" + fibonacci(n));
        // fibonacci(n);
        scanner.close();
    }

    public static int fibonacci(int n) {
        int nth_term = 0, a = 0, b = 1;
        while (n-- != 0) {
            nth_term = a + b;
            a = b;
            b = nth_term;
            System.out.println(nth_term);

        }
        return nth_term;
    }
}
