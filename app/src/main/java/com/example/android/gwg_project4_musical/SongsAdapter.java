package com.example.android.gwg_project4_musical;

import android.app.Activity;;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongsAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Songs} objects.
 */
public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter(Activity context, ArrayList<Songs> songs){
        super(context,0,songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        // Get the {@link Songs} object located at this position in the list
        Songs currentSongs = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID album_image_view.
        ImageView albumImage = listItemView.findViewById(R.id.album_image_view);
        // Get the Album's cover from the currentSongs object and set this on
        // the ImageView.
        albumImage.setImageResource(currentSongs.getImageResId());

        // Find the TextView in the list_item.xml layout with the ID artist_text_view.
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        // Get the default artist's name from the currentSongs object and set this text on
        // the default TextView.
        artistTextView.setText(currentSongs.getArtist());

        // Find the TextView in the list_item.xml layout with the ID albums_text_view.
        TextView albumTextView = listItemView.findViewById(R.id.albums_text_view);
        // Get the default album's name from the currentSongs object and set this text on
        // the default TextView.
        albumTextView.setText(currentSongs.getAlbums());

        // Find the TextView in the list_item.xml layout with the ID tracks_text_view.
        TextView tracksTextView = listItemView.findViewById(R.id.tracks_text_view);
        // Get the default track's name from the currentSongs object and set this text on
        // the default TextView.
        tracksTextView.setText(currentSongs.getTracks());

        // Find the TextView in the list_item.xml layout with the ID gender_text_view.
        TextView genderTextView = listItemView.findViewById(R.id.gender_text_view);
        // Get the default gender's name from the currentSongs object and set this text on
        // the default TextView.
        genderTextView.setText(currentSongs.getGender());

        return listItemView;
    }
}
