package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button musicLibrary = (Button) findViewById(R.id.musicLibrary);
        Button store = (Button) findViewById(R.id.store);

        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMusicLibrary = new Intent(v.getContext(), MusicLibrary.class);
                startActivity(startMusicLibrary);
            }
        });

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startStore = new Intent(v.getContext(), Store.class);
                startActivity(startStore);
            }

        });
    }
}
