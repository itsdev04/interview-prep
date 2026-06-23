package org.devworks.exceptionHandling;

import java.util.Scanner;

public class ThrowAndThrows {
  public static void main(String[] args) {
    int a[] = new int[5];
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    //        try {
    //            getNumber(a);
    //
    //        }catch(Exception e){
    //            System.out.println("catched the exception "+e.getMessage());
    //        }
    try {
      if (age > 10) {
        throw new Exception();
      }
    } catch (Exception e) {
      System.out.println("catching the exception");
    }
  }
  //    static int getNumber(int a[]) throws ArithmeticException{
  //        return a[8];
  //    }

}
