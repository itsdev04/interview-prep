package org.devworks.arrays;

public class HalfSumArray {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 10, 20, 30};
    int len = arr.length;
    int sumFirstHalf = 0, sumSecondHalf = 0;
    for (int i = 0; i < len / 2; i++) {
      sumFirstHalf += arr[i];
    }
    for (int i = len / 2; i < len; i++) {
      sumSecondHalf += arr[i];
    }
    if (sumFirstHalf < sumSecondHalf) {
      for (int i = arr.length - 1; i >= 0; i--) {
        System.out.print(arr[i] + " ");
      }
    } else {
      System.out.println("invalid");
    }
  }
}
