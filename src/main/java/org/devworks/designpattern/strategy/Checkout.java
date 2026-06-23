package org.devworks.designpattern.strategy;

public class Checkout {
  private DiscountStrategy strategy;

  public Checkout(DiscountStrategy strategy) {
    this.strategy = strategy;
  }

  public double calculateFinalPrice(double price) {
    return strategy.applyDiscount(price);
  }
}
