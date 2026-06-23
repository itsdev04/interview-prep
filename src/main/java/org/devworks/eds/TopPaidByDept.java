package org.devworks.eds;

import java.util.*;
import java.util.stream.Collectors;

public class TopPaidByDept {
  public static void main(String[] args) {
    List<Employee> employees =
        Arrays.asList(
            new Employee("Alice", "F", 21, "IT", 90000),
            new Employee("Bob", "F", 23, "IT", 105000),
            new Employee("Charlie", "M", 45, "HR", 60000),
            new Employee("Daisy", "F", 65, "HR", 75000));

    Map<String, Employee> collect =
        employees.stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                        Optional::get)));

    for (Map.Entry entry : collect.entrySet()) {
      System.out.println(entry.getKey() + "->" + entry.getValue());
    }

    collect.forEach(
        (dept, emp) -> {
          System.out.println(dept + "->" + emp);
        });
  }
}
