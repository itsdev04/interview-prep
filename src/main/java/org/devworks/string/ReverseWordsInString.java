package org.devworks.string;

public class ReverseWordsInString {
  public static void main(String[] args) {
    String s = "  a good   example ";
    System.out.println(reverse(s));
  }

  private static String reverse(String s) {
    String[] str = s.split(" ");
    String result = "";
    for (int i = str.length - 1; i >= 0; i--) {
      result += str[i];
      if (i != 0) {
        result += " ";
      }
    }
    return result;
  }
}
