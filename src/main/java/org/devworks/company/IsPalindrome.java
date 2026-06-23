package org.devworks.company;

public class IsPalindrome {
  public static void main(String[] args) {
    int num = 21212;
    int temp = num;
    if (num < 0) {
      System.out.println("Invalid Input");
    }
    int rev = 0;
    while (num > 0) {
      int rem = num % 10;
      rev = rev * 10 + rem;
      num = num / 10;
    }
    if (temp == rev) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a Palindrome");
    }
  }
}
