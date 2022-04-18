package com.example.myportfolio.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.myportfolio.R;

public class ProjectsActivity extends AppCompatActivity implements View.OnClickListener {

    CardView project1CardView, project2CardView, project3CardView,
            project4CardView, project5CardView, project6CardView,
            project7CardView, project8CardView, project9CardView;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        this.setTitle("Projects");

        //Add back Button on tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        initialization();
        addListener();
    }


    //Back button on top navbar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private void initialization() {

        project1CardView = findViewById(R.id.routineSearchProjectId);
        project2CardView = findViewById(R.id.portfolioAppProjectId);
        project3CardView = findViewById(R.id.faceMaskDetectionProjectId);
        project4CardView = findViewById(R.id.smartPharmacyAppProjectId);
        project5CardView = findViewById(R.id.chatAppProjectId);
        project6CardView = findViewById(R.id.poetryAppProjectId);
        project7CardView = findViewById(R.id.videoMeetingAppProjectId);
        project8CardView = findViewById(R.id.dailyCostProjectId);
        project9CardView = findViewById(R.id.dogAndCatPredictionAppProjectId);

    }

    private void addListener() {

        project1CardView.setOnClickListener(this);
        project2CardView.setOnClickListener(this);
        project3CardView.setOnClickListener(this);
        project4CardView.setOnClickListener(this);
        project5CardView.setOnClickListener(this);
        project6CardView.setOnClickListener(this);
        project7CardView.setOnClickListener(this);
        project8CardView.setOnClickListener(this);
        project9CardView.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.routineSearchProjectId){
            intent = new Intent(ProjectsActivity.this, ProjectDetailsActivity.class);
            intent.putExtra("name","Routine Search");
            startActivity(intent);
        }

        if (view.getId() == R.id.portfolioAppProjectId){
            intent = new Intent(ProjectsActivity.this, ProjectDetailsActivity.class);
            intent.putExtra("name","Note App");
            startActivity(intent);
        }

        if (view.getId() == R.id.faceMaskDetectionProjectId){
            intent = new Intent(ProjectsActivity.this, ProjectDetailsActivity.class);
            intent.putExtra("name","Face Mask Detection");
            startActivity(intent);
        }

        if (view.getId() == R.id.smartPharmacyAppProjectId){
            intent = new Intent(ProjectsActivity.this, ProjectDetailsActivity.class);
            intent.putExtra("name","SPA");
            startActivity(intent);
        }

        if (view.getId() == R.id.chatAppProjectId){
            intent = new Intent(ProjectsActivity.this, ProjectDetailsActivity.class);
            intent.putExtra("name","Travelling App");
            startActivity(intent);
        }

        if (view.getId() == R.id.poetryAppProjectId){
            intent = new Intent(ProjectsActivity.this, ProjectDetailsActivity.class);
            intent.putExtra("name","Poetry");
            startActivity(intent);
        }

        if (view.getId() == R.id.videoMeetingAppProjectId){
            intent = new Intent(ProjectsActivity.this, ProjectDetailsActivity.class);
            intent.putExtra("name","Portfolio");
            startActivity(intent);
        }

        if (view.getId() == R.id.dailyCostProjectId){
            intent = new Intent(ProjectsActivity.this, ProjectDetailsActivity.class);
            intent.putExtra("name","Daily Cost");
            startActivity(intent);
        }
        if (view.getId() == R.id.dogAndCatPredictionAppProjectId){
            intent = new Intent(ProjectsActivity.this, ProjectDetailsActivity.class);
            intent.putExtra("name","Dog and Cat");
            startActivity(intent);
        }

    }
}