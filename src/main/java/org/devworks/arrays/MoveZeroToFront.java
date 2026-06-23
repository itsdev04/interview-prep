package org.devworks.arrays;

public class MoveZeroToFront {
  public static void main(String[] args) {
    int num = 903020;
    int count = 0;
    String resString = "";
    String s = Integer.toString(num);
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') {
        count++;
      } else {
        resString += s.charAt(i);
      }
    }
    for (int i = 0; i < count; i++) {
      resString = '0' + resString;
    }
    System.out.println(resString);
  }
}
