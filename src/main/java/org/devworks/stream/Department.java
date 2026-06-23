package org.devworks.stream;

import java.util.List;

public class Department {
  private String department;
  private List<Employee> employees;

  public Department(String department, List<Employee> employees) {
    this.department = department;
    this.employees = employees;
  }

  public String getDepartment() {
    return department;
  }

  public List<Employee> getEmployees() {
    return employees;
  }
}
