package com.example.scouterapp;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.util.Objects;

//Could be removed


public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    String Alliance;
    String driver_station;
    String d = "sharedPrefs";





    @SuppressLint("AppCompatMethod")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Remove topbar and bottombar


        //DON'T CHANGE THIS IT WORKS WITHOUT THE CHANGE
        requestWindowFeature(Window.FEATURE_NO_TITLE);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        //Match Number
        EditText matchNumber = (EditText) findViewById(R.id.match_number_input);
        matchNumber.setTextColor(Color.WHITE);//set the red text color
        //String matchNumberOutput = matchNumber.getText().toString();


        //Team Number
        EditText teamNumber = (EditText) findViewById(R.id.team_number_input);
        teamNumber.setTextColor(Color.WHITE);//set the red text color
        //String teamNumberOutput = teamNumber.getText().toString();





        Button forward = (Button) findViewById(R.id.Forward_page_1);
        forward.setOnClickListener(new View.OnClickListener() {
            RadioButton Red = (RadioButton) findViewById(R.id.Red);
            RadioButton Blue = (RadioButton) findViewById(R.id.Blue);

            RadioButton Left = (RadioButton) findViewById(R.id.Left);
            RadioButton Mid = (RadioButton) findViewById(R.id.Middle);
            RadioButton Right = (RadioButton) findViewById(R.id.Right);



            @Override
            public void onClick(View v) {
                String Alliance = "";
                String DriverStation = "";



                if (Red.isChecked())
                {
                    Alliance = "Red";
                }

                else
                {
                    Alliance = "Blue";
                }


                if(Left.isChecked())
                {
                    DriverStation = "Left";
                }
                if(Mid.isChecked())
                {
                    DriverStation = "Middle";
                }
                if(Right.isChecked())
                {
                    DriverStation = "Right";
                }

                Intent signup = new Intent(MainActivity.this, auto.class);
                String match_number_final = matchNumber.getText().toString();
                String teamNumber_final = teamNumber.getText().toString();
                signup.putExtra("Match_Number: ",match_number_final);
                signup.putExtra("Team_Number: ",teamNumber_final);

                signup.putExtra("Alliance: ",Alliance);
                signup.putExtra("Driver_Station: ",DriverStation);

                startActivity(signup);
                finish();
            }
        });





        //Radio Group, displays what button is pressed with Toast
        radioGroup = findViewById(R.id.driverStationButton);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on below line we are getting radio button from our group.
                RadioButton radioButton = findViewById(checkedId);
                }
        }
        );
    }
}
