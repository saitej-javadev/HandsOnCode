package com.saitej.coding.singleton.enumdemo;

public class SingletonDemo {
    public static void main(String[] args) {
        Test obj = Test.INSTANCE;
        obj.i =10;
        obj.show();
        Test obj1 = Test.INSTANCE;
        obj1.i =20;
        obj1.show();
    }
}


enum Test{
    INSTANCE;
    int i;
    public void show(){
        System.out.println(i);
    }
}