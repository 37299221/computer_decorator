package com.example.sports_tournament_app;

public class Cleaning extends computerDecorator{

    public Cleaning (computer newComputer) {
        /* Calls the constructor (decorator) so that it's methods can be used. */
        //Everything is the same as in Peripherals.java
        super(newComputer);

        System.out.println("Peripherals chosen:");

    }

    public String getDescription(){

        return tempcomputer.getDescription() + ", Cleaning supplies";

    }

    public double getCost(){

        return tempcomputer.getCost() + 5;

    }

}
