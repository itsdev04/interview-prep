package org.devworks.string;

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str = sc.next();

    // normal reverse method
    String rev = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      rev = rev + str.charAt(i);
    }
    if (str.equals(rev)) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    // last character matching method
    //        int flag = 0;
    //        for(int i=0; i<str.length()/2; i++){
    //            if(str.charAt(i) == str.charAt(str.length()-(i+1))){
    //                flag = 1;
    //            }
    //        }
    //        if(flag == 1){
    //            System.out.println("yes");
    //        }else{
    //            System.out.println("no");
    //        }
  }
}
