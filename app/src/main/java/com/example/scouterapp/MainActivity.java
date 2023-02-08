package com.example.scouterapp;
import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.Toast;
import java.util.Objects;

//Could be removed


public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Remove topbar and bottombar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        Button forward = (Button) findViewById(R.id.Forward_page_1);

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(MainActivity.this, auto.class);
                startActivity(signup);
            }
        });




        //Match Number
        EditText matchNumber = (EditText) findViewById(R.id.match_number_input);
        matchNumber.setTextColor(Color.WHITE);//set the red text color
        //String matchNumberOutput = matchNumber.getText().toString();


        //Team Number
        EditText teamNumber = (EditText) findViewById(R.id.team_number_input);
        teamNumber.setTextColor(Color.WHITE);//set the red text color
        //String teamNumberOutput = teamNumber.getText().toString();

        //Radio Group, displays what button is pressed with Toast
        radioGroup = findViewById(R.id.driverStationButton);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on below line we are getting radio button from our group.
                RadioButton radioButton = findViewById(checkedId);
                // on below line we are displaying a toast message.
                Toast.makeText(MainActivity.this, "Drivers station is : " + radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        }
        );
    }
}
