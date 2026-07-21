package org.devworks.thread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
  public static void main(String[] args) {

    CompletableFuture.supplyAsync(
            () -> {
              // 1. Fetch user ID asynchronously (returns a result)
              System.out.println("Fetching user ID on: " + Thread.currentThread().getName());
              return 101;
            })
        .thenApply(
            userId -> {
              // 2. Transform the result (Map: ID -> Name)
              System.out.println("Fetching user name on: " + Thread.currentThread().getName());
              return "User_" + userId;
            })
        .thenAccept(
            userName -> {
              // 3. Consume final result (does NOT return anything)
              System.out.println("Final Result: " + userName);
            })
        .exceptionally(
            ex -> {
              // 4. Catch and handle errors seamlessly
              System.err.println("Error occurred: " + ex.getMessage());
              return null;
            });

    // Keep main thread alive briefly to see async output
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ignored) {
    }
  }
}
