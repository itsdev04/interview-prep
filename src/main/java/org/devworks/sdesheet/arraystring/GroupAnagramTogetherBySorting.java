package org.devworks.sdesheet.arraystring;

import java.util.*;

public class GroupAnagramTogetherBySorting {

  private static String sort(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }

  static List<List<String>> groupAnagramCategorizedBySorting(String[] strs) {

    if (strs == null || strs.length == 0) return new ArrayList<>();

    Map<String, List<String>> sortedStringHashMap = new HashMap<>();

    for (String str : strs) {
      String sortedString = sort(str);
      if (sortedStringHashMap.containsKey(sortedString)) {
        sortedStringHashMap.get(sortedString).add(str);
      } else {
        List<String> stringList = new ArrayList<>();
        stringList.add(sortedString);
        sortedStringHashMap.put(sortedString, stringList);
      }
    }

    for (Map.Entry<String, List<String>> entry : sortedStringHashMap.entrySet()) {
      System.out.println(entry.getKey() + "->" + entry.getValue());
    }

    return new ArrayList<>(sortedStringHashMap.values());
  }

  public static void main(String[] args) {
    String[] strs = {"act", "god", "cat", "dog", "tac"};
    List<List<String>> res = groupAnagramCategorizedBySorting(strs);
    System.out.print(res);
  }
}
