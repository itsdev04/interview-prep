package org.devworks.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestSubstring {
  public static void main(String[] args) {
    System.out.println("Enter the string");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int LongestLength = 0;
    String Longest = null;
    Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
    char arr[] = s.toCharArray();
    for (int i = 0; i < s.length(); i++) {
      char ch = arr[i];
      if (!map.containsKey(ch)) {
        map.put(ch, i);
      } else {
        i = map.get(ch);
        map.clear();
      }
      if (map.size() > LongestLength) {
        LongestLength = map.size();
        Longest = map.keySet().toString();
      }
    }
    System.out.println("Substring : " + Longest);
    System.out.println("Length : " + LongestLength);
    String str = Longest.toString();
  }
}
