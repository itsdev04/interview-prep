package org.devworks.thread;

import java.util.concurrent.*;

public class ParallelDataFetcher {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(3);

    long startTime = System.currentTimeMillis();

    Callable<String> fetchUser =
        () -> {
          Thread.sleep(1000);
          return "User: Alex";
        };

    Callable<String> fetchOrders =
        () -> {
          Thread.sleep(1500);
          return "Orders: 3 active";
        };

    Callable<String> fetchInventory =
        () -> {
          Thread.sleep(800);
          return "Inventory: In Stock";
        };

    try {
      Future<String> userFuture = executor.submit(fetchUser);
      Future<String> orderFuture = executor.submit(fetchOrders);
      Future<String> inventoryFuture = executor.submit(fetchInventory);

      System.out.print("All tasks submitted! Waiting for results");

      String user = userFuture.get();
      String orders = orderFuture.get();
      String inventory = inventoryFuture.get();

      long totalTime = System.currentTimeMillis() - startTime;

      System.out.println("\n--- Results ---");
      System.out.println(user);
      System.out.println(orders);
      System.out.println(inventory);
      System.out.println("Total Execution Time: " + totalTime + " ms");
      // Output will be ~1500ms instead of 3300ms (1000 + 1500 + 800) because they ran in parallel!
    } catch (InterruptedException | ExecutionException e) {
      System.err.println("Task execution failed: " + e.getMessage());
    } finally {
      // 5. ALWAYS shut down your executor, otherwise the JVM main thread will never exit
      executor.shutdown();
    }
  }
}
