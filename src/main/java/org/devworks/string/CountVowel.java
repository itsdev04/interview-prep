package org.devworks.string;

import java.util.Scanner;

public class CountVowel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int prevLen = str.length();
    str = str.replaceAll("[aeiouAEIOU]", "");

    int newLen = str.length();
    int count = prevLen - newLen;
    System.out.println(count);
  }
}
