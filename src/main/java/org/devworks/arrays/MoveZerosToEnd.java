package org.devworks.arrays;

public class MoveZerosToEnd {
  private static void moveZeros(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == 0) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[] {7, 0, 3, 3, 6, 6, 7, 8, 7, 1};
    moveZeros(arr);
  }
}
