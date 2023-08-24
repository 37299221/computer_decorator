package com.example.sports_tournament_app;

//Computer interface accessed for the methods that have been made, which are necessary for the decorator to work as intended.
abstract class computerDecorator implements computer {

    protected computer tempcomputer;

    //Object made.
    public computerDecorator(computer newComputer){


        tempcomputer = newComputer;
    }

    //Placeholder for what the method getDescription() will do.
    public String getDescription(){

        return tempcomputer.getDescription();

    }

    //Placeholder for what the method getCost() will do.
    public double getCost(){

        return tempcomputer.getCost();

    }

}
