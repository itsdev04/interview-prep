package org.devworks.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeat {
  public static char firstNonRepeating(String string) {
    Map<Character, Integer> map = new HashMap<>();
    char[] chars = string.toCharArray();
    for (char c : chars) {
      map.put(new Character(c), map.getOrDefault(c, 0) + 1);
    }
    System.out.print(map);

    Character unique = null;
    for (Map.Entry entry : map.entrySet()) {
      if (entry.getValue().equals(1)) {
        unique = (char) entry.getKey();
      }
    }
    return unique;
  }

  public static void main(String[] args) {
    String s = "Hello world !!";
    System.out.print(firstNonRepeating(s));
  }
}
