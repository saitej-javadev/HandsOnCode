package com.saitej.coding.streams.streamapi;

import java.util.Arrays;
import java.util.List;

public class EmpDriver {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(103, "Joe", 2000),
                                             new Employee(101, "Bob", 1000),
                                                new Employee(102, "Sam", 3000));

   //     list.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println); // asc
   //     list.stream().sorted(Comparator.comparing(Employee::getId).reversed()).forEach(System.out::println); //dsc


 //       list.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println); // Higest salary



      /*  list.stream().map(e->{
            if (e.getSalary()<3000){
                e.setSalary(e.getSalary()+e.getSalary()*40/100);
            }

            return e;
        }).map(e->{
            e.setName(e.getName().toUpperCase());
            return e;
        }).forEach(System.out::println);
*/



        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

       // myList.stream().sorted().forEach(i-> System.out.print(i+", "));
      //  myList.stream().sorted().distinct().forEach(i-> System.out.print(i+", "));

       // myList.stream().sorted((o1, o2) -> o1<o2?1:o1>o2?-1:0).forEach(i-> System.out.print(i+", "));

     //   myList.stream().sorted(Collections.reverseOrder()).forEach(i-> System.out.print(i+", "));

      //  myList.stream().min(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);

    //    myList.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);




    }


}
