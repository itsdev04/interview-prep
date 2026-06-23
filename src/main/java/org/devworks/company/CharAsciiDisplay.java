package org.devworks.company;

import java.util.Scanner;

public class CharAsciiDisplay {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    System.out.println("value of " + ch + " is " + (int) ch);
  }
}
