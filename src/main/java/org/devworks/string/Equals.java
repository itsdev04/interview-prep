package org.devworks.string;

public class Equals {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s2));
  }
}
