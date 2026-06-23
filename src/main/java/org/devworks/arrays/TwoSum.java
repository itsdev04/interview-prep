package org.devworks.arrays;

import java.util.ArrayList;
import java.util.List;

// returning index
public class TwoSum {
  public static List<Integer> twoSum(int arr[], int target) {
    List list = new ArrayList();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          list.add(i);
          list.add(j);
        }
      }
    }
    return list;
  }

  public static void main(String[] args) {
    int arr[] = {4, 5, 6};
    int target = 10;
    System.out.println(twoSum(arr, target));
  }
}
