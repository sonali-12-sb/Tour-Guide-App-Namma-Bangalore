package com.android.nammabangalore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // find the start button view
        explore = findViewById(R.id.start_button);

        // set on click listener for explore button
        explore.setOnClickListener(view -> {
            // pass an intent from main activity to explore activity
            Intent intent = new Intent(MainActivity.this, ExploreActivity.class);
            // start activity, send an intent to open explore activity
            startActivity(intent);
        });
    }
}