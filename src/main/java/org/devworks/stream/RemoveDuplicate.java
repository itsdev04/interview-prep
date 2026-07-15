package org.devworks.stream;

import java.util.stream.Collectors;

public class RemoveDuplicate {
  public static void main(String[] args) {
    String input = "Hello World!";
    String result =
        input
            .chars() // Returns an IntStream of characters
            .distinct() // Filters out duplicate characters
            .mapToObj(c -> String.valueOf((char) c)) // Convert int back to String character
            .collect(Collectors.joining()); // Join them back into a single String

    System.out.print(result);
  }
}
