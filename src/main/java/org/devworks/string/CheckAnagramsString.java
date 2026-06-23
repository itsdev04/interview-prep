package org.devworks.string;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramsString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    System.out.println(isAnagram(s1, s2));
  }

  private static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    char[] charArray1 = s1.toCharArray();
    char[] charArray2 = s2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    return Arrays.equals(charArray1, charArray2);
  }
}
