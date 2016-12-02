package com.example.android.miwork;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Adding sound translation
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.remeber);
        mediaPlayer.start();

        //A code for the back button{Move back from numbers to miwok activity}
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create a new array of words

        ArrayList<Word> words = new ArrayList<Word>();
        //Assign values to the index of the array

       // words.add("One");
        words.add (new Word("One", "Lutti", "Tee", R.drawable.number_one));
        words.add (new Word("Two", "Otiiko", "Pedi", R.drawable.number_two));
        words.add(new Word("Three", "Tolookosu", "Tharo", R.drawable.number_three));
        words.add(new Word("Four", "Oyyisa", "Nne", R.drawable.number_four));
        words.add(new Word("Five", "Massokka", "Hlano", R.drawable.number_five));
        words.add(new Word("Six", "Temmokka", "Tshela", R.drawable.number_six));
        words.add(new Word("Seven", "Kenkaku", "Supa", R.drawable.number_seven));
        words.add(new Word("Eight", "Kawinta", "Seswai", R.drawable.number_eight));
        words.add(new Word("Nine", "Wo ' e", "Senyane", R.drawable.number_nine));
        words.add(new Word("Ten", "na' aacha", "Lesome", R.drawable.number_ten));

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

      WordAdapter adapter = new WordAdapter(this,words, R.color.category_numbers);
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
