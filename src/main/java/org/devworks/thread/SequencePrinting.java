package org.devworks.thread;

public class SequencePrinting {

  private static final Object lock = new Object();
  private static boolean t1Turn = true;

  public static void main(String[] args) {
    String letters = "abc";
    String numbers = "123";

    Thread t1 =
        new Thread(
            () -> {
              for (char c : letters.toCharArray()) {
                synchronized (lock) {
                  while (!t1Turn) {
                    try {
                      lock.wait();
                    } catch (InterruptedException ex) {
                      ex.printStackTrace();
                    }
                  }
                  System.out.print(c);
                  t1Turn = false;
                  lock.notify();
                }
              }
            });

    Thread t2 =
        new Thread(
            () -> {
              for (char c : numbers.toCharArray()) {
                synchronized (lock) {
                  while (t1Turn) {
                    try {
                      lock.wait();
                    } catch (InterruptedException ex) {
                      ex.printStackTrace();
                    }
                  }
                  System.out.print(c);
                  t1Turn = true;
                  lock.notify();
                }
              }
            });
    t1.start();
    t2.start();
  }
}
