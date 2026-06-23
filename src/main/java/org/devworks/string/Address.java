package org.devworks.string;

public class Address {
  int house_no;
  String zipCode;
  String city;

  public int getHouse_no() {
    return house_no;
  }

  public void setHouse_no(int house_no) {
    this.house_no = house_no;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  Address(int house_no, String zipCode, String city) {
    this.house_no = house_no;
    this.zipCode = zipCode;
    this.city = city;
  }
}
