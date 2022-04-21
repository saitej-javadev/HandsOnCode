package com.saitej.coding.basic;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 37;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime? "prime" : "not a prime");
    }
}
