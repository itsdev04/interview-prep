package org.devworks.eds;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryByDepartment {
  public static void main(String[] args) {
    List<Employee> employees =
        Arrays.asList(
            new Employee("Alice", "F", 21, "IT", 90000),
            new Employee("Bob", "F", 23, "IT", 105000),
            new Employee("Charlie", "M", 45, "HR", 60000),
            new Employee("Daisy", "F", 65, "HR", 75000),
            new Employee("Eve", "F", 12, "Sales", 85000));

    Map<String, Optional<Employee>> collect =
        employees.stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

    collect.forEach(
        (dept, emp) -> System.out.println("Department: " + dept + " | Top Earner: " + emp.get()));
  }
}
