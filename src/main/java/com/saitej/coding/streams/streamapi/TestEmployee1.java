package com.saitej.coding.streams.streamapi;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee1 {

    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();
        loadList(list);

        // print all dept wise employees
      /* Map<String, Long> deptWiseEmployeeMap = list.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.counting()));
        System.out.println(deptWiseEmployeeMap);*/

        // print male and female employees in the organization

      /*  Map<String, Long> genderWiseEmployeeMap = list.stream().collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
        System.out.println(genderWiseEmployeeMap);*/

        // print the name of all departments in the organization

       /* list.stream().map(Employee1::getDepartment).collect(Collectors.toSet()).forEach(System.out::println);*/


        // what is the average age of male and female employees
        /*Map<String, Double> avgAgeOfMaleAndFemaleEmployees = list.stream().collect(Collectors.groupingBy(Employee1::getGender, Collectors.averagingInt(Employee1::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleEmployees);*/


        // print the highest paid employee in the organization

        /*String name = list.stream().max(Comparator.comparing(Employee1::getSalary)).get().getName();
        System.out.println(name);
*/
        // get all the employees who have joined after 2015

       /* list.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee1::getName).forEach(System.out::println);*/


        // average salary of each departments

        /*Map<String, Double> avgSalaryOfEachDept = list.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.averagingDouble(Employee1::getSalary)));
        Set<Map.Entry<String, Double>> entrySet = avgSalaryOfEachDept.entrySet();
        entrySet.forEach(entry-> System.out.println(entry.getKey()+" : "+entry.getValue()));*/


        // get the youngest female employee details in the sales and marketing department
        /*list.stream().filter(e->e.getDepartment().equals("Sales and Marketing")&&e.getGender().equals("F"))
                .min(Comparator.comparing(Employee1::getAge))
                .ifPresent(e-> System.out.println(e.getName()));*/

        // print the employee details with more experience
       /* list.stream().sorted(Comparator.comparing(Employee1::getYearOfJoining)).findFirst().ifPresent(e-> System.out.println(e.getName()));*/


        // how many male and females are there is sales and marketing team

    /*    Map<String, Long> maleAndFemaleEmployeesInSalesAndMarketingTeam = list.stream().filter(e -> e.getDepartment().equals("Sales and Marketing")).collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
        System.out.println(maleAndFemaleEmployeesInSalesAndMarketingTeam);*/

//        List down the names of all employees in each department

        /*Map<String, List<Employee1>> collect = list.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.toList()));
        Set<Map.Entry<String, List<Employee1>>> entries = collect.entrySet();
        entries.forEach(e-> {
           System.out.println("Employees in "+ e.getKey());
            System.out.println("-------------------------");
           List<Employee1> value = e.getValue();
           value.stream().map(Employee1::getName).forEach(System.out::println);

       });*/


    }

    private static void loadList(List<Employee1> list) {
        list.add(new Employee1(101,"Joe",22,"M","HR",2011,25000));
        list.add(new Employee1(111,"Alia",32,"F","Sales and Marketing",2012,45000));
        list.add(new Employee1(109,"Rocky",24,"M","Developer",2011,30000));
        list.add(new Employee1(107,"Sam",43,"F","Sales and Marketing",2015,32000));
        list.add(new Employee1(106,"Ross",33,"M","Accounting",2013,27000));
        list.add(new Employee1(108,"Monica",22,"F","Accounting",2022,42000));
        list.add(new Employee1(104,"Ariana",21,"F","Developer",2001,22000));
        list.add(new Employee1(105,"Pooja",28,"F","Tester",2016,18000));
        list.add(new Employee1(103,"Leo",29,"M","Trainee",2021,15000));
        list.add(new Employee1(102,"Bob",31,"M","Manager",2020,50000));
        list.add(new Employee1(112,"leo",31,"M","Sales and Marketing",2021,34000));
    }
}
