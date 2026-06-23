package org.devworks.exceptionHandling;

public class FinallyBlock {
  public static void main(String[] args) {
    int arr[] = new int[5];
    try {
      System.out.println(arr[8]);
    } catch (Exception e) {
      System.out.println("Exceptions Handled");
    } finally {
      System.out.println("Finally block will run always");
    }
  }
}
