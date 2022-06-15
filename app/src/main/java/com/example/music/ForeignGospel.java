package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ForeignGospel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create an array list of foreign gospel tracks from around the world
        ArrayList<Music> artist = new ArrayList<>();

        artist.add(new Music("R A Vernon", "You covered me"));
        artist.add(new Music("Sinmidele and Ole Macauley", "Amen Amen"));
        artist.add(new Music("The Spirituals", "Wade in the water"));
        artist.add(new Music("Dunsin Oyekan", "When God walks in"));
        artist.add(new Music("Dunsin Oyekan", "Breathe"));
        artist.add(new Music("Hillsong United", "Oceans"));
        artist.add(new Music("Hillsong", "So Will I"));
        artist.add(new Music("Dunsin Oyekan", "YAH"));
        artist.add(new Music("Minister GUC", "All that matters"));
        artist.add(new Music("Steve Crown", "You are YAHWEH"));

        // Use a ListView and Adapter to display foreign music
        MusicAdapter musicList = new MusicAdapter (this, artist);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(musicList);
    }
}