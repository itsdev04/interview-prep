package org.devworks.designpattern.singleton;

public class SingletonDoubleCheckLock {
  public static SingletonDoubleCheckLock singleton;

  private SingletonDoubleCheckLock() {}

  public static SingletonDoubleCheckLock getInstance() {
    if (singleton == null) {
      synchronized (SingletonDoubleCheckLock.class) {
        if (singleton == null) {
          singleton = new SingletonDoubleCheckLock();
        }
      }
    }
    return singleton;
  }

  public static void main(String[] args) {
    SingletonDoubleCheckLock singleton1 = null;
    singleton1 = SingletonDoubleCheckLock.getInstance();
    System.out.println(singleton1);

    SingletonDoubleCheckLock singleton2 = null;
    singleton2 = SingletonDoubleCheckLock.getInstance();
    System.out.println(singleton2);

    System.out.print(singleton1.equals(singleton2));
  }
}
