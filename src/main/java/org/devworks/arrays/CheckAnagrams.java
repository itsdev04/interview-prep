package org.devworks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println(isAnagram(num1, num2));
  }

  private static boolean isAnagram(int num1, int num2) {
    String s1 = Integer.toString(num1);
    String s2 = Integer.toString(num2);
    if (s1.length() != s2.length()) {
      return false;
    }
    char arr1[] = s1.toCharArray();
    char arr2[] = s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
  }
}
