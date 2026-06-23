package org.devworks.company;

import java.util.Scanner;

public class PrintPrimeNumbers {

  public static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a > b || a <= 0 || b <= 0) {
      System.out.println("Provide valid input");
    } else {
      for (int i = a; i <= b; i++) {
        if (isPrime(i)) {
          System.out.println(i + " ");
        }
      }
    }
  }
}
