package org.devworks.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class TargetSum {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Collections.addAll(list, 5, 1, 8, 2, 7, 9);

    Collections.sort(list); // Sort in ascending order

    int n = list.size();
    int secondLargest = list.get(n - 2);

    System.out.println("Second largest element is: " + secondLargest);
  }
}
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        int target = 6;
//        int sum = 0;
//        for(int i=0; i<arr.length; i++){
//           for(int j=i+1; j<arr.length; j++){
//               if(arr[i]+arr[j]== target){
//                   System.out.println(i+" "+j);
//               }
//           }
//        }
//    }
