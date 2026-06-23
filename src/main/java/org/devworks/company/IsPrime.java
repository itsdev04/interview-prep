package org.devworks.company;

import java.util.Scanner;

public class IsPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int flag = 0;
    if (num <= 1) {
      flag = 1;
    } else if (num == 2) {
      flag = 0;
    }
    for (int i = 2; i < Math.sqrt(num); i++) {
      if (num % i == 0) {
        flag = 1;
        break;
      }
    }
    if (flag == 0) {
      System.out.println("prime");
    } else {
      System.out.println("not prime");
    }
  }
}
