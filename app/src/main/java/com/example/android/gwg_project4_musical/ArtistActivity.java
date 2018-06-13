package com.example.android.gwg_project4_musical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Michael Jackson", "Bad", "Bad 25th Anniversary", "Pop", R.mipmap.albumbad));
        songs.add(new Songs("Ed Sheeran", "Perfect", "Divide", "Pop",R.mipmap.divide_cover));
        songs.add(new Songs("Cardi B", "I Like It", "Invasion of Privacy", "Hip Hop",R.mipmap.invasion_cover));
        songs.add(new Songs("Ozuna", "Criminal", "Criminal", "Reggaeton",R.mipmap.criminal_cover));
        songs.add(new Songs("Dierks Bentley", "Woman, Amen", "Woman, Amen", "Country",R.mipmap.woman_cover));


        SongsAdapter adapter = new SongsAdapter(this, songs);

        ListView listView = findViewById(R.id.songs_list_view);
        listView.setAdapter(adapter);
    }
}
