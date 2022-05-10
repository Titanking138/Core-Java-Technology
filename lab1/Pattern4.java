// package lab1;

import java.util.*;

class Pattern4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();

    for (int i = 0; i <= n; i++) {
      for (int k = n - i; k >= 0; k--) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    for (int i = 0; i < n; i++) {
      for (int k = 0; k <= i + 1; k++) {
        System.out.print(" ");
      }
      for (int j = n - i - 1; j >= 0; j--) {
        System.out.print("*");
      }
      System.out.println("");
    }
    sc.close();
  }
}
