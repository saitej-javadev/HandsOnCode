package com.saitej.coding.streams.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(101, "joe", 2000),
                new Employee(854, "lee", 4000),
                new Employee(352, "bob", 1000),
                new Employee(102, "sam", 5000),
                new Employee(105, "ari", 3000),
                new Employee(120, "max", 6000),
                new Employee(150, "jay", 8000)
        );

        Consumer print = System.out::println;

        // to uppercase names

       /* empList.stream().map(employee -> {
            employee.setName(employee.getName().toUpperCase());
            return employee;
        }).forEach(print);
*/
         // max
    //    empList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(print);
       // print employee below sal 5000

       // empList.stream().filter(e->e.getSalary()<5000).forEach(print);


        // increase sal below 5000

 /*       empList.stream().filter(e->e.getSalary()<5000).map(e->{
            e.setSalary(e.getSalary()+3000);
            return e;
        }).forEach(print);
        */


      /*  empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(2)
                .skip(1)
                .findFirst()
                .ifPresent(print);*/

        empList.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(print
        );

    }
}
