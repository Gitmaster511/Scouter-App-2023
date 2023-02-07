package com.example.scouterapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText inputText;
    String driverStation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Match Number
        EditText matchNumber = (EditText) findViewById(R.id.match_number_input);
        matchNumber.setTextColor(Color.WHITE);//set the red text color
        String matchNumberOutput = matchNumber.getText().toString();


        //Team Number
        EditText teamNumber = (EditText) findViewById(R.id.team_number_input);
        teamNumber.setTextColor(Color.WHITE);//set the red text color
        String teamNumberOutput = teamNumber.getText().toString();




    }
    public void updateText(View view) {
        System.out.println("Button");
    }
}