package org.devworks.arrays;
// sum of left and right element = middle one
public class ValidSubarrayOfSize3 {
  public static void main(String[] args) {
    int arr[] = {3, 1, 5, 4, 3, 6, 3};
    int count = 0;
    for (int i = 0; i < arr.length - 2; i++) {
      if (arr[i] + arr[i + 2] == arr[i + 1]) {
        count++;
      }
    }
    System.out.println(count);
  }
}
