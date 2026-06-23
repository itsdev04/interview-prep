package org.devworks.company;

public class ReverseInteger {
  public static void main(String[] args) {
    // reverse integer
    int num = 12345;
    int rev = 0;
    while (num > 0) {
      int rem = num % 10;
      rev = rev * 10 + rem;
      num = num / 10;
    }
    System.out.println(rev);

    // reverse string
    String str = "abcde";
    String revStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      revStr = revStr + str.charAt(i);
    }
    System.out.println(revStr);
  }
}
