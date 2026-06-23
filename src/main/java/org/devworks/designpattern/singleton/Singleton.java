package org.devworks.designpattern.singleton;

public class Singleton {
  private static Singleton instance;

  private Singleton() {};

  public static synchronized Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public static void main(String[] args) {
    Singleton singleton1 = null;
    singleton1 = Singleton.getInstance();
    System.out.println(singleton1);

    Singleton singleton2 = null;
    singleton2 = Singleton.getInstance();
    System.out.println(singleton2);

    System.out.print(singleton1.equals(singleton2));
  }
}
