package com.example.sham_celestial.videotest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import android.media.MediaPlayer;



public class MainActivity extends AppCompatActivity {

    Button clk;
    VideoView videov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clk  = (Button) findViewById(R.id.button);
        videov = (VideoView) findViewById(R.id.videoView);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        this.videoplay(videov);
    }

   public void videoplay(View v)
    {
        String videopath = "android.resource://com.example.sham_celestial.videotest/"+R.raw.cloud;
        Uri uri =  Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
                videov.start();
            }
        });

    }




}
