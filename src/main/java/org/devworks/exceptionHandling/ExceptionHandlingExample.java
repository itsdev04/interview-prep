package org.devworks.exceptionHandling;

public class ExceptionHandlingExample {
  public static void main(String[] args) {
    int arr[] = new int[5];
    System.out.println("Hello guys");
    System.out.println(arr[8]);
    System.out.println("Bye guys"); // won't be printed
  }
}
