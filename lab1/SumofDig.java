// package lab1;

import java.util.Scanner;

public class SumofDig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number :");
        int n = scanner.nextInt();
        System.out.println(SumofDigite(n));

        scanner.close();
    }

    public static int SumofDigite(int n) {
        int sum = 0;
        while (n != 0) {
            int num = n % 10;
            sum += num;
            n = n / 10;
        }
        return sum;
    }
}
