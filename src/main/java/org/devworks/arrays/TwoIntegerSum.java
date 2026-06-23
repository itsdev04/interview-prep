package org.devworks.arrays;

import java.util.ArrayList;
import java.util.List;

// returning element
public class TwoIntegerSum {
  public static List<Integer> sum(int arr[], int target) {
    List list = new ArrayList();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          list.add(arr[i]);
          list.add(arr[j]);
        }
      }
    }
    return list;
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 4, 6, 10};
    int target = 8;
    System.out.println(sum(arr, target));
  }
}
