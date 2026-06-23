package org.devworks.company;

import java.util.*;

public class CommonEmployees {
  public static void intersection(int[] arr1, int[] arr2) {
    Set<Integer> set = new LinkedHashSet<>();
    for (int num : arr1) {
      set.add(num);
    }
    List<Integer> list = new ArrayList<>();
    for (int num : arr2) {
      if (set.contains(num)) {
        list.add(num);
        set.remove(num);
      }
    }
    if (list.isEmpty()) {
      System.out.println("No Common Employee");
    } else {
      for (int num : list) {
        System.out.print(num + " ");
      }
    }
  }

  public static void main(String[] args) {
    int n1 = 4;
    int n2 = 4;
    int arr1[] = {1, 2, 3, 4};
    int arr2[] = {3, 4, 5, 6};
    intersection(arr1, arr2);
  }
}
