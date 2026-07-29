package org.devworks.imp;

import java.util.*;

public class ThreeSumBruteForce {

  private static Set<List<Integer>> threeSumBruteForce(int[] nums, int target) {

    Set<List<Integer>> ans = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
            ans.add(list);
          }
        }
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] nums = {-1, 0, 1, 2, -1};
    int target = 0;

    System.out.print(threeSumBruteForce(nums, target));
  }
}
