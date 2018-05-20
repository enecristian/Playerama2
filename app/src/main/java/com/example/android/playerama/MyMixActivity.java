package com.example.android.playerama;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MyMixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Camilla Cabello", "Never Be The Same"));
        songs.add(new Song("Bebe Rexha", "Meant To Be"));
        songs.add(new Song("Rita Ora", "Anywhere"));
        songs.add(new Song("Marshmello  ", "Wolves"));
        songs.add(new Song("Jax Jones", "Breathe"));
        songs.add(new Song("J Balvin", "Mi gente"));
        songs.add(new Song("Luis Fonsi", "Despacito"));
        songs.add(new Song("Rita Ora", "For You"));
        songs.add(new Song("The Chainsmokers", "Sick Boy"));
        songs.add(new Song("Rudimental", "These days"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
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

                Intent intent = new Intent(MyMixActivity.this, NowPlayingActivity.class);
                intent.putExtra("Artist Name", String.valueOf(item));
                intent.putExtra("Song Name", String.valueOf(item));
                startActivity(intent);
            }
        });
    }
}

