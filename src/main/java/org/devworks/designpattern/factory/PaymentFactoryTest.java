package org.devworks.designpattern.factory;

public class PaymentFactoryTest {
  public static void main(String[] args) {
    Payment payment = PaymentFactory.getPayment("UPI");
    payment.pay();
  }
}
