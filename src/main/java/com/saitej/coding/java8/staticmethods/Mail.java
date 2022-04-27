package com.saitej.coding.java8.staticmethods;

public interface Mail {
    //1.static methods in interface are utility and factory methods
    //2. we can call static methods directly by using Interface name
    //3. Static methods are hidden
    //4. Cannot access interface static methods using object reference
    static void send(){
        System.out.println("Preparing to send the mail");
    }
}

 class Gmail implements  Mail{
     public static void main(String[] args) {
         Mail.send();

     }



 }
