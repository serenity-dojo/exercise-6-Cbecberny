package com.serenitydojo;

import com.serenitydojo.model.Pet;

public class Hampster extends Pet {

    String favoriteGame;
    private String name;
    int age;


    public Hampster(String name, String favoriteGame, int age){
        super(name, age);
        this.favoriteGame = favoriteGame;

    }


    public String getName() {
        return name;
    }

    @Override
    public String play() {
        return "runs in wheel";
    }

    public String getFavoriteGame() {

        return favoriteGame;

    }

    public int getAge() {

        return age;

    }
}