package org.devworks.thread;

import java.util.concurrent.CompletableFuture;

public class ParallelBatchExecution {

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();

    // Task 1: Fetch User Info (simulating 1 sec delay)
    CompletableFuture<String> userFuture =
        CompletableFuture.supplyAsync(
            () -> {
              sleep(1000);
              return "John Doe";
            });

    // Task 2: Fetch Order Info (simulating 1.5 sec delay)
    CompletableFuture<String> ordersFuture =
        CompletableFuture.supplyAsync(
            () -> {
              sleep(1500);
              return "3 Orders [Laptop, Mouse, Keyboard]";
            });

    // Combine both independent futures when both complete
    CompletableFuture<String> summaryFuture =
        userFuture.thenCombine(
            ordersFuture, (user, orders) -> "User: " + user + " | History: " + orders);

    // Block & get result (or handle asynchronously)
    System.out.println(summaryFuture.join());

    long totalTime = System.currentTimeMillis() - startTime;
    // Output total time (~1.5s total instead of 2.5s sequentially!)
    System.out.println("Completed in: " + totalTime + " ms");
  }

  private static void sleep(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}
