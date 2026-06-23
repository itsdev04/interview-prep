package org.devworks.string;

public class RhymicWords {
  public static void main(String[] args) {
    String str[] = {"ring", "king", "grill", "bring", "shrink"};
    String word = "ping";
    String result = "";
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(word.length() - 1 - i);
      for (int j = 0; j < str.length; j++) {
        if (ch == str[j].charAt(str[j].length() - 1 - j)) {
          result += ch;
        }
      }
    }
    String rhyme = "";
    for (int i = result.length() - 1; i >= 0; i--) {
      rhyme += result.charAt(i);
    }
    for (String words : str) {
      if (words.endsWith(rhyme)) {

        System.out.print(words + " ");
      }
    }
  }
}
