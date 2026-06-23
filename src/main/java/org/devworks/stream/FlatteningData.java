package org.devworks.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatteningData {
  public static void main(String[] args) {

    Employee emp1 = new Employee("Alice");
    Employee emp2 = new Employee("Bob");
    Employee emp3 = new Employee("Charlie");
    Employee emp4 = new Employee("Alice"); // Different object, same name
    Employee emp5 = new Employee("David");

    Department dept1 = new Department("Engineering", Arrays.asList(emp1, emp2));
    Department dept2 = new Department("HR", Arrays.asList(emp3, emp4));
    Department dept3 = new Department("Sales", Arrays.asList(emp1, emp5)); // emp1 is in two depts

    List<Department> departments = Arrays.asList(dept1, dept2, dept3);

    // Get a unique list of all employee names.
    List<String> uniqueEmployee =
        departments.stream()
            .flatMap(dept -> dept.getEmployees().stream())
            .map(Employee::getName)
            .distinct()
            .collect(Collectors.toList());

    System.out.print(uniqueEmployee);
  }
}
