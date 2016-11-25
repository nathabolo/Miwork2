package com.example.android.miwork;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view that shows the numbers category

        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set the click listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open numbers activity

                Intent intentNumbers = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intentNumbers);

            }
        });

        //Find the vies that shows colors activity
        TextView colors = (TextView) findViewById(R.id.colors);

        //Set the click listener for the colors category
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open colors activity

                Intent intentColors = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(intentColors);
            }
        });


        //Find views that shows family actitity

        TextView family = (TextView)findViewById(R.id.family);

        //Set the click listener for family category

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intenty for family click listener

                Intent intentfamily = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intentfamily);
            }
        });

        //Find views that shows phrases activity

        TextView phrases = (TextView)findViewById(R.id.phrases);

        //Set the click listener for the phrases activity

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent for phrases activity

                Intent intentPhrases = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intentPhrases);
            }
        });
    }
}
