package com.saitej.coding.java8.optional;

import java.util.Optional;

public class PersonOptional {
    public static void main(String[] args) {
        //case: 1
      //  Person person = new Person("Joe", "joe@gmail.com");

        //case: 2
        Person person = new Person("Joe", null);
        String emailOptional = person.getEmail().map(String::toUpperCase).orElse("Email is not avaliable");
        System.out.println(emailOptional);


    }
}




class Person{
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
