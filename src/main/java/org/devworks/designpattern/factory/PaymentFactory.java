package org.devworks.designpattern.factory;

public class PaymentFactory {
  public static Payment getPayment(String type) {
    if (type == null) return null;
    switch (type) {
      case "Credit Card":
        return new CrediCardPayment();
      case "UPI":
        return new UPIPayment();
    }
    return null;
  }
}
