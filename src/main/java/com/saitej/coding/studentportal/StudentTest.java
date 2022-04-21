package com.saitej.coding.studentportal;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println(new Student()
                .builder()
                .id(1L)
                .name("Saitej")
                .cource("Spring Boot")
                .grade("A+")
                .build());
    }
}
