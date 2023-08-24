package com.example.sports_tournament_app;



import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
public class orderint extends AppCompatActivity {

    //Buttons for activating the relevant part fo the decorator.
    Button cpubtn, GraphicsCard, Cooling, Peripherals, tickets, test2;

    //Database used to access + save login information.
    dbhelper DB;


    //Override will replace previously inherited behaviour.
    // protected void onCreate contains button ids from XML to java, which allows the XML to use java methods.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ordering_tickets_page);

        cpubtn = findViewById(R.id.cpu);
        GraphicsCard = findViewById(R.id.GC);
        Cooling = findViewById(R.id.Cooling);
        Peripherals = findViewById(R.id.Peripherals);
        tickets = findViewById(R.id.ticket);
        test2 = findViewById(R.id.test2);

        DB = new dbhelper(this);



        //Right now, this button does nothing. However, the use of it would be to call the methods for the made button (in this case CPU)
        cpubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick(null);
            }



        });

        //Below does not work. The plan was to use several buttons to add values to the database alongside user information. I did not have enough time or experience to attempt this.
        tickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getdata();
                if (res.getCount() == 0) {
                    Toast.makeText(orderint.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Football ordered " + "\n");
                    buffer.append("Tennis ordered " + res.getString(1) + "\n");
                    buffer.append("Table Tennis ordered " + res.getString(2) + "\n");

                    //Other decorator class bits to add on if necessary. One button would go to other buttons to allow mor options to appear. Could be used several times if needed.
                    buffer.append("Addon (food) ordered " + res.getString(3) + "\n");
                    buffer.append("Addon (drink) ordered " + res.getString(4) + "\n");
                    buffer.append("Addon (raffle ticket) " + res.getString(5) + "\n\n");
                }

                //A small box structure would appear with the above. Would display a 'ticket' with the ordered extras and stuff.
                AlertDialog.Builder builder = new AlertDialog.Builder(orderint.this);
                builder.setCancelable(true);
                builder.setTitle("Tickets Ordered");
                builder.setMessage(buffer.toString());
                builder.show();

            }
        });

        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){ openTesting(); }
        });

    }

    public void openTesting() {
        Intent intent = new Intent (this, orderprocess.class);
        startActivity(intent);

    };

}