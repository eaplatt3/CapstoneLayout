package com.example.sickl.capstonelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JobSites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_sites);
    }

    public void select_btn(View v) {
        Intent startNewActivity = new Intent(v.getContext(), Job.class);
        startActivity(startNewActivity);
    }
}
