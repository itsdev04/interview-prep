package org.devworks.string;

import java.util.*;

// not completed
public class SortByValue {
  public static void main(String[] args) {
    String str = "Hello good night";
    str = str.replaceAll(" ", "");
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < str.length(); i++) {
      if (map.containsKey(str.charAt(i))) {
        map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
      } else {
        map.put(str.charAt(i), 1);
      }
    }
    List<Map.Entry<Character, Integer>> entrySet = new ArrayList<>(map.entrySet());
    Collections.sort(entrySet, Map.Entry.comparingByValue());

    Map<Character, Integer> sortedMap = new LinkedHashMap<>();
    for (Map.Entry<Character, Integer> entry : entrySet) {
      sortedMap.put(entry.getKey(), entry.getValue());
    }
    System.out.println(sortedMap);
  }
}
