package com.example.scouterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;

import java.util.Objects;

public class teleop extends AppCompatActivity {

    @SuppressLint("AppCompatMethod")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_teleop);

        Button forward = (Button) findViewById(R.id.Forward_page_3);
        Button backward = (Button) findViewById(R.id.Backward_page_3);
        Button startOrStopTextView = (Button) findViewById(R.id.startOrStopTextView);

        Button resetButton = (Button) findViewById(R.id.resetButton);

        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.textViewStopWatch); // initiate a chronometer

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
                simpleChronometer.setBase(SystemClock.elapsedRealtime());
                Toast.makeText(teleop.this, "Climb time was : " + simpleChronometer.getText(), Toast.LENGTH_LONG).show();
                simpleChronometer.stop();
            }
        });


        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(teleop.this, endgame.class);
                startActivity(signup);
            }
        });

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(teleop.this, auto.class);
                startActivity(signup);
            }
        });
    }

}