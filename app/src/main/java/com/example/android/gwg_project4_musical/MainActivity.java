package com.example.android.gwg_project4_musical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * {@link MainActivity} display a dashboard to
 * select music by categories
 * */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity_mail.xml layout file
        setContentView(R.layout.activity_main);

        //Find the artist card view item to show artist category
        CardView artist = findViewById(R.id.artist_card_view);

        //Set a click listener to open {@link ArtistActivity} class
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create a new intent to open the {@link ArtistActivity}
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);

                //Start new activity
                startActivity(artistIntent);
            }
        });

        //Find the albums card view item to show albums category
        CardView albums = findViewById(R.id.albums_card_view);

        //Set a click listener to open {@link AlbumsActivity} class
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                //Start new activity
                startActivity(albumsIntent);
            }
        });

        //Find the tracks card view item to show tracks category
        CardView tracks = findViewById(R.id.tracks_card_view);

        //Set a click listener to open {@link TracksActivity} class
        tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create a new intent to open the {@link TracksActivity}
                Intent tracksIntent = new Intent(MainActivity.this, TracksActivity.class);

                //Start new activity
                startActivity(tracksIntent);
            }
        });

        //Find the gender card view item to show gender category
        CardView gender = findViewById(R.id.gender_card_view);

        //Set a click listener to open {@link GenderActivity} class
        gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create a new intent to open the {@link GenderActivity}
                Intent genderIntent = new Intent(MainActivity.this, GenderActivity.class);

                //Start new activity
                startActivity(genderIntent);
            }
        });
    }
}
