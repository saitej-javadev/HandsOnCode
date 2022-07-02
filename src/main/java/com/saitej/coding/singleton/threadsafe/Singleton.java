package com.saitej.coding.singleton.threadsafe;

/*1. create obj with static instance
2. declare private constructor in order to avoid creating new object
3. declare static method and return obj */
public class Singleton {
    public static void main(String[] args) {

        Thread t1 = new Thread(() ->
        {
            Test test = Test.getInstance();
            System.out.println(test.hashCode());
        });

        Thread t2 = new Thread(() ->
        {
            Test test = Test.getInstance();
            System.out.println(test.hashCode());
        });

        t1.start();
        //   try{ Thread.sleep(10);}catch (Exception e){} // degrades performance
        t2.start();

    }
}

class Test {
    static Test obj; // lazy instantiation

    private Test() {
        System.out.println("Test:: Constructor executed");
    }

    // without synchronized two objects will be created
    //  public synchronized   static Test getInstance(){
    public static Test getInstance() {

        if (obj == null) { // checks whether the object is already created or not
            synchronized (Test.class) { // Double checked locking
                if (obj == null) {
                    obj = new Test();
                }
            }
        }
        return obj;
    }
}
