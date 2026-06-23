package org.devworks.designpattern.strategy;

public class FestivalDiscount implements DiscountStrategy {
  @Override
  public double applyDiscount(double price) {
    return price * 0.9;
  }
}
