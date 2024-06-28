package com.serenitydojo.model;

public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String getName() {
        return name;

    }
    public String makeNoise() {
        return "Don't Know";

    }

    public abstract String play();
}