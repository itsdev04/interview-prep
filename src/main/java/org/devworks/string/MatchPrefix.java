package org.devworks.string;

public class MatchPrefix {
  public static void main(String[] args) {
    String[] arr = {"Jackson", "Jacques", "Jack", "Jackma"};
    String query = "Jack";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].length() > query.length()) {
        String temp = arr[i].substring(0, 4);
        if (temp.equals(query)) {
          System.out.println(arr[i]);
        }
      }
    }
  }
}
