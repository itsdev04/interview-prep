package org.devworks.string;

public class ValidPalindrome {
  public static boolean isValid(String str) {
    int flag = 0;
    str = str.replaceAll(" ", "");
    str = str.replaceAll("[^a-zA-Z0-9 ]", "");
    String rev = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      rev += str.charAt(i);
    }
    if (str.equals(rev)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    String str = "Was it a car or a cat I saw?";
    str = str.toLowerCase();
    System.out.println(isValid(str));
  }
}
