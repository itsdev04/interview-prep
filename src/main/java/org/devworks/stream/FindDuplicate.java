package org.devworks.stream;

import java.util.stream.Collectors;

public class FindDuplicate {
  public static void main(String[] args) {
    String input = "Hello World!";

    input.chars() // Returns an IntStream of characters
        .mapToObj(c -> (char) c) // Convert int to Character
        .collect(
            Collectors.groupingBy(c -> c, Collectors.counting())) // Group and count occurrences
        .entrySet().stream()
        .filter(entry -> entry.getValue() > 1) // Filter out non-duplicates
        .forEach(
            entry ->
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times"));
  }
}
