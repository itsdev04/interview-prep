package org.devworks.core;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
  // the single abstract method
  int calculate(int a, int b);

  // default method (does not count as abstract)
  default void sayHello() {
    System.out.println("Hello from Calculator");
  }

  // static method (also allowed)
  static int zero() {
    return 0;
  }
}
