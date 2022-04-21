package com.saitej.coding.java8.LE;

import java.io.PrintStream;

@FunctionalInterface
interface StringLength{
    public int stringLength(String s);
}

public class StringLengthLE {
    public static void main(String[] args) {
        StringLength str = s -> s.length();
        System.out.println(str.stringLength("saitej"));
    }
}
