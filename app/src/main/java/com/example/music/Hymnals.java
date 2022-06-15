package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hymnals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create an array list of Hymnals
        ArrayList<Music> artist = new ArrayList<>();

        artist.add(new Music("MHB 516", "When we walk with the Lord"));
        artist.add(new Music("MHB 498", "Rock of Ages, cleft for me"));
        artist.add(new Music("MHB 400", "Take my life, and let it be"));
        artist.add(new Music("MHB 313", "To God be the glory"));
        artist.add(new Music("MHB 822", "Onward Christian Soldiers"));
        artist.add(new Music("CH 707", "Safe in the arms of Jesus"));
        artist.add(new Music("CH 668", "Loving Shepherd of thy sheep"));
        artist.add(new Music("MHB 948", "Abide with me"));
        artist.add(new Music("MHB 677", "We love the place, O God"));
        artist.add(new Music("MHB 738", "Revive thy work, O Lord"));

        // Use a ListView and Adapter to display hymnals
        MusicAdapter musicList = new MusicAdapter (this, artist);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(musicList);
    }
}