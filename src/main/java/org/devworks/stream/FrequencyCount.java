package org.devworks.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {
  public static void main(String[] args) {

    // Frequency of character
    String input = "Hello world !!";

    Map<Character, Long> charCount =
        input
            .chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    System.out.print(charCount);

    // Frequency of word
    List<String> items = Arrays.asList("apple", "apple", "banana", "cherry", "banana", "apple");
    Map<String, Long> map =
        items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.print(map);
  }
}
