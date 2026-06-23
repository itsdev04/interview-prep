package org.devworks.company;

import java.util.Arrays;
import java.util.Scanner;

// In school, tables are arranged in an N × M grid format.
//        Each table has a seating capacity for 2 students.
//        You are given an array of student names, they will be seated in alphabetical order
//        row-wise across the tables. The seating starts from the top-left corner and proceeds
//        left-to-night in each. row. Your task is to find and return a string value representing
//        the table position (row, agicolumn) for a specific student in this arrangement. If the
// student
//        is not found in the list or if the seating capacity has been exceeded, return (-1,-1) as a
public class PositionOfStudent {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 2;
    int m = 3;
    String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h"};
    String target = "g";
    System.out.println(fetchPosition(n, m, arr, target));
  }

  private static String fetchPosition(int n, int m, String[] arr, String target) {
    Arrays.sort(arr);
    //        for(int i=0; i<arr.length; i++){
    //            System.out.println(arr[i]);
    //        }
    int row = 0, col = 0;
    if (n * m * 2 < arr.length) {
      return "(-1,-1)";
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        int tableIndex = i / 2;
        row = (tableIndex / m);
        col = (tableIndex % m);
      }
    }
    return "(" + row + "," + col + ")";
  }
}
