package com.karthik.demo;

public class Laptop implements Computer {
    // public Laptop() {
    //     System.out.println("Laptop Object Created");
    // }

    @Override
    public void compile() {
        System.out.println("Compilling using Laptop");
    }

}
