package com.saitej.coding.inheritance;


import javafx.scene.Parent;

public class Student extends Person {

    String score;
    String cource;

    public Student(String name, String age, String score, String cource) {
        super(name, age);
        this.score = score;
        this.cource = cource;
    }

    public Student(String score, String cource) {
        this.score = score;
        this.cource = cource;
    }

    Student() {

    }


    void read() {
        System.out.println("Student.read");
    }

    void code() {
        System.out.println("Student.code");
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score='" + score + '\'' +
                ", cource='" + cource + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    public static void main(String[] args) {

        // If we create Parent class object with parent class reference we can access all the properites and methods of parent class only(but not child class)
        Person person = new Person("Tom", "20");

        System.out.println(person.age);
        System.out.println(person.name);
        person.speak();
        person.walk();

        // If we create Child class object with parent class reference we can access all the properites and methods of parent class only(but not child class)
        System.out.println();
        Person person1 = new Student();
        person1.setName("Bob");
        person1.setAge("25");
        System.out.println(person1.age);
        System.out.println(person1.name);
        person1.speak();
        person1.walk();

        // If we create Child class object with child class reference we can access all the properites and methods of parent class and child class

        System.out.println();
        Student student = new Student("saitej", "25", "100", "Java");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getScore());
        System.out.println(student.getCource());
        student.speak();
        student.walk();
        student.read();
        student.code();

        System.out.println();

        // You cannot create Parent class object with Child class reference but vice-versa is possible


    }
}
