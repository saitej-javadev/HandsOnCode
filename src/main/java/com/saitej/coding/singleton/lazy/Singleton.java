package com.saitej.coding.singleton.lazy;
/*1. create obj with static instance
2. declare private constructor in order to avoid creating new object
3. declare static method and return obj */
public class Singleton {
    public static void main(String[] args) {
        Test obj = Test.getInstance();
        System.out.println(obj.hashCode());
        Test obj1 = Test.getInstance();
        System.out.println(obj1.hashCode());

    }
}

class Test{
   static Test obj ; // lazy instantiation
   private Test(){}

    public static Test getInstance(){
      if (obj==null){ // checks whether the object is already created or not
          obj = new Test();
      }
       return obj;
    }
}
