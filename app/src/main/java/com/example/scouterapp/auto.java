package com.example.scouterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.os.Bundle;
import java.util.Locale;

import android.widget.Chronometer;
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
import android.widget.Toast;

import java.util.Objects;

public class auto extends AppCompatActivity {
    public int counter;

    private boolean isRunning;
    private boolean wasRunning;


    String Team_Number;
    String Match_Number;
    // Is the stopwatch running?
    @SuppressLint("AppCompatMethod")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove Topbar + bottom Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_auto);

        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.textViewStopWatch); // initiate a chronometer

        //simpleChronometer.setFormat(""); // set the format for a chronometer

        Button startOrStopTextView = (Button) findViewById(R.id.startOrStopTextView);

        Button resetButton = (Button) findViewById(R.id.resetButton);


        startOrStopTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO If there is only one time we need to climb make it so that it always show the climbing time
                // ELSE Leave this how it is and save to variable
                simpleChronometer.setBase(SystemClock.elapsedRealtime());
                simpleChronometer.start();
            }
        });

        // perform click  event on stop button to stop the chronometer
        resetButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                simpleChronometer.stop();
                Toast.makeText(auto.this, "Climb time was : " + simpleChronometer.getText(), Toast.LENGTH_LONG).show();
                simpleChronometer.setBase(SystemClock.elapsedRealtime());
                simpleChronometer.stop();
            }
        });

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

        Button forward = (Button) findViewById(R.id.Forward_page_2);
        Button backward = (Button) findViewById(R.id.Backward_page_2);

        CheckBox cube = (CheckBox) findViewById(R.id.Cube_select);
        Boolean cube_engaged = cube.isChecked();

        CheckBox cone = (CheckBox) findViewById(R.id.Cone_select);
        Boolean cone_engaged = cone.isChecked();

        CheckBox x_button = (CheckBox) findViewById(R.id.X_select);
        Boolean x_button_engaged = x_button.isChecked();

        //grid checkboxes----------------------------------------
        CheckBox grid1 = (CheckBox) findViewById(R.id.grid_1);
        Boolean grid1_engaged = grid1.isChecked();

        CheckBox grid2 = (CheckBox) findViewById(R.id.grid_2);
        Boolean grid2_engaged = grid2.isChecked();

        CheckBox grid3 = (CheckBox) findViewById(R.id.grid_3);
        Boolean grid3_engaged = grid1.isChecked();

        CheckBox grid4 = (CheckBox) findViewById(R.id.grid_4);
        Boolean grid4_engaged = grid1.isChecked();

        CheckBox grid5 = (CheckBox) findViewById(R.id.grid_5);
        Boolean grid5_engaged = grid1.isChecked();

        CheckBox grid6 = (CheckBox) findViewById(R.id.grid_6);
        Boolean grid6_engaged = grid1.isChecked();

        CheckBox grid7 = (CheckBox) findViewById(R.id.grid_7);
        Boolean grid7_engaged = grid1.isChecked();

        CheckBox grid8 = (CheckBox) findViewById(R.id.grid_8);
        Boolean grid8_engaged = grid1.isChecked();

        CheckBox grid9 = (CheckBox) findViewById(R.id.grid_9);
        Boolean grid9_engaged = grid1.isChecked();

        CheckBox grid10 = (CheckBox) findViewById(R.id.grid_10);
        Boolean grid10_engaged = grid1.isChecked();

        CheckBox grid11 = (CheckBox) findViewById(R.id.grid_11);
        Boolean grid11_engaged = grid1.isChecked();

        CheckBox grid12 = (CheckBox) findViewById(R.id.grid_12);
        Boolean grid12_engaged = grid1.isChecked();

        CheckBox grid13 = (CheckBox) findViewById(R.id.grid_13);
        Boolean grid13_engaged = grid1.isChecked();

        CheckBox grid14 = (CheckBox) findViewById(R.id.grid_14);
        Boolean grid14_engaged = grid1.isChecked();

        CheckBox grid15 = (CheckBox) findViewById(R.id.grid_15);
        Boolean grid15_engaged = grid1.isChecked();

        CheckBox grid16 = (CheckBox) findViewById(R.id.grid_16);
        Boolean grid16_engaged = grid1.isChecked();

        CheckBox grid17 = (CheckBox) findViewById(R.id.grid_17);
        Boolean grid17_engaged = grid1.isChecked();

        CheckBox grid18 = (CheckBox) findViewById(R.id.grid_18);
        Boolean grid18_engaged = grid1.isChecked();

        CheckBox grid19 = (CheckBox) findViewById(R.id.grid_19);
        Boolean grid19_engaged = grid1.isChecked();

        CheckBox grid20 = (CheckBox) findViewById(R.id.grid_20);
        Boolean grid20_engaged = grid1.isChecked();

        CheckBox grid21 = (CheckBox) findViewById(R.id.grid_21);
        Boolean grid21_engaged = grid1.isChecked();

        CheckBox grid22 = (CheckBox) findViewById(R.id.grid_22);
        Boolean grid22_engaged = grid1.isChecked();

        CheckBox grid23 = (CheckBox) findViewById(R.id.grid_23);
        Boolean grid23_engaged = grid1.isChecked();

        CheckBox grid24 = (CheckBox) findViewById(R.id.grid_24);
        Boolean grid24_engaged = grid1.isChecked();

        CheckBox grid25 = (CheckBox) findViewById(R.id.grid_25);
        Boolean grid25_engaged = grid1.isChecked();

        CheckBox grid26 = (CheckBox) findViewById(R.id.grid_26);
        Boolean grid26_engaged = grid1.isChecked();

        CheckBox grid27 = (CheckBox) findViewById(R.id.grid_27);
        Boolean grid27_engaged = grid1.isChecked();

        cube.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO If there is only one time we need to climb make it so that it always show the climbing time
                // ELSE Leave this how it is and save to variable
                simpleChronometer.setBase(SystemClock.elapsedRealtime());
                simpleChronometer.start();
            }
        });

        cone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO If there is only one time we need to climb make it so that it always show the climbing time
                // ELSE Leave this how it is and save to variable
                simpleChronometer.setBase(SystemClock.elapsedRealtime());
                simpleChronometer.start();
            }
        });

        x_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO If there is only one time we need to climb make it so that it always show the climbing time
                // ELSE Leave this how it is and save to variable
                simpleChronometer.setBase(SystemClock.elapsedRealtime());
                simpleChronometer.start();
            }
        });



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