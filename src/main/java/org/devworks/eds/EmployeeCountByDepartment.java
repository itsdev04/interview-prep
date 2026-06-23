package org.devworks.eds;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeCountByDepartment {
  public static void main(String[] args) {
    List<Employee> employees =
        Arrays.asList(
            new Employee("Alice", "F", 21, "IT", 90000),
            new Employee("Bob", "F", 23, "IT", 105000),
            new Employee("Charlie", "M", 45, "HR", 60000),
            new Employee("Daisy", "F", 65, "HR", 75000),
            new Employee("Eve", "F", 12, "Sales", 85000));

    Map<String, Long> collect =
        employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    System.out.print(collect);
  }
}
