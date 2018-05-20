package com.example.android.playerama;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the NowPlaying Activity
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that shows the list of trending songs
        TextView trending = (TextView) findViewById(R.id.trending);

        // Set a click listener on that View
        trending.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family members View is clicked on.
            @Override
            public void onClick(View view) {
                Intent trendingIntent = new Intent(MainActivity.this, TrendingActivity.class);
                startActivity(trendingIntent);
            }
        });


        // Find the View that shows the top hits list
        TextView topHits = (TextView) findViewById(R.id.top_hits);

        // Set a click listener on that View
        topHits.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent topHitsIntent = new Intent(MainActivity.this, TopHitsActivity.class);
                startActivity(topHitsIntent);
            }
        });

        // Find the View that shows My Mix playlist
        TextView myMyx = (TextView) findViewById(R.id.my_mix);

        // Set a click listener on that View
        myMyx.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent myMyxIntent = new Intent(MainActivity.this, MyMixActivity.class);
                startActivity(myMyxIntent);
            }
        });

    }
}
