package com.example.android.playerama;

/**
 * + * {@link Song} represents a song displayed inside the song list.
 * + * It contains the name of the artist and the name of the song.
 * +
 */
public class Song {

    /**
     * Name of the artist
     */
    private String mArtistName;

    /**
     * Name of the song
     */
    private String mSongName;

    /**
     * Create a new Song object.
     *
     * @param artistName is the name of the artist
     * @param songName   is the name of the song
     */
    public Song(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }

    /**
     * Get the name of the artist.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the name of the song.
     */
    public String getSongName() {
        return mSongName;
    }

}

