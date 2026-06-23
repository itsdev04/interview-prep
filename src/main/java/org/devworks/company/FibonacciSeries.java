package org.devworks.company;

import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    int a = 0, b = 1, c;
    System.out.print(a + "," + b + ",");
    for (int i = 0; i < range - 2; i++) {
      c = a + b;
      System.out.print(c + ",");
      a = b;
      b = c;
    }
  }
}
