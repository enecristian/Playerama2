package com.example.android.playerama;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TopHitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Childish Gambino", "This Is America"));
        songs.add(new Song("Drake", "Nice For What"));
        songs.add(new Song("Drake", "God's Plan"));
        songs.add(new Song("Post Malone Featuring Ty Dolla $ign", "Psycho"));
        songs.add(new Song("Bebe Rexha & Florida Georgia Line", "Meant To Be"));
        songs.add(new Song("Zedd, Maren Morris & Grey", "The Middle"));
        songs.add(new Song("BlocBoy JB Featuring Drake", "Look Alive"));
        songs.add(new Song("Camila Cabello", "Never Be The Same"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml file.
        final ListView listView = (ListView) findViewById(R.id.song_list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        // ListView setOnItemClickListener function apply here.

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent playMusic = new Intent(TopHitsActivity.this, NowPlayingActivity.class);
                playMusic.putExtra("artist_name", String.valueOf("artistName"));// artistName is the key stored in the ArrayList.
                playMusic.putExtra("song_name", String.valueOf("songName"));// songName is the key stored in the the ArrayList.
                startActivity(playMusic);
            }
        });

    }

}