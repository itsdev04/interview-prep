package org.devworks.eds;

class Employee {
  String name;
  String gender;
  Integer age;
  String department;
  double salary;

  public Employee(String name, String gender, Integer age, String department, double salary) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.department = department;
    this.salary = salary;
  }

  public String getDepartment() {
    return department;
  }

  public double getSalary() {
    return salary;
  }

  public String getGender() {
    return gender;
  }

  public Integer getAge() {
    return age;
  }

  @Override
  public String toString() {
    return name + " ($" + salary + ")";
  }
}
