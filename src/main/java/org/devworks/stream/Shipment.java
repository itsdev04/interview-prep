package org.devworks.stream;

public class Shipment {
  String id;
  String city;
  int leftDeliveryDay;

  public Shipment(String id, String city, int leftDeliveryDay) {
    this.id = id;
    this.city = city;
    this.leftDeliveryDay = leftDeliveryDay;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getLeftDeliveryDay() {
    return leftDeliveryDay;
  }

  public void setLeftDeliveryDay(int leftDeliveryDay) {
    this.leftDeliveryDay = leftDeliveryDay;
  }

  @Override
  public String toString() {
    return "Shipment{"
        + "id='"
        + id
        + '\''
        + ", city='"
        + city
        + '\''
        + ", leftDeliveryDay='"
        + leftDeliveryDay
        + '\''
        + '}';
  }
}
