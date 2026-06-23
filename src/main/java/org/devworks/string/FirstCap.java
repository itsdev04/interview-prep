package org.devworks.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstCap {
  public static void main(String[] args) {
    String[] arr = {"run", "sing", "dance"};

    Arrays.stream(arr)
        .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }
}
