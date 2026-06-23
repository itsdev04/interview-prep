package org.devworks.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicate {

  private static String removeDuplicate(String s) {

    Map<Character, Integer> map = new LinkedHashMap<>();
    char[] chars = s.toCharArray();

    for (int i = 0; i < s.length(); i++) {
      if (!map.containsKey(chars[i])) {
        map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
      }
    }

    String unique = "";
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        unique = unique + entry.getKey();
      }
    }
    return unique;
  }

  public static void main(String[] args) {
    String s = "madam";
    System.out.print(removeDuplicate(s));
  }
}
