package org.devworks.sorting;

import java.util.*;

public class EmployeeSortingDemo {
  public static void main(String[] args) {
    List<Employee> list = new ArrayList<>();
    list.add(new Employee(3, "Alice", 75000));
    list.add(new Employee(1, "Bob", 50000));
    list.add(new Employee(2, "Charlie", 60000));
    list.add(new Employee(5, "David", 50000));
    list.add(new Employee(4, "Eve", 90000));

    System.out.println("Original list:");
    for (Employee e : list) {
      System.out.println(e);
    }

    // Sort by id (natural order, using Comparable)
    Collections.sort(list);
    System.out.println("\nSorted by id (natural):");
    for (Employee e : list) {
      System.out.println(e);
    }

    // Sort by name (using Comparator)
    Collections.sort(list, Employee.NameComparator);
    System.out.println("\nSorted by name:");
    for (Employee e : list) {
      System.out.println(e);
    }

    // Sort by salary (using Comparator)
    Collections.sort(list, Employee.SalaryComparator);
    System.out.println("\nSorted by salary:");
    for (Employee e : list) {
      System.out.println(e);
    }

    // Chained sort: salary ascending, then name if salary equal
    Collections.sort(
        list, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));
    System.out.println("\nSorted by salary, then name:");
    for (Employee e : list) {
      System.out.println(e);
    }
  }
}
