package org.devworks.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValueStream {
  public static void main(String[] args) {
    Map<String, Integer> inventory = new HashMap<>();
    inventory.put("Shoes", 50);
    inventory.put("Hats", 10);
    inventory.put("Shirts", 85);
    inventory.put("Socks", 5);

    Map<String, Integer> sortedInventory =
        inventory.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(
                Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (oldValue, newValue) -> oldValue,
                    LinkedHashMap::new));

    System.out.print(sortedInventory);
  }
}
