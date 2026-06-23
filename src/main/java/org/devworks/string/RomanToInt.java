package org.devworks.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
  public static int romanToInteger(String s) {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      int value = map.get(s.charAt(i));
      if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
        result -= value;
      } else {
        result += value;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(romanToInteger(str));
  }
}
