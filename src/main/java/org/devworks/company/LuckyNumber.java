package org.devworks.company;
// Jack has been interested in numerology for a while and has learned how to calculate a lucky
// number for a given
// word using the rules below:
// 1. Each alphabet in the word has an ASCII value (where 'A' = 65, 'B' = 66, ...' = 90(a) = 97,
// etc.).
// 2. Each letter in the word is assigned a 1-based index (i.e., the first letter has index 1, the
// second letter has index
//  2, and so on).
// 3. The lucky number is calculated as follows:
// 4. Multiply each character's ASCII value by its 1-based index.
// 5. Include this product in the sum only if either the index or the ASCIl value (or both) are odd.

import java.util.LinkedHashMap;
import java.util.Map;

public class LuckyNumber {
  public static int luckyNumber(String s) {
    Map<Integer, Integer> map = new LinkedHashMap<>();
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      map.put(i + 1, (int) ch);
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getKey() % 2 == 1 || entry.getValue() % 2 == 1) {
        sum += (entry.getKey() * entry.getValue());
      }
    }
    System.out.println(map);
    return sum;
  }

  public static void main(String[] args) {
    String str = "Jacky";
    System.out.println(luckyNumber(str));
  }
}
