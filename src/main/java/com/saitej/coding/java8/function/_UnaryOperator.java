package com.saitej.coding.java8.function;

import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

//If Input and Output are same type go for Unary Operator(Similar to Function<T,R>)
public class _UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Double> unaryOperator = i->Math.sqrt(i);
        DoubleUnaryOperator doubleUnaryOperator = i->Math.sqrt(i);//for primitive types for AB and A.UB issues
        System.out.println(doubleUnaryOperator.applyAsDouble(100));
        System.out.println(unaryOperator.apply(1024.00));
    }
}
