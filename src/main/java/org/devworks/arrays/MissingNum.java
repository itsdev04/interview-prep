package org.devworks.arrays;

import java.util.Arrays;

// Given an array of numbers from 1 to n with one missing number, write a program to find the
// missing number.
public class MissingNum {
  public static int missingNum(int arr[]) {
    int result = 0;
    Arrays.sort(arr);
    int max = arr[arr.length - 1];
    int arr1[] = new int[max + 1];
    for (int i = 0; i < arr.length; i++) {
      arr1[arr[i]] = 1;
    }
    for (int i = 1; i <= max; i++) {
      if (arr1[i] == 0) {
        result = i;
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int arr[] = {8, 2, 4, 5, 3, 7, 1};
    System.out.println(missingNum(arr));
  }
}
