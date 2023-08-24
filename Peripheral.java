package com.example.sports_tournament_app;

public class Peripheral extends computerDecorator{
    public Peripheral(computer newComputer) {
        /* Calls the constructor (decorator) so that it's methods can be used. */
        super(newComputer);

        //Placeholder for what the decorator will do. instead of a System.out.println command being used,
        // A method will be used to put predetermined text from the method to a TextView. This will be displayed
        //As a receipt.
        System.out.println("Computer tower");
        System.out.println("Peripherals chosen:");

        //Extra files will be made with extensions of the peripheral.java file, each having a type of peripheral as a name.

    }

    //An example of what choosing a peripheral option would be (cost + description). Each method will call the relevant method in the
    //Interface (each concrete class will have a specific method for the description and cost, as well as the stock).
    public String getDescription(){

        return tempcomputer.getDescription() + ", Speakers";

    }

    public double getCost(){

        return tempcomputer.getCost() + 5;

    }

}
