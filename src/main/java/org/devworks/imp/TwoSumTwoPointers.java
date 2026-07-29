package org.devworks.imp;

public class TwoSumTwoPointers {
  private static int[] twoSumSorted(int[] nums, int target) {
    if (nums == null || nums.length < 2) return new int[] {};

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int currentSum = nums[left] + nums[right];
      if (currentSum == target) return new int[] {left, right};
      else if (currentSum < target) {
        left++;
      } else {
        right--;
      }
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] result = twoSumSorted(nums, target);

    if (result.length == 2) {
      System.out.println("Indices found: [" + result[0] + ", " + result[1] + "]");
    } else {
      System.out.println("No pair found.");
    }
  }
}
