package org.devworks.imp;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

  // Doubly Linked List Node
  private static class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  private final int capacity;
  private final Map<Integer, Node> map;
  private final Node head;
  private final Node tail;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.map = new HashMap<>();

    // Initialize dummy head and tail nodes
    this.head = new Node(-1, -1);
    this.tail = new Node(-1, -1);
    head.next = tail;
    tail.prev = head;
  }

  public int get(int key) {
    if (!map.containsKey(key)) {
      return -1;
    }

    Node node = map.get(key);
    moveToHead(node); // Move accessed node to head (Mark as Most Recently Used)

    return node.value;
  }

  public void put(int key, int value) {
    if (map.containsKey(key)) {
      // Key exists: update value and move to head
      Node node = map.get(key);
      node.value = value;
      moveToHead(node);
    } else {
      // New key
      if (map.size() >= capacity) {
        // Cache full: evict LRU item from tail
        Node lru = tail.prev;
        removeNode(lru);
        map.remove(lru.key);
      }

      Node newNode = new Node(key, value);
      map.put(key, newNode);
      addNodeToHead(newNode);
    }
  }

  // Helper 1: Remove an existing node from the doubly linked list
  private void removeNode(Node node) {
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }

  // Helper 2: Insert node right after the dummy head
  private void addNodeToHead(Node node) {
    node.next = head.next;
    node.prev = head;
    head.next.prev = node;
    head.next = node;
  }

  // Helper 3: Move existing node to head
  private void moveToHead(Node node) {
    removeNode(node);
    addNodeToHead(node);
  }

  // Helper method to print current state of cache from MRU to LRU
  public void printCacheState() {
    System.out.print("Cache State (MRU -> LRU): ");
    Node curr = head.next;
    while (curr != tail) {
      System.out.print("[" + curr.key + ":" + curr.value + "] ");
      curr = curr.next;
    }
    System.out.println();
  }

  // Main Method to test the execution flow
  public static void main(String[] args) {
    System.out.println("--- Initializing LRU Cache with Capacity = 2 ---");
    LRUCache cache = new LRUCache(2);

    System.out.println("\n1. put(1, 1)");
    cache.put(1, 1);
    cache.printCacheState();

    System.out.println("\n2. put(2, 2)");
    cache.put(2, 2);
    cache.printCacheState();

    System.out.println("\n3. get(1): Returns " + cache.get(1) + " (Key 1 becomes MRU)");
    cache.printCacheState();

    System.out.println("\n4. put(3, 3) -> Evicts Key 2 (LRU)");
    cache.put(3, 3);
    cache.printCacheState();

    System.out.println("\n5. get(2): Returns " + cache.get(2) + " (Not found)");

    System.out.println("\n6. put(4, 4) -> Evicts Key 1 (LRU)");
    cache.put(4, 4);
    cache.printCacheState();

    System.out.println("\n7. get(1): Returns " + cache.get(1) + " (Not found)");
    System.out.println("8. get(3): Returns " + cache.get(3) + " (Key 3 becomes MRU)");
    cache.printCacheState();

    System.out.println("9. get(4): Returns " + cache.get(4) + " (Key 4 becomes MRU)");
    cache.printCacheState();
  }
}
