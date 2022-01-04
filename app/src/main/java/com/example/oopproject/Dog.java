package com.example.oopproject;

public class Dog extends Animals{
    public void peeing(){
        super.walk();
    }

    public void walk(){
        System.out.println("Not Walking in the park");
    }
}
