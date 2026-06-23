package org.devworks.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqEachElementInArray {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 3, 4, 1, 4, 5, 1, 2};
    Map<Integer, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times ");
    }
  }
}
