package lab2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scanner.nextInt();
        System.out.println("Result is : " + factorial(n));

        scanner.close();
    }

    public static int factorial(int n) {
        int fact = 1;
        while (n - 1 != 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
