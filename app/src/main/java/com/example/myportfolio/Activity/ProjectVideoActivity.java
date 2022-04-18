package com.example.myportfolio.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.myportfolio.R;

public class ProjectVideoActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_video);

        this.setTitle("Project Video");

        //Add back Button on tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String videoLink = bundle.getString("git_link");
            showVideo(videoLink);
        }


    }

    private void showVideo(String videoLink) {

        if (videoLink.equals("Routine Link")){

            videoView = findViewById(R.id.videoViewId);
            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
        }

        if (videoLink.equals("Note Link")){

            videoView = findViewById(R.id.videoViewId);
            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);

        }

        if (videoLink.equals("Face Mask Link")){

            videoView = findViewById(R.id.videoViewId);
            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);

        }

        if (videoLink.equals("SPA Link")){

            videoView = findViewById(R.id.videoViewId);
            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);

        }

        if (videoLink.equals("Travel Link")){

            videoView = findViewById(R.id.videoViewId);
            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);

        }

        if (videoLink.equals("Poetry Link")){

            videoView = findViewById(R.id.videoViewId);
            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
        }

        if (videoLink.equals("Portfolio Link")){

            videoView = findViewById(R.id.videoViewId);
            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);

        }

        if (videoLink.equals("Daily Cost Link")){

            videoView = findViewById(R.id.videoViewId);
            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);

        }
    }

    //Back button on top navbar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}