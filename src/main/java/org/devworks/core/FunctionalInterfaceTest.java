package org.devworks.core;

public class FunctionalInterfaceTest {
  public static void main(String[] args) {
    FunctionalInterface add = (a, b) -> a + b;

    int result = add.calculate(5, 3);
    System.out.println("5 + 3 = " + result);

    add.sayHello(); // calls the default method

    System.out.println("Static method returns: " + FunctionalInterface.zero());
  }
}
