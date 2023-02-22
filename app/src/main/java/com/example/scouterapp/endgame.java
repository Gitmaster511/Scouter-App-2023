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
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.Toast;

import java.util.Objects;

public class endgame extends AppCompatActivity {
    String climb_time3 = "";

    @SuppressLint("AppCompatMethod")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





        Intent intent = getIntent();

        //Main
        String Match_Number = intent.getStringExtra("Match_Number");
        String Team_Number = intent.getStringExtra("Team_Number");
        String Alliance = intent.getStringExtra("Alliance");
        String Driver_Station = intent.getStringExtra("Driver_Station");




        //Auto
        String climb_time = intent.getStringExtra("climb_time");
        int First_array = intent.getIntExtra("First_array", 0);
        int Second_array = intent.getIntExtra("Second_array", 0);
        String Left_Community = intent.getStringExtra("Left_Community");
        String Docked_Engaged = intent.getStringExtra("Docked_Engaged");
        String assisted = intent.getStringExtra("assisted");
        String docked = intent.getStringExtra("docked");
        String engaged = intent.getStringExtra("engaged");

        //Teleop
        String cone_pickup_checked = intent.getStringExtra("cone_pickup_checked");
        String cube_pickup_checked = intent.getStringExtra("cube_pickup_checked");
        String station_cone_checked = intent.getStringExtra("station_cone_checked");
        String station_cube_checked = intent.getStringExtra("station_cube_checked");
        String ground_cone_checked = intent.getStringExtra("ground_cone_checked");
        String ground_cube_checked = intent.getStringExtra("ground_cube_checked");
        int final3 = intent.getIntExtra("final3", 0);
        int final4 = intent.getIntExtra("final4", 0);
        String climb_time2 = intent.getStringExtra("climb_time2");




        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_endgame);

        Button forward = (Button) findViewById(R.id.Forward_page_4);
        Button backward = (Button) findViewById(R.id.Backward_page_4);


        CheckBox attempted = (CheckBox) findViewById(R.id.attempted);
        Boolean attempted_checked = attempted.isChecked();

        CheckBox docked2 = (CheckBox) findViewById(R.id.docked);
        Boolean docked2_checked = docked2.isChecked();

        CheckBox engaged2 = (CheckBox) findViewById(R.id.engaged);
        Boolean engaged2_checked = engaged2.isChecked();

        CheckBox soloclimb = (CheckBox) findViewById(R.id.soloclimb);
        Boolean soloclimb_checked = soloclimb.isChecked();

        CheckBox gave_assistance = (CheckBox) findViewById(R.id.gave_assistance);
        Boolean gave_assistance_checked = gave_assistance.isChecked();


        CheckBox recieved_assistance = (CheckBox) findViewById(R.id.recieved_assistance);
        Boolean recieved_assistance_checked = recieved_assistance.isChecked();

        CheckBox parked = (CheckBox) findViewById(R.id.parked);
        Boolean parked_checked = parked.isChecked();


        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.endgameStopwatch); // initiate a chronometer

        //simpleChronometer.setFormat(""); // set the format for a chronometer

        Button startOrStopTextView = (Button) findViewById(R.id.start);

        Button resetButton = (Button) findViewById(R.id.reset);
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
                Toast.makeText(endgame.this, "Climb time was : " + simpleChronometer.getText(), Toast.LENGTH_LONG).show();
                simpleChronometer.stop();
                climb_time3 = (String) simpleChronometer.getText();

            }
        });






        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(endgame.this, notes.class);
                //First Page
                i.putExtra ( "Match_Number", Match_Number);
                i.putExtra ( "Team_Number", Team_Number);
                i.putExtra ( "Alliance", Alliance.toString());
                i.putExtra("Driver_Station: ",Driver_Station);




                //Second page
                i.putExtra("climb_time", climb_time);
                i.putExtra("First_array",First_array);
                i.putExtra("Second_array",Second_array);
                i.putExtra("Left_Community",Left_Community);
                i.putExtra("Docked_Engaged",Docked_Engaged);
                i.putExtra("assisted",assisted);
                i.putExtra("docked",docked);
                i.putExtra("engaged",engaged);


                //Third Page
                i.putExtra("cone_pickup_checked", cone_pickup_checked);
                i.putExtra("cube_pickup_checked",cube_pickup_checked);
                i.putExtra("station_cone_checked",station_cone_checked);
                i.putExtra("station_cube_checked",station_cube_checked);
                i.putExtra("ground_cone_checked",ground_cone_checked);
                i.putExtra("ground_cube_checked",ground_cube_checked);
                i.putExtra("final3",final3);
                i.putExtra("final4",final4);
                i.putExtra("climb_time2",climb_time2);

                //Fourth Page
                i.putExtra("attempted_checked", attempted_checked);
                i.putExtra("docked2_checked", docked2_checked);
                i.putExtra("engaged2_checked", engaged2_checked);
                i.putExtra("soloclimb_checked", soloclimb_checked);
                i.putExtra("gave_assistance_checked", gave_assistance_checked);
                i.putExtra("recieved_assistance_checked", recieved_assistance_checked);
                i.putExtra("parked_checked", parked_checked);
                i.putExtra("climb_time3", climb_time3);

                startActivity(i);
            }
        });

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(endgame.this, auto.class);
                startActivity(signup);
            }
        });




    }
}