package org.devworks.numbers;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  private static int[] solve(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] {map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    int arr[] = {4, 5, 6};
    int target = 10;
    int[] result = solve(arr, target);
    System.out.print(result[0] + "," + result[1]);
  }
}
