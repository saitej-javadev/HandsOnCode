package com.saitej.coding.streams.streamapi;

public class Emp {
    private int id;
    private String name;
    private String dept;
    private boolean isActive;
    private double sal;

    public Emp() {
    }

    public Emp(int id, String name, String dept, boolean isActive, double sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.isActive = isActive;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", isActive=" + isActive +
                ", sal=" + sal +
                '}';
    }
}
