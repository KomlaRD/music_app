package com.example.music;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the local gospel category
        TextView localGospel = (TextView) findViewById(R.id.local);

        // Set a click listener to that view
        // The code in this method will be executed when the local gospel category is clicked on.
        localGospel.setOnClickListener(view -> {
            Intent localGospelIntent = new Intent(MainActivity.this, LocalGospel.class);
            startActivity(localGospelIntent);
        });

        // Find the View that shows the country gospel category
        TextView countryGospel = (TextView) findViewById(R.id.country);
        // Set a click listener to that view
        // The code in this method will be executed when the country gospel category is clicked on
        countryGospel.setOnClickListener(view -> {
            Intent countryGospelIntent = new Intent(MainActivity.this, CountryGospel.class);
            startActivity(countryGospelIntent);
        });

        //Find View that shows the hymnals category
        TextView hymnals = (TextView) findViewById(R.id.hymnals);
        //Set a click listener to the view
        // The code in this method will be executed when the hymnals category is clicked on
        hymnals.setOnClickListener(view -> {
            Intent hymnalsIntent = new Intent(MainActivity.this, Hymnals.class);
            startActivity(hymnalsIntent);
        });

        //Find View that shows the foreign gospel category
        TextView foreignGospel = (TextView) findViewById(R.id.foreign);
        //Set a click listener to the view
        // The code in this method will be executed when the foreign gospel category is clicked on
        foreignGospel.setOnClickListener(view -> {
            Intent foreignGospelIntent = new Intent(MainActivity.this, ForeignGospel.class);
            startActivity(foreignGospelIntent);
        });
    }

    //Create menu option on menu bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //Get menu bar option and display a toast when menu option is clicked
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_bar) {
            Toast.makeText(getApplicationContext(), "Menu options", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}