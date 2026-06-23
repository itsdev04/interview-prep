package org.devworks.arrays;

import java.util.*;

public class SecondLargest {
  public static int secondLargest(int arr[]) {
    Arrays.sort(arr);
    Set<Integer> set = new LinkedHashSet<Integer>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }
    if (set.size() < 2) {
      return -1;
    } else {
      List<Integer> list = new ArrayList<Integer>(set);
      return list.get(list.size() - 2);
    }
  }

  public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter length");
    //        int n = sc.nextInt();
    //        int arr[] = new int[n];
    //        for(int i=0; i<n; i++){
    //            arr[i]=sc.nextInt();
    //        }
    //        Arrays.sort(arr);
    //        System.out.println("Second largest element is "+arr[n-2]);
    int arr[] = {10, 30, 20};
    System.out.println(secondLargest(arr));
  }
}
