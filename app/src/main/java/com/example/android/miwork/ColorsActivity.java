package com.example.android.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //A code for the back button{Move back from numbers to miwok activity}
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Create a new array of words

        ArrayList<Word> words = new ArrayList<Word>();
        //Assign values to the index of the array

        // words.add("One");
        words.add (new Word("Red", "Wetetti", "Khubedu", R.drawable.color_red));
        words.add (new Word("Mustard yellow", "Chiwiita", "Soroloane", R.drawable.color_mustard_yellow));
        words.add(new Word("Dark green", "Tolookosu", "Tala morogo", R.drawable.color_green));
        words.add(new Word("Dusty yelow", "Topiisa", "Soroloane", R.drawable.color_dusty_yellow));
        words.add(new Word("Green", "Chokokki","Tala", R.drawable.color_green));
        words.add(new Word("Brown", "Takaakki", "Brown", R.drawable.color_brown));
        words.add(new Word("Gray", "Kenkaku", "Gray", R.drawable.color_gray));
        words.add(new Word("yellow", "Topoppi", "Soroloane", R.drawable.color_mustard_yellow));
        words.add(new Word("Black", "Kululli", "Ntso", R.drawable.color_black));
        words.add(new Word("White", "Kelelli", "Tsweu", R.drawable.color_white));

//      int index = 0;
//
//        while (index < words.size()){
//
//            LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//
//            index++;
//        }

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//
//        for (int index = 0; index < words.size(); index ++){
//
//
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//
//
//
//        }

        WordAdapter adapter = new WordAdapter(this,words, R.color.category_colors);
        new ArrayAdapter<>(this,R.layout.list_item, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    //A method for the back button{Move back from numbers to miwok activity}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();

                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
