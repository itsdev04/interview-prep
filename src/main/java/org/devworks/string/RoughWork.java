package org.devworks.string;

import java.util.Arrays;

public class RoughWork {
  public static void reverseString(char[] s) {
    char[] rev = new char[s.length];
    int c = 0;
    for (int i = s.length - 1; i >= 0; --i) {
      rev[c] = s[i];
      c++;
    }
    for (int i = 0; i < s.length; i++) {
      System.out.println(rev[i]);
    }
  }

  public static void printArray(int[] arrr) {
    System.out.println(Arrays.toString(arrr));
  }

  public static void main(String[] args) {
    char[] arr = new char[] {'h', 'e', 'l', 'l', 'o'};
    reverseString(arr);
    int[] arr1 = new int[] {1, 2, 3, 4, 5};
    printArray(arr1);
  }
}
