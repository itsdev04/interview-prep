package org.devworks.string;

public class NoOfChar {
  public static void main(String[] args) {
    String s = "java language";
    int count = s.length();
    int newCount = s.replace("a", "").length();
    int occur = count - newCount;
    System.out.println(occur);
  }
}
