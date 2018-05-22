package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("This Is America", "Childish Gambino"));
        songs.add(new Song("Nice For What","Drake"));
        songs.add(new Song("God's Plan","Drake"));
        songs.add(new Song("Psycho","Post Malone Featuring Ty Dolla $ign"));
        songs.add(new Song("Meant To Be","Bebe Rexha & Florida Georgia Line"));
        songs.add(new Song("The Middle","The Middle"));
        songs.add(new Song("Look Alive","BlocBoy JB Featuring Drake"));
        songs.add(new Song("Never Be The Same","Camila Cabello"));
        songs.add(new Song("Perfect","Ed Sheeran"));
        songs.add(new Song("No Tears Left To Cry","Ariana Grande"));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(songAdapter);
    }
}
