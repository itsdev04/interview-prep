package org.devworks.designpattern.observer;

public class Main {
  public static void main(String[] args) {
    StockMarket stockMarket = new StockMarket();
    stockMarket.register(new MobileDisplay());
    stockMarket.register(new WebDisplay());

    stockMarket.notifyAllObserver("TCS", 3675.35);
  }
}
