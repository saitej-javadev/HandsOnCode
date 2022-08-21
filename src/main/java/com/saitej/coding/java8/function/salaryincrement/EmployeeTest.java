package com.saitej.coding.java8.function.salaryincrement;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        populate(al);
        System.out.println("Before Increment");
        al.stream().forEach(System.out::println);
        Predicate<Employee> p = employee -> employee.getSalary()<10000;

        Function<Employee,Employee> f = employee -> {
            employee.setSalary(employee.getSalary()+500);
         return employee;
        };

        System.out.println("After Increment");
        ArrayList al2 = new ArrayList();
        for (Object e: al) {
            if (p.test((Employee) e)){
                al2.add(f.apply((Employee) e));
            }

        }
        al2.stream().forEach(System.out::println);




    }

    private static void populate(ArrayList al) {
        al.add(new Employee("sai", 10000));
        al.add(new Employee("tez", 3500));
        al.add(new Employee("John", 13500));
        al.add(new Employee("bob", 5500));
        al.add(new Employee("Jim", 45000));
        al.add(new Employee("Nick", 9000));
        al.add(new Employee("Rocky", 33500));
        al.add(new Employee("Tom", 4500));

    }
}