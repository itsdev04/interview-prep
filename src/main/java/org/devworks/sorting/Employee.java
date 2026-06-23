package org.devworks.sorting;

import java.util.*;

public class Employee implements Comparable<Employee> {
  private int id;
  private String name;
  private double salary;

  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  // Natural ordering: Let's say by id
  @Override
  public int compareTo(Employee other) {
    return Integer.compare(this.id, other.id);
  }

  // For nice printing
  @Override
  public String toString() {
    return "Employee{id=" + id + ", name='" + name + '\'' + ", salary=" + salary + "}";
  }

  // Static Comparators for alternative sorting

  public static Comparator<Employee> NameComparator =
      new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
          return e1.getName().compareTo(e2.getName());
        }
      };

  public static Comparator<Employee> SalaryComparator =
      new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
          return Double.compare(e1.getSalary(), e2.getSalary());
        }
      };
}
