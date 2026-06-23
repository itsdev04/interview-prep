package org.devworks.string;

import java.util.*;

public class QuesByDev {
  public static void main(String[] args) {
    Student isha = new Student("isha", 819, 158, new Address(1474, "140307", "mohali"));
    Student kashish = new Student("kashish", 850, 160, new Address(741, "140307", "mohali"));
    List<Student> list = new ArrayList<Student>();
    list.add(isha);
    list.add(kashish);
    Collections.sort(
        list,
        new Comparator<Student>() {
          public int compare(Student s1, Student s2) {
            return Float.compare(s1.getHeight(), s2.getHeight());
          }
        });
    // list.sort(Comparator.comparing(student::student.getHeight()));
    for (Student s : list) {
      System.out.println("Name : " + s.getName());
      System.out.println("ID : " + s.getID());
      System.out.println("Height : " + s.getHeight());
      System.out.println(
          "Address : house no. - "
              + s.address.getHouse_no()
              + ", zipcode : "
              + s.address.getZipCode()
              + ". city : "
              + s.address.getCity());
    }
  }
}
