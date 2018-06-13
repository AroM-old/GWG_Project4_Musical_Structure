package com.example.android.gwg_project4_musical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link TracksActivity} Show a list of Tracks name
 * for each release also display album name,
 * and music gender
 **/
public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Create an ArrayList of Songs objects
        ArrayList<Songs> songs = new ArrayList<>();

        //Populate the ArrayList with songs information
        songs.add(new Songs("Bad", "Bad 25th Anniversary", "Pop", R.mipmap.albumbad));
        songs.add(new Songs("Perfect", "Divide", "Pop",R.mipmap.divide_cover));
        songs.add(new Songs("I Like It", "Invasion of Privacy", "Hip Hop",R.mipmap.invasion_cover));
        songs.add(new Songs("Criminal", "Criminal", "Reggaeton",R.mipmap.criminal_cover));
        songs.add(new Songs("Woman, Amen", "Woman, Amen", "Country",R.mipmap.woman_cover));


        /** Create an {@link SongsAdapter}, whose data source is a list of
         * {@link Songs} The adapter knows how to create list item views for each item
         * in the list.
         **/
        SongsAdapter adapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.songs_list_view);
        listView.setAdapter(adapter);
    }
}
