package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        Button albums = (Button) findViewById(R.id.albums);
        Button artists = (Button) findViewById(R.id.artists);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startAlbums = new Intent(v.getContext(), Albums.class);
                startActivity(startAlbums);
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startArtists = new Intent(v.getContext(), Artists.class);
                startActivity(startArtists);
            }

        });
    }


}
