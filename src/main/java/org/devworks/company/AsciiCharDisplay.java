package org.devworks.company;

import java.util.Scanner;

// display characters when entered ascii values
public class AsciiCharDisplay {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the digits:");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();
    System.out.println(num1 + " - " + (char) num1);
    System.out.println(num2 + " - " + (char) num2);
    System.out.println(num3 + " - " + (char) num3);
    System.out.println(num4 + " - " + (char) num4);
  }
}
