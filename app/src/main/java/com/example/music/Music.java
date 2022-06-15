package com.example.music;

public class Music {
    /** Default artist */
    private final String mDefaultArtist;

    /** Default song title */
    private final String mDefaultSong;

    /**
     * Create a new Music object.
     *@param defaultArtist is the name of the musician
     *@param defaultSong is the title of the song
     */
    public Music(String defaultArtist, String defaultSong) {
        mDefaultArtist = defaultArtist;
        mDefaultSong = defaultSong;
    }

    //Get the default artist
    public String getDefaultArtist() {
        return mDefaultArtist;
    }

    //Get the default song
    public String getDefaultSong() {
        return mDefaultSong;
    }
}
