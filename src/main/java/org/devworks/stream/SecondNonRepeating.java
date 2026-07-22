package org.devworks.stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondNonRepeating {
  public static void main(String[] args) {
    String input = "Programming";

    Character character =
        input.chars().mapToObj(c -> (char) c)
            .collect(
                Collectors.groupingBy(
                    Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .skip(1)
            .findFirst()
            .get()
            .getKey();

    System.out.print(character);
  }
}
