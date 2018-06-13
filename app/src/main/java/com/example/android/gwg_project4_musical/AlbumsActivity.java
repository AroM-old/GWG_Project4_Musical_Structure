package com.example.android.gwg_project4_musical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link AlbumsActivity} Show a list of Albums name.
 * */
public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Create an ArrayList of Songs objects
        ArrayList<Songs> songs = new ArrayList<>();

        //Populate the ArrayList with songs information
        songs.add(new Songs("Bad 25th Anniversary", "Pop", R.mipmap.albumbad));
        songs.add(new Songs("Divide", "Pop",R.mipmap.divide_cover));
        songs.add(new Songs("Invasion of Privacy", "Hip Hop",R.mipmap.invasion_cover));
        songs.add(new Songs("Criminal", "Reggaeton",R.mipmap.criminal_cover));
        songs.add(new Songs("Woman, Amen", "Country",R.mipmap.woman_cover));
        songs.add(new Songs("Ocean Drive", "Deep House",R.mipmap.ocean_cover));
        songs.add(new Songs("Vikorg", "Rock Espanol",R.mipmap.senor_cover));
        songs.add(new Songs("5 Years of mau5", "House",R.mipmap.mouse_cover));
        songs.add(new Songs("Official Song 2018 FIFA", "R&B",R.mipmap.fifa_cover));
        songs.add(new Songs("Cheerleader", "Pop",R.mipmap.cheerleader_cover));

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
