package org.devworks.designpattern.factory;

public class UPIPayment implements Payment {
  @Override
  public void pay() {
    System.out.print("Payment to be made using UPI");
  }
}
