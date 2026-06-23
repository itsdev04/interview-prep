package org.devworks.string;

import java.util.Scanner;

public class CapitalStartingWordInSentence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char arr[] = str.toCharArray();
    if (arr.length > 0) {
      arr[0] = Character.toUpperCase(arr[0]);
    }
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == ' ' && arr[i + 1] != ' ') {
        arr[i + 1] = Character.toUpperCase(arr[i + 1]);
      }
    }
    String string = new String(arr);
    System.out.println(string);
  }
}
