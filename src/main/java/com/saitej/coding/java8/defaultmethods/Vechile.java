package com.saitej.coding.java8.defaultmethods;

public interface Vechile {

    default void startEngine() {
        System.out.println("Vechile.startEngine started");
    }

}
//1. By default, Default methods are avaliable to the implemented class
class Car implements Vechile {
    //1. By default, Default methods are avaliable to the implemented class
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
    }

   //2. We can override Default methods
    public void startEngine(){
        System.out.println("Car.startEngine started");
    }

}
