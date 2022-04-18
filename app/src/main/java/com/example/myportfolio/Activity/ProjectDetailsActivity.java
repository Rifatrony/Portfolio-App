package com.example.myportfolio.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myportfolio.R;

public class ProjectDetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView name, description, link;
    Button videoButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_details);

        this.setTitle("Project Details");

        //Add back Button on tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        initialization();

        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String projectName = bundle.getString("name");
            showDetails(projectName);
        }

        /*videoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                */
        /*Intent intent = new Intent(getApplicationContext(),ProjectVideoActivity.class);
                intent.putExtra("git_link","Routine Link");
                intent.putExtra("git_link","Note Link");
                intent.putExtra("git_link","Face Mask Link");
                intent.putExtra("git_link","SPA Link");
                intent.putExtra("git_link","Travel Link");
                intent.putExtra("git_link","Poetry Link");
                intent.putExtra("git_link","Portfolio Link");
                *//**//*intent.putExtra("git_link","Note Link");
                intent.putExtra("git_link","Face Mask Link");
                intent.putExtra("git_link","SPA Link");*//**//*
                startActivity(intent);*//*
            }
        });*/
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

        imageView = findViewById(R.id.imageViewId);
        name = findViewById(R.id.projectNameTextViewId);
        description = findViewById(R.id.projectDescriptionTextViewId);
        link = findViewById(R.id.projectGithubLinkTextViewId);

        videoButton = findViewById(R.id.videoButtonId);

    }

    private void showDetails(String projectName) {

        if (projectName.equals("Routine Search")){
            this.setTitle("Routine Management System");
            imageView.setImageResource(R.drawable.timetable);
            name.setText("Routine Management System");
            description.setText(R.string.project_1);
            link.setText("https://github.com/Rifatrony/RoutineManagementSystem");
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),SingleProjectGithubLinkActivity.class);
                    intent.putExtra("git_link","Routine Link");
                    startActivity(intent);

                }
            });

            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),ProjectVideoActivity.class);
                    intent.putExtra("git_link","Routine Link");
                    startActivity(intent);
                }
            });
        }

        if (projectName.equals("Note App")){
            this.setTitle("Note App");
            imageView.setImageResource(R.drawable.notebook);
            name.setText("Note App Using Java");
            description.setText(R.string.project_1);
            link.setText("https://github.com/Rifatrony/Note-App");
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),SingleProjectGithubLinkActivity.class);
                    intent.putExtra("git_link","Note Link");
                    startActivity(intent);

                }
            });
            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),ProjectVideoActivity.class);
                    intent.putExtra("git_link","Note Link");
                    startActivity(intent);
                }
            });

        }

        if (projectName.equals("Face Mask Detection")){
            this.setTitle("Face Mask Detection");
            imageView.setImageResource(R.drawable.protection_mask   );
            name.setText("Human Face Mask Detection Using Deep Lraning");
            description.setText(R.string.project_1);
            link.setText("https://github.com/Rifatrony/Human-Face-Mask-Detection");
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),SingleProjectGithubLinkActivity.class);
                    intent.putExtra("git_link","Face Mask Link");
                    startActivity(intent);

                }
            });

            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),ProjectVideoActivity.class);
                    intent.putExtra("git_link","Face Mask Link");
                    startActivity(intent);
                }
            });
        }

        if (projectName.equals("SPA")){
            this.setTitle("Smart Pharmacy App");
            imageView.setImageResource(R.drawable.pharmacyb);
            name.setText("Smart Pharmacy App (Practicum Project)");
            description.setText(R.string.project_1);
            link.setText("https://github.com/Rifatrony/Pharmacy-App");
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),SingleProjectGithubLinkActivity.class);
                    intent.putExtra("git_link","SPA Link");
                    startActivity(intent);

                }
            });

            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),ProjectVideoActivity.class);
                    intent.putExtra("git_link","SPA Link");
                    startActivity(intent);
                }
            });

        }

        if (projectName.equals("Travelling App")){
            this.setTitle("Travelling App");
            imageView.setImageResource(R.drawable.traveler);
            name.setText("Travel Manager");
            description.setText(R.string.project_1);
            link.setText("");
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),SingleProjectGithubLinkActivity.class);
                    intent.putExtra("git_link","Travel Link");
                    startActivity(intent);

                }
            });

            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),ProjectVideoActivity.class);
                    intent.putExtra("git_link","Travel Link");
                    startActivity(intent);
                }
            });
        }

        if (projectName.equals("Poetry")){
            this.setTitle("Poetry App");
            imageView.setImageResource(R.drawable.poetry);
            name.setText("Poetry App Using Rest API");
            description.setText(R.string.project_1);
            link.setText("https://github.com/Rifatrony/PoetryApp");
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),SingleProjectGithubLinkActivity.class);
                    intent.putExtra("git_link","Poetry Link");
                    startActivity(intent);
                }
            });

            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),ProjectVideoActivity.class);
                    intent.putExtra("git_link","Poetry Link");
                    startActivity(intent);
                }
            });
        }

        if (projectName.equals("Portfolio")){
            this.setTitle("Portfolio App");
            imageView.setImageResource(R.drawable.portfolio);
            name.setText("My Portfolio");
            description.setText(R.string.project_1);
            link.setText("");
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),SingleProjectGithubLinkActivity.class);
                    intent.putExtra("git_link","Portfolio Link");
                    startActivity(intent);

                }
            });

            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),ProjectVideoActivity.class);
                    intent.putExtra("git_link","Portfolio Link");
                    startActivity(intent);
                }
            });
        }

        if (projectName.equals("Daily Cost")){
            this.setTitle("Daily Cost Management System");
            imageView.setImageResource(R.drawable.portfolio);
            name.setText("Daily Cost");
            description.setText(R.string.project_1);
            link.setText("");
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),SingleProjectGithubLinkActivity.class);
                    intent.putExtra("git_link","Daily Cost Link");
                    startActivity(intent);

                }
            });

            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),ProjectVideoActivity.class);
                    intent.putExtra("git_link","Daily Cost Link");
                    startActivity(intent);
                }
            });
        }

        if (projectName.equals("Dog and Cat")){
            this.setTitle("Dog and Cat Prediction");
            imageView.setImageResource(R.drawable.portfolio);
            name.setText("Dog and Cat Prediction Using tfLite");
            description.setText(R.string.project_8);
            link.setText("");
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),SingleProjectGithubLinkActivity.class);
                    intent.putExtra("git_link","Dog and Cat Link");
                    startActivity(intent);

                }
            });

            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),ProjectVideoActivity.class);
                    intent.putExtra("git_link","Daily Cost Link");
                    startActivity(intent);
                }
            });
        }

    }
}