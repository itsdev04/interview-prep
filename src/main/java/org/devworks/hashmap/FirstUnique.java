package org.devworks.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUnique {
  public static void main(String[] args) {
    String s = "Hello world !!";
    Map<Character, Integer> map = new LinkedHashMap<>();

    char[] array = s.toCharArray();
    for (int i = 0; i < array.length; i++) {
      char c = array[i];
      if (!map.containsKey(c)) {
        map.put(c, 1);
      } else {
        map.put(c, map.get(c) + 1);
      }
    }
    System.out.print(map);

    for (char c : s.toCharArray()) {
      if (map.get(c) == 1) {
        System.out.print(c);
        break;
      }
    }

    for (Map.Entry<Character, Integer> entrySet : map.entrySet()) {
      if (entrySet.getValue() == 1) {
        System.out.print(entrySet.getKey());
        break;
      }
    }
  }
}
