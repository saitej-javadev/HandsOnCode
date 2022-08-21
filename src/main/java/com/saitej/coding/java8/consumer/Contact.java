package com.saitej.coding.java8.consumer;

import java.util.Random;

public class Contact {

    private String name;
    private Random number ;

    public Contact(String name, Random number) {
        this.name = name;
        this.number = number;
    }

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Random getNumber() {
        return number;
    }

    public void setNumber(Random number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number=" + number.nextInt()+
                '}';
    }
}


