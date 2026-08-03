package org.devworks.imp;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
  private static boolean isValid(String s) {
    if (s == null || s.length() % 2 != 0) return false; // Odd length can never be balanced

    Deque<Character> stack = new ArrayDeque<>();
    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(')');
      } else if (c == '{') {
        stack.push('}');
      } else if (c == '[') {
        stack.push(']');
      } else if (stack.isEmpty() || stack.pop() != c) {
        return false;
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(isValid("()")); // true
    System.out.println(isValid("()[]{}")); // true
    System.out.println(isValid("(]")); // false
    System.out.println(isValid("([)]")); // false
    System.out.println(isValid("{[]}")); // false -> wait, true!
    System.out.println(isValid("]")); // false
  }
}
