package com.example.sports_tournament_app;

import android.os.Bundle;

// Class containing the necessary details for each computer purchase. Methods will output more specific details in other files.
public interface computer {

    //Add bottom row to the XML Manifest file.


    //Methods that will be used for every extending file with any need for a pricing / description. Uses for the methods are present in computerDecorator.java
    public String getDescription();
    public double getCost();

    // As this is the interface for the program, each file that extends this one will use these methods because of inheritance. However, the output of these methods will change depending on what file is being used.

}
