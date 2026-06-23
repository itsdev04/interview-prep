package org.devworks.string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
  private static boolean isAnagram(String s1, String s2) {
    Map<Character, Integer> map1 = new HashMap<>();
    char[] c1 = s1.toCharArray();
    for (char c : c1) {
      map1.put(new Character(c), map1.getOrDefault(c, 0) + 1);
    }

    Map<Character, Integer> map2 = new HashMap<>();
    char[] c2 = s2.toCharArray();
    for (char c : c2) {
      map2.put(new Character(c), map2.getOrDefault(c, 0) + 1);
    }

    return map1.equals(map2);
  }

  public static void main(String[] args) {
    String s1 = "listen";
    String s2 = "silent";
    System.out.print(isAnagram(s1, s2));
  }
}
