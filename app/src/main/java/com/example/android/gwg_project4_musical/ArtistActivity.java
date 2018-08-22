package com.example.android.gwg_project4_musical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link ArtistActivity} Show a list of Artists name
 * for each release also display tracks name, album name,
 * and music gender.
 * */
public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Create an ArrayList of Songs objects
        final ArrayList<Songs> songs = new ArrayList<>();

        //Populate the ArrayList with songs information
        songs.add(new Songs(getString(R.string.artist_jackson), getString(R.string.track_bad), getString(R.string.bad_album), getString(R.string.pop_genre), R.drawable.albumbad));
        songs.add(new Songs(getString(R.string.artist_sheeran),getString(R.string.track_perfect), getString(R.string.divide_album), getString(R.string.pop_genre), R.drawable.divide_cover));
        songs.add(new Songs(getString(R.string.artist_cardib),getString(R.string.track_i_like_it), getString(R.string.invasion_album), getString(R.string.hip_hop_genre), R.drawable.invasion_cover));
        songs.add(new Songs(getString(R.string.artist_ozuna),getString(R.string.track_criminal), getString(R.string.criminal_album), getString(R.string.reggaettn_genre), R.drawable.criminal_cover));
        songs.add(new Songs(getString(R.string.artist_bentley),getString(R.string.track_woman_amen), getString(R.string.woman_amen_album), getString(R.string.country_genre), R.drawable.woman_cover));
        songs.add(new Songs(getString(R.string.artist_dumont),getString(R.string.track_ocean_drive), getString(R.string.ocean_drive_album), getString(R.string.deep_house_genre), R.drawable.ocean_cover));
        songs.add(new Songs(getString(R.string.artist_loop),getString(R.string.track_triste_perro), getString(R.string.vikorg_album), getString(R.string.rock_espanol_genre), R.drawable.senor_cover));
        songs.add(new Songs(getString(R.string.artist_deadmouse),getString(R.string.track_raise_your_weapon), getString(R.string.five_years_album), getString(R.string.house_genre), R.drawable.mouse_cover));
        songs.add(new Songs(getString(R.string.artist_jam),getString(R.string.track_live_it_up), getString(R.string.fifa2018_album), getString(R.string.r_b_genre), R.drawable.fifa_cover));
        songs.add(new Songs(getString(R.string.artist_omi),getString(R.string.track_cheerleader), getString(R.string.cheerleader_album), getString(R.string.pop_genre), R.drawable.cheerleader_cover));

        /* Create an {@link SongsAdapter}, whose data source is a list of
         {@link Songs} The adapter knows how to create list item views for each item
         in the list.
        */
        SongsAdapter adapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.songs_list_view);
        listView.setAdapter(adapter);

        //TODO pack some data and send it to the next 'Now Playing' activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songs.get(position);

                Intent data = new Intent(ArtistActivity.this, NowPlayingActivity.class);
                startActivity(data);
            }
        });

        //TODO adding bottom navigation functions to back home, activity or now playing
    }
}
