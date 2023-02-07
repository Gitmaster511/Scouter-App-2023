package com.example.scouterapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

//Could be removed


public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText inputText;
    String driverStation;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        // I don't like github + Android Studio



            //Match Number
        EditText matchNumber = (EditText) findViewById(R.id.match_number_input);
        matchNumber.setTextColor(Color.WHITE);//set the red text color
        String matchNumberOutput = matchNumber.getText().toString();


        //Team Number
        EditText teamNumber = (EditText) findViewById(R.id.team_number_input);
        teamNumber.setTextColor(Color.WHITE);//set the red text color
        String teamNumberOutput = teamNumber.getText().toString();

        //Radio Group, displays what button is pressed with Toast
        radioGroup = findViewById(R.id.driverStationButton);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on below line we are getting radio button from our group.
                RadioButton radioButton = findViewById(checkedId);
                // on below line we are displaying a toast message.
                Toast.makeText(MainActivity.this, "Selected Radio Button is : " + radioButton.getText(), Toast.LENGTH_SHORT).show();
            }});}}