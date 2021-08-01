package com.example.oopproject;

public class Musicians {

    private final String name;
    private final String instrument;
    private final int age;

    public Musicians(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
