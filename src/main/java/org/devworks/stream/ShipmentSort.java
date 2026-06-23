package org.devworks.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShipmentSort {
  public static void main(String[] args) {
    Shipment s1 = new Shipment("1", "New York", 23);
    Shipment s2 = new Shipment("4", "Rome", 3);
    Shipment s3 = new Shipment("2", "London", 12);
    Shipment s4 = new Shipment("4", "New York", 2);
    Shipment s5 = new Shipment("5", "Australia", 12);

    List<Shipment> shipments = new ArrayList<>();
    shipments.add(s1);
    shipments.add(s2);
    shipments.add(s3);
    shipments.add(s4);
    shipments.add(s5);

    // sort by the left delivery date, left delivery date is same then sort based on city
    shipments.sort(
        Comparator.comparingInt(Shipment::getLeftDeliveryDay).thenComparing(Shipment::getCity));
    shipments.forEach(System.out::println);
  }
}
