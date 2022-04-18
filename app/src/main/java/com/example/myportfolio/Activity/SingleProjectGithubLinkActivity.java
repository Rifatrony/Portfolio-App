package com.example.myportfolio.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myportfolio.R;

public class SingleProjectGithubLinkActivity extends AppCompatActivity {

    WebView webView;
    //ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_project_github_link);

        this.setTitle("Github Link");

        //Add back Button on tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        webView= findViewById(R.id.githubProjectWebView);
        //pd = new ProgressDialog(this);

        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String projectLink = bundle.getString("git_link");
            showDetails(projectLink);
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

    private void showDetails(String projectLink) {

        if (projectLink.equals("Routine Link")){

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings.setDomStorageEnabled(true);

            webView.setWebViewClient(new Callback());
            webView.loadUrl("https://github.com/Rifatrony/RoutineManagementSystem");
            /*pd.setTitle("Loading");
            pd.show();*/
        }

        if (projectLink.equals("Note Link")){

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings.setDomStorageEnabled(true);

            webView.setWebViewClient(new Callback());
            webView.loadUrl("https://github.com/Rifatrony/Note-App");
            /*pd.setTitle("Loading");
            pd.show();*/
        }

        if (projectLink.equals("Face Mask Link")){

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings.setDomStorageEnabled(true);

            webView.setWebViewClient(new Callback());
            webView.loadUrl("https://github.com/Rifatrony/Human-Face-Mask-Detection");
            /*pd.setTitle("Loading");
            pd.show();*/
        }

        if (projectLink.equals("SPA Link")){

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings.setDomStorageEnabled(true);

            webView.setWebViewClient(new Callback());
            webView.loadUrl("https://github.com/Rifatrony/Pharmacy-App");
            /*pd.setTitle("Loading");
            pd.show();*/
        }

        if (projectLink.equals("Travel Link")){

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings.setDomStorageEnabled(true);

            webView.setWebViewClient(new Callback());
            webView.loadUrl("https://github.com/Rifatrony/RoutineManagementSystem");
            /*pd.setTitle("Loading");
            pd.show();*/
        }

        if (projectLink.equals("Poetry Link")){

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings.setDomStorageEnabled(true);

            webView.setWebViewClient(new Callback());
            webView.loadUrl("https://github.com/Rifatrony/PoetryApp");
            /*pd.setTitle("Loading");
            pd.show();*/
        }

        if (projectLink.equals("Portfolio Link")){

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings.setDomStorageEnabled(true);

            webView.setWebViewClient(new Callback());
            webView.loadUrl("https://github.com/Rifatrony/RoutineManagementSystem");
            /*pd.setTitle("Loading");
            pd.show();*/
        }

        if (projectLink.equals("Daily Cost Link")){

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings.setDomStorageEnabled(true);

            webView.setWebViewClient(new Callback());
            webView.loadUrl("https://github.com/Rifatrony/RoutineManagementSystem");
            /*pd.setTitle("Loading");
            pd.show();*/
        }

        if (projectLink.equals("Dog and Cat Link")){

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings.setDomStorageEnabled(true);

            webView.setWebViewClient(new Callback());
            webView.loadUrl("https://github.com/Rifatrony/RoutineManagementSystem");
            /*pd.setTitle("Loading");
            pd.show();*/
        }

    }
    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }
        else {
            finish();
        }
    }
}