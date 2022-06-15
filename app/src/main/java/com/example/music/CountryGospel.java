package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CountryGospel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create an array list of country gospel music
        ArrayList<Music> artist = new ArrayList<>();

        artist.add(new Music("Merle Haggard", "Pray"));
        artist.add(new Music("Tammy Wynette", "Precious memories"));
        artist.add(new Music("Billy Joe Shaver", "If I give my soul"));
        artist.add(new Music("Willie Nelson", "Uncloudy day"));
        artist.add(new Music("Garth Brooks", "Unanswered prayers"));
        artist.add(new Music("Ferlin Husks", "Wings of a dove"));
        artist.add(new Music("Randy Travis", "Three wooden crosses"));
        artist.add(new Music("Waylon jennings", "I do believe"));
        artist.add(new Music("Vince Gill", "Go rest high on that mountain"));
        artist.add(new Music("Johnny Cash", "The man comes around"));

        // Use a ListView and Adapter to display country music
        MusicAdapter musicList = new MusicAdapter (this, artist);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(musicList);
    }
}