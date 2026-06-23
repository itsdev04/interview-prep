package org.devworks.designpattern.factory;

public class CrediCardPayment implements Payment {
  @Override
  public void pay() {
    System.out.print("Payment to be made using Credit Card");
  }
}
