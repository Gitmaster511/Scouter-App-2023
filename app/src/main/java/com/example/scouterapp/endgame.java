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
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.Objects;

public class endgame extends AppCompatActivity {
    String climb_time3 = "";

    String docked2_checked = "0";
    String attempted_checked = "0";
    String engaged2_checked = "0";
    String soloclimb_checked = "0";
    String gave_assistance_checked = "0";
    String recieved_assistance_checked = "0";
    String parked_checked = "0";

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
        String auto_grid = intent.getStringExtra("auto_grid");
        //String Second_array = intent.getStringExtra("Second_array");
        String left_community_checked = intent.getStringExtra("left_community_checked");
        String Docked_Engaged_checked = intent.getStringExtra("Docked_Engaged_checked");
        String docked_checked = intent.getStringExtra("docked_checked");
        String engaged_checked = intent.getStringExtra("engaged_checked");


        //Teleop
        String cone_pickup_checked = intent.getStringExtra("cone_pickup_checked");
        String cube_pickup_checked = intent.getStringExtra("cube_pickup_checked");
        String station_cone_checked = intent.getStringExtra("station_cone_checked");
        String station_cube_checked = intent.getStringExtra("station_cube_checked");
        String ground_cone_checked = intent.getStringExtra("ground_cone_checked");
        String ground_cube_checked = intent.getStringExtra("ground_cube_checked");
        String teleop_grid = intent.getStringExtra("teleop_grid");
        String climb_time2 = intent.getStringExtra("climb_time2");




        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_endgame);

        Button forward = (Button) findViewById(R.id.Forward_page_4);
        Button backward = (Button) findViewById(R.id.Backward_page_4);



        CheckBox attempted = (CheckBox) findViewById(R.id.attempted);
        attempted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (attempted.isChecked()) {
                    attempted_checked = (String) "1";
                }

            }
        });




        CheckBox docked2 = (CheckBox) findViewById(R.id.docked);
        docked2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (docked2.isChecked()) {
                    docked2_checked = (String) "1";
                }
            }
        });

        CheckBox engaged2 = (CheckBox) findViewById(R.id.engaged);

        engaged2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( engaged2.isChecked()) {
                    engaged2_checked = (String) "1";
                }

            }
        });

        CheckBox soloclimb = (CheckBox) findViewById(R.id.soloclimb);
        soloclimb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (soloclimb.isChecked()) {
                    soloclimb_checked = (String) "1";
                }
            }
        });

        CheckBox gave_assistance = (CheckBox) findViewById(R.id.gave_assistance);

        gave_assistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gave_assistance.isChecked()) {
                    gave_assistance_checked = (String) "1";
                }

            }
        });


        CheckBox recieved_assistance = (CheckBox) findViewById(R.id.recieved_assistance);

        recieved_assistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                recieved_assistance_checked = (String) "1";
            }
        });

        CheckBox parked = (CheckBox) findViewById(R.id.parked);

        parked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (parked.isChecked()) {
                    parked_checked = (String) "1";
                }
            }
        });

        SeekBar cycletime = (SeekBar) findViewById(R.id.seekBar);








        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(endgame.this, notes.class);
                //First Page
                i.putExtra ( "Match_Number", Match_Number);
                i.putExtra ( "Team_Number", Team_Number);
                i.putExtra ( "Alliance", Alliance.toString());
                i.putExtra("Driver_Station",Driver_Station);





                //Second page
                i.putExtra("climb_time", climb_time);
                i.putExtra("auto_grid",auto_grid);
                //i.putExtra("Second_array",Second_array);
                i.putExtra("left_community_checked",left_community_checked);
                i.putExtra("Docked_Engaged_checked",Docked_Engaged_checked);
                i.putExtra("docked_checked",docked_checked);
                i.putExtra("engaged_checked",engaged_checked);


                //Third Page
                i.putExtra("cone_pickup_checked", cone_pickup_checked);
                i.putExtra("cube_pickup_checked",cube_pickup_checked);
                i.putExtra("station_cone_checked",station_cone_checked);
                i.putExtra("station_cube_checked",station_cube_checked);
                i.putExtra("ground_cone_checked",ground_cone_checked);
                i.putExtra("ground_cube_checked",ground_cube_checked);
                i.putExtra("teleop_grid",teleop_grid);
                //i.putExtra("final4",final4);
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
                onBackPressed();
            }
        });




    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}