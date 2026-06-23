package org.devworks.company;

import java.util.Scanner;

public class BillProblem {
  public static int calculateBill(int pizza, int puffs, int drinks) {
    int sum = (100 * pizza) + (20 * puffs) + (10 * drinks);
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of pizzas bought: ");
    int pizza = sc.nextInt();
    System.out.println("Enter the number of puffs bought: ");
    int puffs = sc.nextInt();
    System.out.println("Enter the number of cool drinks bought: ");
    int drinks = sc.nextInt();

    // bill
    int totalBill = calculateBill(pizza, puffs, drinks);
    System.out.println("Number of pizzas: " + pizza);
    System.out.println("Number of puffs: " + puffs);
    System.out.println("Number of cooldrinks: " + drinks);
    System.out.println("Total price: " + totalBill);
  }
}
