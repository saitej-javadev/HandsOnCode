package com.saitej.coding.streams.streamapi;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmpMain {

    public static void main(String[] args) {

        List<Emp> al = new ArrayList<>();
        loadEmp(al);

       // print active and inactive employees count
       /* long activeEmps = al.stream().filter(e -> e.isActive() == true).count();
        long inActiveEmps = al.stream().filter(e -> e.isActive() == false).count();
        System.out.println("active employees: " +activeEmps);
        System.out.println("Inactive employees: " +inActiveEmps);
*/

        // print the employees count based on dept

       /* Map<String, Long> collect = al.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.counting()));
        System.out.println(collect);*/


        // print all the departments

       /* Map<String, List<Emp>> listMap = al.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.toList()));
        System.out.println(listMap.keySet());*/


        //print max and min salary

       /* al.stream().max(Comparator.comparing(Emp::getSal)).ifPresent(System.out::println);
        al.stream().min(Comparator.comparing(Emp::getSal)).ifPresent(System.out::println);
*/

        // second highest salary

   //     al.stream().sorted(Comparator.comparing(Emp::getSal).reversed()).limit(2).skip(1).findFirst().ifPresent(System.out::println);


       // print max salary from each department

        Map<String, Optional<Emp>> collect = al.stream()
                .collect(Collectors.groupingBy(Emp::getDept,
                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Emp::getSal)))));

       collect.entrySet().forEach(entry->{
           System.out.println(entry.getKey() + " : " + entry.getValue().get().getName());
       });


    }

































    public static void loadEmp(List<Emp> al) {
        al.add(new Emp(101, "Jack", "IT", true, 2000));
        al.add(new Emp(102, "Bob", "Automobiles", true, 3000));
        al.add(new Emp(103, "Sam", "IT", false, 4000));
        al.add(new Emp(104, "Joy", "IT", false, 7000));
        al.add(new Emp(105, "Rock", "IT", true, 2500));
        al.add(new Emp(107, "Joe", "IT", true, 6500));
        al.add(new Emp(106, "Anne", "Automobiles", false, 8000));
        al.add(new Emp(108, "Alia", "Model", true, 8500));
        al.add(new Emp(109, "Kat", "Model", false, 9000));
        al.add(new Emp(111, "Bob", "IT", false, 3000));
        al.add(new Emp(110, "Aish", "Model", true, 12000));
    }
}
