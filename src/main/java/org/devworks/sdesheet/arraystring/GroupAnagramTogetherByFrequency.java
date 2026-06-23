package org.devworks.sdesheet.arraystring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramTogetherByFrequency {

  private static String getFrequencyString(String s) {
    int[] freq = new int[25];

    for (char c : s.toCharArray()) {
      freq[c - 'a']++;
    }

    StringBuilder frequencyString = new StringBuilder("");
    char c = 'a';

    for (int i : freq) {
      frequencyString.append(c);
      frequencyString.append(i);
      c++;
    }

    return frequencyString.toString();
  }

  private static List<List<String>> groupAnagramCategorizedByFrequency(String[] strs) {

    if (strs == null || strs.length == 0) return new ArrayList<>();
    Map<String, List<String>> frequencyStringMap = new HashMap<>();

    for (String str : strs) {
      String frequencyString = getFrequencyString(str);
      if (frequencyStringMap.containsKey(frequencyString)) {
        frequencyStringMap.get(frequencyString).add(str);
      } else {
        // create a new list
        List<String> strings = new ArrayList<>();
        strings.add(str);
        frequencyStringMap.put(frequencyString, strings);
      }
    }

    return new ArrayList<>(frequencyStringMap.values());
  }

  public static void main(String[] args) {
    String[] strs = {"act", "god", "cat", "dog", "tac"};
    List<List<String>> list = groupAnagramCategorizedByFrequency(strs);
    list.stream().forEach(System.out::print);
  }
}
