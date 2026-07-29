package org.devworks.imp;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashmap {

  private static int[] twoSum(int[] nums, int target) {
    if (nums == null || nums.length < 2) return new int[] {};

    Map<Integer, Integer> numMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];

      if (numMap.containsKey(complement)) {
        return new int[] {numMap.get(complement), i};
      }

      numMap.put(nums[i], i);
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] result = twoSum(nums, target);

    if (result.length == 2) {
      System.out.println("Indices found: [" + result[0] + ", " + result[1] + "]");
    } else {
      System.out.println("No pair found.");
    }
  }
}
