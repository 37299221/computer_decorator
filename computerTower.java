package com.example.sports_tournament_app;

/* Methods that output information linking to a computer tower. */
public class computerTower implements computer {
    //An example of a file containing methods for the decorator. Gives examples of things that it may return in the recpt.
    @Override
    public String getDescription() {
        return "Standard computer tower";
    }

    @Override
    public double getCost() {
        return 50;
    }
}
