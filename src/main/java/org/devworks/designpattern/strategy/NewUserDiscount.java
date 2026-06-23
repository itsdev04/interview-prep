package org.devworks.designpattern.strategy;

public class NewUserDiscount implements DiscountStrategy {
  @Override
  public double applyDiscount(double price) {
    return price * 0.8;
  }
}
