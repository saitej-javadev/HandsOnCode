package com.saitej.coding.abstractex;

abstract class A {
    int a;

    public A(int a) {
        this.a = a;
    }

    public abstract void fun();
    public void code(){
        System.out.println("coding");
    }

}

class B extends A{

    public B(int a) {
        super(a);
    }

    @Override
    public void fun() {
        System.out.println("having fun");
    }
}

class Main{
    public static void main(String[] args) {
        B b = new B(10);
        System.out.println(b.a);
        b.fun();
        b.code();
    }
}