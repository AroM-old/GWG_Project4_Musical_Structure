package com.example.android.gwg_project4_musical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class GenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Pop", R.mipmap.albumbad));
        songs.add(new Songs("Pop",R.mipmap.divide_cover));
        songs.add(new Songs("Hip Hop",R.mipmap.invasion_cover));
        songs.add(new Songs("Reggaeton",R.mipmap.criminal_cover));
        songs.add(new Songs("Country",R.mipmap.woman_cover));

        SongsAdapter adapter = new SongsAdapter(this, songs);

        ListView listView = findViewById(R.id.songs_list_view);
        listView.setAdapter(adapter);
    }
}
