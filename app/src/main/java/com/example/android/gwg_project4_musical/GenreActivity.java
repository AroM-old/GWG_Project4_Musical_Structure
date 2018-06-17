package com.example.android.gwg_project4_musical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link GenreActivity} Show a list of music gender
 * */
public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Create an ArrayList of Songs objects
        ArrayList<Songs> songs = new ArrayList<>();

        //Populate the ArrayList with songs information
        songs.add(new Songs(getString(R.string.pop_genre), R.drawable.albumbad));
        songs.add(new Songs(getString(R.string.pop_genre), R.drawable.divide_cover));
        songs.add(new Songs(getString(R.string.hip_hop_genre), R.drawable.invasion_cover));
        songs.add(new Songs(getString(R.string.reggaettn_genre), R.drawable.criminal_cover));
        songs.add(new Songs(getString(R.string.country_genre), R.drawable.woman_cover));
        songs.add(new Songs(getString(R.string.deep_house_genre), R.drawable.ocean_cover));
        songs.add(new Songs(getString(R.string.rock_espanol_genre), R.drawable.senor_cover));
        songs.add(new Songs(getString(R.string.house_genre), R.drawable.mouse_cover));
        songs.add(new Songs(getString(R.string.r_b_genre), R.drawable.fifa_cover));
        songs.add(new Songs(getString(R.string.pop_genre), R.drawable.cheerleader_cover));


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
