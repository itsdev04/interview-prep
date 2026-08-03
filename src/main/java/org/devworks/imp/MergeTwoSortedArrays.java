package org.devworks.imp;

public class MergeTwoSortedArrays {
  public static void main(String[] args) {

    int arr1[] = {2, 4, 6, 8, 10, 12, 16};
    int arr2[] = {1, 3, 5, 7, 9};

    int m = arr1.length;
    int n = arr2.length;

    int[] res = new int[m + n];
    int i = 0;
    int j = 0;
    int index = 0;
    while (i < m && j < n) {
      if (arr1[i] < arr2[j]) {
        res[index] = arr1[i];
        i++;
        index++;
      } else {
        res[index] = arr2[j];
        j++;
        index++;
      }
    }
    for (int x = i; x < m; x++) {
      res[index] = arr1[x];
      index++;
    }

    for (int y = j; y < n; y++) {
      res[index] = arr2[y];
      index++;
    }

    for (int z = 0; z < index; z++) {
      System.out.print(res[z] + " ");
    }
  }
}
