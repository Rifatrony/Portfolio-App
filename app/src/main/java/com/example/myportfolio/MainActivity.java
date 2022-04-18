package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myportfolio.Activity.EducationActivity;
import com.example.myportfolio.Activity.GithubActivity;
import com.example.myportfolio.Activity.LinkedinActivity;
import com.example.myportfolio.Activity.ProjectsActivity;
import com.example.myportfolio.Activity.ResumeActivity;
import com.example.myportfolio.Activity.SkillsActivity;
import com.example.myportfolio.Activity.WorkExperienceActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView contactTextView;

    LinearLayout project, skills, work_experience, github, linkedin, education;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();
        addListener();



        contactTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801628979644"));
                startActivity(intent);
            }
        });

    }



    private void initialization() {

        contactTextView = findViewById(R.id.contactTextViewId);

        project = findViewById(R.id.projectsLayoutId);
        skills = findViewById(R.id.skillsLayoutId);
        work_experience = findViewById(R.id.workExperienceLayoutId);
        github = findViewById(R.id.githubLinearLayout);
        linkedin = findViewById(R.id.linkedinLinearLayout);
        education = findViewById(R.id.educationLinearLayout);

        btn = findViewById(R.id.resumeButton);

    }

    private void addListener() {

        project.setOnClickListener(this);
        skills.setOnClickListener(this);
        work_experience.setOnClickListener(this);
        github.setOnClickListener(this);
        linkedin.setOnClickListener(this);
        education.setOnClickListener(this);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.projectsLayoutId){
            Intent intent = new Intent(getApplicationContext(), ProjectsActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.skillsLayoutId){
            Intent intent = new Intent(getApplicationContext(), SkillsActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.workExperienceLayoutId){
            Intent intent = new Intent(getApplicationContext(), WorkExperienceActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.githubLinearLayout){
            Intent intent = new Intent(getApplicationContext(), GithubActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.linkedinLinearLayout){
            Intent intent = new Intent(getApplicationContext(), LinkedinActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.educationLinearLayout){
            Intent intent = new Intent(getApplicationContext(), EducationActivity.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.resumeButton){
            Intent intent = new Intent(getApplicationContext(), ResumeActivity.class);
            startActivity(intent);
        }



    }
}