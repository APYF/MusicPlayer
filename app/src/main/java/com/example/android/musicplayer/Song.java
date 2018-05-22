package com.example.android.musicplayer;

public class Song {
    private String mSongName;
    private String mArtistName;

    /**
     * Create a new Song object.
     * @param songName is the name of song
     * @param artistName is the name of the artist who performed the song
     */
    public Song(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }
}

