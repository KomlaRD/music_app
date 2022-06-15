package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LocalGospel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create an array list of local gospel songs from Ghana
        ArrayList<Music> artist = new ArrayList<>();

        artist.add(new Music("Joe Mettle", "Ye obua mi"));
        artist.add(new Music("Celestine Donkor", "Okrokrohene"));
        artist.add(new Music("Diana Hamilton", "Mo ne yo"));
        artist.add(new Music("Esther Smith", "Gye no di"));
        artist.add(new Music("Joe Beechem", "Aseda"));
        artist.add(new Music("Bernice Offei", "Hold on"));
        artist.add(new Music("Ohemaa Mercy", "Ote me mu"));
        artist.add(new Music("Daughters of glorious Jesus", "Edin No"));
        artist.add(new Music("Stella Dugan", "Moma yenyi nyame aye"));
        artist.add(new Music("Danny Nettey", "I will worship you"));

        // Use a ListView and Adapter to display details of the track
        MusicAdapter musicList = new MusicAdapter(this, artist);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(musicList);
    }
}