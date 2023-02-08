package com.example.scouterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.os.Bundle;
import java.util.Locale;
import android.widget.TextView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class auto extends AppCompatActivity {
    public int counter;

    private boolean isRunning;
    private boolean wasRunning;

    // Is the stopwatch running?
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove Topbar + bottom Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_auto);

        CheckBox left_community = (CheckBox) findViewById(R.id.left_community);
        Boolean left_community_checked = left_community.isChecked();

        CheckBox Docked_Engaged = (CheckBox) findViewById(R.id.Docked_Engaged);
        Boolean Docked_Engaged_checked = Docked_Engaged.isChecked();


        CheckBox assisted = (CheckBox) findViewById(R.id.Assisted);
        Boolean assisted_checked = assisted.isChecked();

        CheckBox docked = (CheckBox) findViewById(R.id.Docked);
        Boolean docked_checked = docked.isChecked();


        CheckBox engaged = (CheckBox) findViewById(R.id.Engaged);
        Boolean engaged_engaged = engaged.isChecked();
        Button hi = (Button) findViewById(R.id.resetButton);

        Button forward = (Button) findViewById(R.id.Forward_page_2);
        Button backward = (Button) findViewById(R.id.Backward_page_2);


        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(auto.this, teleop.class);
                startActivity(signup);
            }
        });

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(auto.this, MainActivity.class);
                startActivity(signup);
            }
        });


    }}