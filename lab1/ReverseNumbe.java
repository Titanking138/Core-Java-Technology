// package lab1;

import java.util.Scanner;

public class ReverseNumbe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number that you want to reverse : ");
        int n = s.nextInt();

        s.close();
        System.out.println("Reversed Number: " + Reverse(n));
    }

    private static int Reverse(int n) {
        int reversed = 0;

        // run loop until num becomes 0
        while (n != 0) {
            // get last digit from n
            int digit = n % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from n
            n /= 10;
        }
        return reversed;
    }
}
