package org.devworks.string;

public class Student {
  String name;
  int ID;
  float height;
  Address address;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  Student(String name, int ID, float height, Address address) {
    this.name = name;
    this.ID = ID;
    this.height = height;
    this.address = address;
  }
}
