package org.devworks.company;

import java.util.Scanner;

// either end with 7 or divisible by 7
public class BuzzProblem {
  private static boolean isBuzz(int num) {
    int rem = num % 10;
    if (rem == 7 || num % 7 == 0) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(isBuzz(num));
  }
}
