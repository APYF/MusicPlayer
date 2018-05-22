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

        String song = intent.getStringExtra("SONG");
        String artist = intent.getStringExtra("ARTIST");

        TextView songTextView = (TextView) findViewById(R.id.detail_song);
        songTextView.setText(song);

        TextView artistTextView = (TextView) findViewById(R.id.detail_artist);
        artistTextView.setText(artist);

        ImageView albumCoverImageView = (ImageView) findViewById(R.id.album_cover);
        albumCoverImageView.setImageResource(R.drawable.androidmusicapps06);
    }
}
