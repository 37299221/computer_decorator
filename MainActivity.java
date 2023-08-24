package com.example.sports_tournament_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //A few buttons going to several pages, except delete. This was used for testing purposes.
    Button signin, signup, about, help, delete;

    //dbhelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        signin = findViewById(R.id.button2);
        signup = findViewById(R.id.button1);
        about = findViewById(R.id.button4);
        help = findViewById(R.id.button3);
        delete = findViewById(R.id.delete);


        //Methods calling other methods.
        signin.setOnClickListener(v -> openSignin());

        signup.setOnClickListener(v -> openSignup());

        about.setOnClickListener(v -> openAbout());

        help.setOnClickListener(v -> openHelp());

        //DELETE METHOD COMMENTED OUT AS I CANNOT GET IT TO WORK.
        //delete.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //String nameTXT = name.getText().toString();

                //Boolean checkdeletedata = DB.deletedata(nameTXT);

                //if (checkdeletedata == true) {
                    //Toast.makeText(MainActivity.this, "Entry Deleted", Toast.LENGTH_SHORT).show();

                //} else {
                    //Toast.makeText(MainActivity.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
                //}
            //}
        //});

    }

    //Other methods relating to buttons, will be used to go to the relevant pages.
    public void openSignin() {
        Intent intent = new Intent (this, signinjava.class);
        startActivity(intent);
    }

    public void openSignup() {
        Intent intent = new Intent (this, signupjava.class);
        startActivity(intent);
    }

    public void openAbout() {
        Intent intent = new Intent (this, aboutjava.class);
        startActivity(intent);
    }

    public void openHelp() {
        Intent intent = new Intent (this, helpjava.class);
        startActivity(intent);
    }

    public void openTest() {
        Intent intent = new Intent (this, orderint.class);
        startActivity(intent);
    }


}