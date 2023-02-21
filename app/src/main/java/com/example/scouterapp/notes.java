package com.example.scouterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

import java.util.Objects;

public class notes extends AppCompatActivity {
    String win = "";
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
        String First_array = intent.getStringExtra("First_array");
        String Second_array = intent.getStringExtra("Second_array");
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
        String final3 = intent.getStringExtra("final3");
        String final4 = intent.getStringExtra("final4");
        String climb_time2 = intent.getStringExtra("climb_time2");

        //Endgame
        String attempted_checked = intent.getStringExtra("attempted_checked");
        String docked2_checked = intent.getStringExtra("docked2_checked");
        String engaged2_checked = intent.getStringExtra("engaged2_checked");
        String soloclimb_checked = intent.getStringExtra("soloclimb_checked");
        String gave_assistance_checked = intent.getStringExtra("gave_assistance_checked");
        String recieved_assistance_checked = intent.getStringExtra("recieved_assistance_checked");
        String parked_checked = intent.getStringExtra("parked_checked");
        String climb_time3 = intent.getStringExtra("climb_time3");




        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_notes);
        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);


        Button forward = (Button) findViewById(R.id.Forward_page_4);
        Button backward = (Button) findViewById(R.id.Backward_page_4);
        ProgressBar slider = findViewById(R.id.seekBar);
        int aggression = (int) slider.getProgress();

        TextView additional = (EditText)findViewById(R.id.text_input);
        additional.getText().toString();

        RadioButton yes = (RadioButton) findViewById(R.id.yes);


        if (yes.isChecked())
        {
            win = "Yes";
        }

        else
        {
            win = "No";
        }


        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(notes.this, qr.class);
                //First Page
                i.putExtra("Match_Number: ",Match_Number);
                i.putExtra("Team_Number: ",Team_Number);
                i.putExtra("Alliance: ",Alliance);
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

                //Fifth Page
                i.putExtra("aggression", aggression);
                i.putExtra("additional", String.valueOf(additional));
                i.putExtra("win", win);
                startActivity(i);
            }
        });

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(notes.this, teleop.class);
                startActivity(signup);
            }
        });
    }
}