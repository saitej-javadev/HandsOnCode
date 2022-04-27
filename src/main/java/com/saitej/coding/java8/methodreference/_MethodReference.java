package com.saitej.coding.java8.methodreference;

@FunctionalInterface
public interface _MethodReference {
    int getLength(String str);
}

class Test {
    public static void main(String[] args) {

       _MethodReference
               methodReference= s->s.length();
        System.out.println(methodReference.getLength("saitej"));// Using Lambda Expression


        _MethodReference reference = String::length;
        System.out.println(reference.getLength("SpringBoot"));// Using Method Reference
    }
}
