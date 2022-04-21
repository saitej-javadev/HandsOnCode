package com.saitej.coding.threads;

//Q. How many ways we can create thread?
// 1. By extending thread class
// 2. By Implementing Runnable interface

 class MyThread extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}

      class ThreadDemo{
         public static void main(String[] args) {
             new MyThread().start();
             for(int i=0;i<10;i++){
                 System.out.println("Main Thread");
             }
         }
     }
