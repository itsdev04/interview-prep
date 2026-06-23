package org.devworks.company;

import java.util.Arrays;

// You are given an integer array A of length N. In array A, two integers are repeated,
// meaning two integers appear twice in the array. You need to transform the array
// into a valid permutation of integers from 1 to N using the following operation:
// 1.In each operation, you can choose any element of the array and increase its value by
// 1.Task: Find and return an integer representing the minimum number of operations required
// to convert the array into a valid permutation of size N. in java
public class Permutations {
  public static int transformArray(int arr[]) {
    Arrays.sort(arr);
    int op = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < i + 1) {
        op += (i + 1 - arr[i]);
        arr[i] = i + 1;
      }
    }
    return op;
  }

  public static void main(String[] args) {
    int arr[] = {1, 1, 3, 3, 4};
    System.out.println(transformArray(arr));
  }
}
