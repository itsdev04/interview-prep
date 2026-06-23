package org.devworks.company;

import java.util.ArrayList;
import java.util.List;

// Jack was playing with his kid, and suddenly he realized that in a sting cortaring English letter
// and number, whenever there is a change from number to leter and hon letter to number, his kid
// marks that elements. By defaul, he always mars the fist
//        element of the string.
//        You have to make a new string from these highlighted ones where al the Engish
// @sletters are on the let sde and al he nuntesaeon igi sted lestnyrld
//        is to retur the final string.
//        "Input Specification:
//        input1: A string value S representing the alphanumeric sting-
//        Output Specification:
//        Retum a string value based on above mentioned logic
//        Example 1:
//        inputt: ABC 120PMO00L23MB1/3C45
//        Output : APLMYC103134
public class JackProblem {
  public static String newString(String s) {
    List<Character> list = new ArrayList<>();
    list.add(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      char prev = s.charAt(i - 1);
      char curr = s.charAt(i);
      Boolean isPrevDigit = Character.isDigit(prev);
      Boolean isCurrDigit = Character.isDigit(curr);
      Boolean isprevLetter = Character.isLetter(prev);
      Boolean isCurrLetter = Character.isLetter(curr);

      if ((isprevLetter && isCurrDigit) || (isPrevDigit && isCurrLetter)) {
        list.add(curr);
      }
    }
    StringBuilder letters = new StringBuilder();
    StringBuilder numbers = new StringBuilder();

    for (char ch : list) {
      if (Character.isDigit(ch)) {
        numbers.append(ch);
      } else if (Character.isLetter(ch)) {
        letters.append(ch);
      }
    }
    return letters.toString() + numbers.toString();
  }

  public static void main(String[] args) {
    String s = "ABC120PME0000LZ3MB1Y3C45";
    System.out.println(newString(s));
  }
}
