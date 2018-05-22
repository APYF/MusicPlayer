package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SongDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_songdetail);

        Intent intent = getIntent();

        // get the song name and artist that was passed in from the paremt/Main activity
        String song = intent.getStringExtra("SONG");
        String artist = intent.getStringExtra("ARTIST");

        // display the song name in the view
        TextView songTextView = (TextView) findViewById(R.id.detail_song);
        songTextView.setText(song);

        // display the artist name in the view
        TextView artistTextView = (TextView) findViewById(R.id.detail_artist);
        artistTextView.setText(artist);

        // This is just a generic image to be displayed with the song
        ImageView albumCoverImageView = (ImageView) findViewById(R.id.album_cover);
        albumCoverImageView.setImageResource(R.drawable.androidmusicapps06);
    }
}
