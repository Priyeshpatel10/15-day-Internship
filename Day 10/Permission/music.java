package com.example.permission;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class music extends AppCompatActivity implements View.OnClickListener {
    Button button6,button7,button8;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);


        mediaPlayer = MediaPlayer.create(music.this,R.raw.back);

        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button6:
                if(!mediaPlayer.isPlaying())
                {
                    mediaPlayer.start();
                }
                else if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();
                }a
               mediaPlayer.start();
                break;

            case R.id.button7:
                mediaPlayer.pause();
                break;

            case R.id.button8:
                mediaPlayer.stop();
                break;
        }
    }
}
