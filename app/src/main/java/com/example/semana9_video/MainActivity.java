package com.example.semana9_video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView view = (VideoView)findViewById(R.id.videoView_video);

        String path = "android.resource://" + getPackageName() + "/" + R.raw.video1;
        view.setVideoURI(Uri.parse(path));

        view.start();

    }
}