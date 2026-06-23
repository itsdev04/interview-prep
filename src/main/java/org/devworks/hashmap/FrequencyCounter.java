package org.devworks.hashmap;

import java.util.HashMap;

public class FrequencyCounter {
  public static void main(String[] args) {
    String s = "Hello world!!";
    char[] charArray = s.toCharArray();

    HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

    for (int i = 0; i < charArray.length; i++) {
      char c = charArray[i];
      if (!hashMap.containsKey(c)) {
        hashMap.put(c, 1);
      } else {
        hashMap.put(c, hashMap.get(c) + 1);
      }
    }

    System.out.print(hashMap);
  }
}
