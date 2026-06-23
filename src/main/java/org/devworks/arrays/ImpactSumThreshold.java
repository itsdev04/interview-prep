package org.devworks.arrays;

public class ImpactSumThreshold {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4};
    int C = 10, maxSum = 0;
    int impactSum[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      maxSum += arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
      if (maxSum - arr[i] > C) {
        impactSum[i] = C;
      } else {
        impactSum[i] = maxSum - arr[i];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(impactSum[i] + " ");
    }
  }
}
