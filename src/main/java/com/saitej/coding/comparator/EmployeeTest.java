package com.saitej.coding.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1L, "John", 200), new Employee(2L, "Bob", 400)
                , new Employee(3L, "Lee", 300));

       /* Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
              //  return o1.getSalary()>o2.getSalary()?-1:o1.getSalary()<o1.getSalary()?1:0;// descending
                return o1.getSalary()<o2.getSalary()?-1:o1.getSalary()>o1.getSalary()?1:0;//ascending
            }
        });*/


        Collections.sort(employees,(o1, o2) -> o1.getSalary()<o2.getSalary()?-1:o1.getSalary()>o1.getSalary()?1:0);



        employees.forEach(System.out::println);



    }
}
