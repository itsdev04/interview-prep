package org.devworks.arrays;

public class LargestElement {
  private static int largest(int[] arr) {
    int max = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {7, 0, 3, 3, 6, 6, 7, 8, 7, 1};

    System.out.print(largest(arr));
  }
}
