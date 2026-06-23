package org.devworks.eds;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Average {
  public static void main(String[] args) {
    List<Employee> employees =
        Arrays.asList(
            new Employee("Alice", "F", 21, "IT", 90000),
            new Employee("Bob", "F", 23, "IT", 105000),
            new Employee("Charlie", "M", 45, "HR", 60000),
            new Employee("Daisy", "F", 65, "HR", 75000),
            new Employee("Eve", "F", 12, "Sales", 85000));

    Map<String, Double> avgAgeByGender =
        employees.stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getGender, Collectors.averagingInt(Employee::getAge)));
    System.out.print(avgAgeByGender);

    Map<String, Double> avgAgeBySalary =
        employees.stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
    System.out.print(avgAgeBySalary);

    // calculate average salary, total salary and max
    // using Collectors.summarizingDouble
    DoubleSummaryStatistics collect =
        employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
    System.out.print("Average salary: " + collect.getAverage());
    System.out.print("Total sum of salary: " + collect.getSum());
    System.out.print("Maximum salary: " + collect.getMax());
  }
}
