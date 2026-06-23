package org.devworks.arrays;

public class MergeTwoSortedArrays {
  public static void main(String[] args) {

    int arr1[] = {2, 4, 6, 8, 10, 12, 16};
    int arr2[] = {1, 3, 5, 7, 9};
    int n = arr1.length;
    int m = arr2.length;
    int result[] = new int[n + m];
    int idx = 0;
    int i = 0, j = 0;
    while (i < n && j < m) {
      if (arr1[i] < arr2[j]) {
        result[idx] = arr1[i];
        i++;
        idx++;
      }
      if (arr1[i] > arr2[j]) {
        result[idx] = arr2[j];
        j++;
        idx++;
      }
    }
    for (int x = i; x < n; x++) {
      result[idx] = arr1[x];
      idx++;
    }
    for (int y = j; y < m; y++) {
      result[idx] = arr2[y];
      idx++;
    }
    for (int z = 0; z < result.length; z++) {
      System.out.print(result[z] + " ");
    }
  }
}
