package com.saitej.coding.java8.supplier;

import java.util.function.Supplier;

//Generate random password with
// even places with characters and special characters (A-Z , @#$)
// Odd places with numbers(1-9)
public class GeneratePassword {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            Supplier<Integer> digit = () -> (int) (Math.random() * 10);
            String characters = "ABCDEFGHIJKLMNOPQRSTVUWXYZ@#$";
            Supplier<Character> c = () -> characters.charAt((int) (Math.random()) * 29);
            String pwd = "";
            for (int i = 1; i <= 8; i++) {
                if (i % 2 == 0) {
                    pwd = pwd + digit.get();
                } else {
                    pwd = pwd + c.get();
                }
            }
            return pwd;
        };
        System.out.println(s.get());
    }
}
