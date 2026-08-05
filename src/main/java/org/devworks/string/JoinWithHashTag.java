package org.devworks.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWithHashTag {
  public static void main(String[] args) {
    String str = "Hello world Java";
   String[] s = str.split(" ");
    List<String> words = Arrays.asList(s);
    String collect =
        "#"
            + words.stream()
                .map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1))
                .collect(Collectors.joining());

    System.out.print(collect);
  }
}
