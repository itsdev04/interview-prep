package org.devworks.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NthHighest {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 5, 8, 8, 10, 2);
    Integer nthHighest =
        numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();

    System.out.print(nthHighest);
  }
}
