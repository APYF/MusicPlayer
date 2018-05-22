package com.example.android.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    /**
     * This is a custom constructor.  The context is used to infalte the layout file, and the the
     * list is the data we want to populate into the list.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param songs A list of Song objects to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) { super(context, 0, songs);}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Song currentSong = getItem(position);

        listItemView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songDetailIntent = new Intent(view.getContext(), SongDetailActivity.class);

                songDetailIntent.putExtra("SONG", currentSong.getSongName());
                songDetailIntent.putExtra("ARTIST", currentSong.getArtistName());

                view.getContext().startActivity(songDetailIntent);
            }
        });

        ImageView songImageView = (ImageView) listItemView.findViewById(R.id.song_image);
        songImageView.setImageResource(R.drawable.ic_play);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song);
        songTextView.setText(currentSong.getSongName());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist);
        artistTextView.setText(currentSong.getArtistName());

        return listItemView;
    }

}

