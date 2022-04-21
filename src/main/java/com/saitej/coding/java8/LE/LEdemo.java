package com.saitej.coding.java8.LE;

@FunctionalInterface
interface  Interf{
    public void m1();
        }
public class LEdemo {
    public static void main(String[] args) {
        Interf interf= ()-> System.out.println("m1 method Impl");
        interf.m1();
    }
}
