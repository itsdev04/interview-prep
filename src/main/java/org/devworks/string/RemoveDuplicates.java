package org.devworks.string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
  public static void main(String[] args) {
    System.out.println("Enter the string");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    StringBuilder sb = new StringBuilder();
    Set<Character> set = new LinkedHashSet<Character>();
    for (int i = 0; i < s.length() - 1; i++) {
      set.add(s.charAt(i));
    }
    for (Character c : set) {
      sb.append(c);
    }
    System.out.println(sb);
  }
}
