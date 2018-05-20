package com.example.android.playerama;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        Intent playMusic = getIntent();
        String theArtistName = playMusic.getStringExtra("artist_name");
        String theSongName = playMusic.getStringExtra("song_name");

        TextView artistName = (TextView) findViewById(R.id.artist_name);
        artistName.setText(theArtistName);

        TextView songName = (TextView) findViewById(R.id.song_name);
        songName.setText(theSongName);


        final Button previousButton = findViewById(R.id.previous_button);
        previousButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code that will make the media player go to the previous song.
            }
        });

        final Button pauseButton = findViewById(R.id.pause_button);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code that will make the media player pause the current playing song.
            }
        });

        final Button playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code that will make the media player play the current song.
            }
        });

        final Button stopButton = findViewById(R.id.stop_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code that will make the media player stop the current playing song.
            }
        });

        final Button nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code that will make the media player go to the next song.
            }
        });

    }

}
