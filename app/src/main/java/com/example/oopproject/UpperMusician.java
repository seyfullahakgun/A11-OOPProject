package com.example.oopproject;

public class UpperMusician extends Musicians{

    public UpperMusician(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    public String sing(){
        return "Barfuss Am Klavier";
    }
}
