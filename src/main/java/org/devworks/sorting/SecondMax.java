package org.devworks.sorting;

public class SecondMax {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 3, 2, 4, 6};

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.print(arr[arr.length - 2]);
  }
}
