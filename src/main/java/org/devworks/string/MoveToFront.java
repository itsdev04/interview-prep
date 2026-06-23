package org.devworks.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveToFront {

  private static String solveByStream(String string) {
    List<Character> characterList = new ArrayList<>();
    for (int i = 0; i < string.length(); i++) {
      characterList.add(string.charAt(i));
    }

    List<Character> concat =
        Stream.concat(
                characterList.stream().filter(character -> character == '#'),
                characterList.stream().filter(character -> character != '#'))
            .collect(Collectors.toList());

    String result = "";
    for (int i = 0; i < concat.size(); i++) {
      result += concat.get(i);
    }

    return result;
  }

  public static String solve(String str) {
    String finalStr = "";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '#') {
        count++;
      } else {
        finalStr += str.charAt(i);
      }
    }
    for (int i = 0; i < count; i++) {
      finalStr = '#' + finalStr;
    }
    return finalStr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String containsHash = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '#') {
        containsHash += str.charAt(i);
      }
    }
    String notContainingHash = str.replaceAll("#", "");
    System.out.println(containsHash + notContainingHash);
    System.out.println(solve(str));

    System.out.println(solveByStream(str));
  }
}
