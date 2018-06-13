package com.example.android.gwg_project4_musical;

import android.app.Activity;;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter(Activity context, ArrayList<Songs> songs){
        super(context,0,songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Songs currentSongs = getItem(position);

        ImageView albumImage = listItemView.findViewById(R.id.album_image_view);
        albumImage.setImageResource(currentSongs.getImageResId());

        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentSongs.getArtist());

        TextView albumTextView = listItemView.findViewById(R.id.albums_text_view);
        albumTextView.setText(currentSongs.getAlbums());

        TextView tracksTextView = listItemView.findViewById(R.id.tracks_text_view);
        tracksTextView.setText(currentSongs.getTracks());

        TextView genderTextView = listItemView.findViewById(R.id.gender_text_view);
        genderTextView.setText(currentSongs.getGender());

        return listItemView;
    }
}
