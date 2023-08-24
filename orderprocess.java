package com.example.sports_tournament_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//Just a aregular page with a button and some text, showing the user that they have ordered a ticket.
public class orderprocess extends AppCompatActivity {

    //Button that puts user to homepage.
    Button home;

    //Recipt for the user that will show the combination of items made with the decorator. The decorator will place items onto the list by using text such as:
    //PC tower
    //CPU
    //Graphics card
    //Speakers
    TextView ordertext;

    //Combines XML and java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tickets_ordered_page);
        home = findViewById(R.id.Homebutton);
        ordertext = findViewById(R.id.ordertext);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomepage();
            }
        });

    }



    //Method that is used for the homepage button.
    public void openHomepage() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}