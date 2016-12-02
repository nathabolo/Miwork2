package com.example.android.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //A code for the back button{Move back from numbers to miwok activity}
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create a new array of words

        ArrayList<Word> words = new ArrayList<>();
        //Assign values to the index of the array

        // words.add("One");
        words.add (new Word("Father", "epe", "Papa"));
        words.add (new Word("Mother", "eta", "Mma"));
        words.add(new Word("Son", "Angsi", "Morwa"));
        words.add(new Word("Daughter", "Tune", "Kgarebe"));
        words.add(new Word("Older brother", "Taachi","Buti"));
        words.add(new Word("Younger brother", "Challiti", "Moratho"));
        words.add(new Word("Older Sister", "Tete", "Sesi o mogolo"));
        words.add(new Word("Younger sister", "Kollitti", "Sesi o monyane"));
        words.add(new Word("Grand mother", "amma", "Koko"));
        words.add(new Word("Grand father", "Paapa", "Rakgolo"));

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

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
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
