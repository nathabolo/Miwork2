package com.example.android.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

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
        words.add (new Word("Father", "epe", "Tate", R.drawable.family_father));
        words.add (new Word("Mother", "eta", "Mma", R.drawable.family_mother));
        words.add(new Word("Son", "Angsi", "Morwa", R.drawable.family_son));
        words.add(new Word("Daughter", "Tune", "Kgarebe", R.drawable.family_daughter));
        words.add(new Word("Older brother", "Taachi", "Buti", R.drawable.family_older_brother));
        words.add(new Word("Younger brother", "Challiti", "Moratho", R.drawable.family_younger_brother));
        words.add(new Word("Older Sister", "Tete", "Sesi o mogolo", R.drawable.family_older_sister));
        words.add(new Word("Younger sister", "Kollitti", "Sesi o monyane", R.drawable.family_younger_sister));
        words.add(new Word("Grand mother", "amma", "Koko", R.drawable.family_grandmother));
        words.add(new Word("Grand father", "Paapa", "Rakgolo", R.drawable.family_grandfather));

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

        WordAdapter adapter = new WordAdapter(this,words, R.color.category_family);
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
