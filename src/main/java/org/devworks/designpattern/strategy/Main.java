package org.devworks.designpattern.strategy;

public class Main {
  public static void main(String[] args) {
    Checkout checkout = new Checkout(new NewUserDiscount());
    System.out.print("Final price = " + checkout.calculateFinalPrice(100.00));
  }
}

// Advantages
// 1.Makes the code flexible and easier to extend
// 2.Avoids complex if-else conditions
// 3.You can easily add new strategies without modifying existing ones.
//
// It shows understanding of Open/Closed Principle (open for extensions , closed for modifications)
