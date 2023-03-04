package com.example.scouterapp;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    @SuppressLint("AppCompatMethod")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //DON'T CHANGE THIS IT WORKS WITHOUT THE CHANGE
        requestWindowFeature(Window.FEATURE_NO_TITLE);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);


        //Match Number
        EditText matchNumber = (EditText) findViewById(R.id.match_number_input);
        matchNumber.setTextColor(Color.WHITE);//set the red text color


        //Team Number
        EditText teamNumber = (EditText) findViewById(R.id.team_number_input);
        teamNumber.setTextColor(Color.WHITE);//set the red text color
        RadioButton Red = (RadioButton) findViewById(R.id.Red);
        RadioButton Blue = (RadioButton) findViewById(R.id.Blue);


        Button forward = (Button) findViewById(R.id.Forward_page_1);
        forward.setOnClickListener(new View.OnClickListener() {


            RadioButton Left = (RadioButton) findViewById(R.id.Left);
            RadioButton Mid = (RadioButton) findViewById(R.id.Middle);
            RadioButton Right = (RadioButton) findViewById(R.id.Right);


            @Override
            public void onClick(View v) {
                String Alliance = "";
                String DriverStation = "";
                if (Red.isChecked()) {
                    Alliance = (String) "Red";
                }

                if (Blue.isChecked()) {
                    Alliance = (String) "Blue";
                }


                if (Left.isChecked()) {
                    DriverStation = (String) "Left";
                }
                if (Mid.isChecked()) {
                    DriverStation = (String) "Middle";
                }
                if (Right.isChecked()) {
                    DriverStation = (String) "Right";
                }
                Intent i = new Intent(MainActivity.this, auto.class);
                i.putExtra("Match_Number", matchNumber.getText().toString());
                i.putExtra("Team_Number", teamNumber.getText().toString());
                i.putExtra("Alliance", Alliance);
                i.putExtra("Driver_Station", DriverStation);

                startActivity(i);
            }
        });


    }
    }