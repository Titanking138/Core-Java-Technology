package lab2;

import java.util.Scanner;

public class UserIntCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Enter operation Number you want to do : \n1.\tSum\n2.\tSub\n3.\tMulti\n4.\tDiv\nEnter number :");
        int n = scanner.nextInt();
        System.out.println("Enter first element  : ");
        int a = scanner.nextInt();
        System.out.println("enter second element : ");
        int b = scanner.nextInt();
        int ans = 0;
        switch (n) {
            case 1:
                ans = a + b;
                break;
            case 2:
                ans = a - b;
                break;
            case 3:
                ans = a * b;
                break;
            case 4:
                ans = a / b;
                break;

            default:
                break;
        }
        System.out.println("result is :" + ans);

        scanner.close();
    }
}
