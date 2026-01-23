package com.karthik.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien{

    int age;
    private int salary;
    // private Laptop lap:
    private Computer com; // caling using interface of computer jiske andr Desktop, Laptop and etc saare hi aa jaayenge

    // public Alien(int age, Computer lap, int salary) {
    //     System.out.println("Parameterised Constructor called"); // it will call contructor through indexing in beans.xml
    //                                                             // file
    //     this.age = age;
    //     this.lap = lap;
    //     this.salary = salary;
    // }

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
        com.compile();

    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }


   

}
