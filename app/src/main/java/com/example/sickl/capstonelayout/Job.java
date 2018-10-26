package com.example.sickl.capstonelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Job extends AppCompatActivity {

    TextView plantxt;
    TextView tasktxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);

        plantxt = findViewById(R.id.job_plans);
        tasktxt = findViewById(R.id.job_tasks);

        plantxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivity = new Intent(v.getContext(), Plans.class);
                startActivity(startNewActivity);
            }
        });

        tasktxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivity = new Intent(v.getContext(), Tasks.class);
                startActivity(startNewActivity);
            }
        });



    }
}
