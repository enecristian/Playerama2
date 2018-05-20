package com.example.android.playerama;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();


    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.song_list, parent, false);
        }

        Song currentSong = getItem(position);

        TextView artistTextView = (TextView) listView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentSong.getArtistName());

        TextView songTextView = (TextView) listView.findViewById(R.id.song_text_view);
        songTextView.setText(currentSong.getSongName());

        return listView;

    }
}

