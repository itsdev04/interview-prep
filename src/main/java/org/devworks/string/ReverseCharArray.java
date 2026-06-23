package org.devworks.string;

public class ReverseCharArray {
  public static void reverseString(char[] s) {
    char[] rev = new char[s.length];
    int c = 0;
    for (int i = s.length - 1; i >= 0; --i) {
      rev[c] = s[i];
      c++;
    }
    for (int i = 0; i < s.length; i++) {
      System.out.println(rev[i]);
    }
  }

  public static void main(String[] args) {
    char[] arr = new char[] {'h', 'e', 'l', 'l', 'o'};
    reverseString(arr);
  }
}
