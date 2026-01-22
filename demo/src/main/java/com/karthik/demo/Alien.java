package com.karthik.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {

    int age;
    private int salary;
    private Laptop lap;

    public Alien(int age, Laptop lap, int salary) {
        System.out.println("Parameterised Constructor called"); // it will call contructor through indexing in beans.xml
                                                                // file
        this.age = age;
        this.lap = lap;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Alien() {
        System.out.println("Object Created");
    }

    public void code() {
        System.out.println("Coding");
        lap.compile();

    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

}
