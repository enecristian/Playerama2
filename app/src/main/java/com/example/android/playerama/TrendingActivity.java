package com.example.android.playerama;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TrendingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of trending songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Ed Sheeran", "Perfect"));
        songs.add(new Song("The Weekend", "Call Out My Name"));
        songs.add(new Song("Camila Cabello", "Havana"));
        songs.add(new Song("Imagine Dragons", "Whatever It Takes"));
        songs.add(new Song("Dua Lipa", "New Rules"));
        songs.add(new Song("Justin Timberlake", "Say Something"));
        songs.add(new Song("Taylor Swift", "Delicate"));
        songs.add(new Song("Dua Lipa", "IDGAF"));
        songs.add(new Song("Lauv", "I Like Me Better"));
        songs.add(new Song("Post Malone", "Rockstar"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        final ListView listView = (ListView) findViewById(R.id.song_list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        // ListView setOnItemClickListener function apply here.

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                ListView item = (ListView) listView.getItemAtPosition(position);

                Intent intent = new Intent(TrendingActivity.this, NowPlayingActivity.class);
                intent.putExtra("Artist Name", String.valueOf(item));
                intent.putExtra("Song Name", String.valueOf(item));
                startActivity(intent);
            }
        });
    }
}

