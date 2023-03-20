package com.example.scouterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Objects;

public class notes extends AppCompatActivity {
    String win = "0";
    int aggression = 0;

    String types = "";


    @SuppressLint("AppCompatMethod")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Intent intent = getIntent();

        //Main
        String Match_Number = intent.getStringExtra("Match_Number");
        String Team_Number = intent.getStringExtra("Team_Number");
        String Alliance = intent.getStringExtra("Alliance");
        String Driver_Station = intent.getStringExtra("Driver_Station");



        //Auto
        String climb_time = intent.getStringExtra("climb_time");
        String auto_grid = intent.getStringExtra("auto_grid");
        String Second_array = intent.getStringExtra("Second_array");
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



        Button forward = (Button) findViewById(R.id.Forward_page_4);
        Button backward = (Button) findViewById(R.id.Backward_page_4);
        SeekBar slider = findViewById(R.id.seekBar);
        TextView additional = (EditText)findViewById(R.id.text_input);
        additional.setTextColor(Color.WHITE);

        RadioButton yes = (RadioButton) findViewById(R.id.yes);
        RadioButton no = (RadioButton) findViewById(R.id.no);


        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yes.isChecked())
                {
                    win = (String) "1";
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (no.isChecked())
                {
                    win = (String) "0";
                }
            }
        });



        RadioButton Full_cycler = (RadioButton) findViewById(R.id.Full_cycler);

        Full_cycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                types = (String) "Full_cycler";
            }
        });

        RadioButton Half_cycler = (RadioButton) findViewById(R.id.Half_cycler);
        Half_cycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                types = (String) "Half_cycler";
            }
        });


        RadioButton Feeder = (RadioButton) findViewById(R.id.Feeder);
        Feeder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                types = (String) "Feeder";
            }
        });

        RadioButton Defense = (RadioButton) findViewById(R.id.Defense);
        Defense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                types = (String) "Defense";
            }
        });


        Button clear = (Button) findViewById(R.id.goback);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideSoftKeyboard(v);
            }
        });

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String aggression_final = String.valueOf(aggression);


                String text = (String) additional.getText().toString();
                String strNew = text.replace(";", " ");
                String finalstr = strNew.replace(",", " ");

                int seekBarValue= slider.getProgress(); // get progress value from the Seek bar
                seekBarValue += 1;
                String bar = (String) String.valueOf(seekBarValue);

                Intent i = new Intent(notes.this, qr.class);
                //First Page
                i.putExtra ( "Match_Number", Match_Number);
                i.putExtra ( "Team_Number", Team_Number);
                i.putExtra ( "Alliance", Alliance);
                i.putExtra("Driver_Station",Driver_Station);

                //Second page
                i.putExtra("climb_time", climb_time);
                i.putExtra("auto_grid",auto_grid);
                i.putExtra("Second_array",Second_array);
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
                i.putExtra("aggression", bar);
                i.putExtra("aggression", bar);
                i.putExtra ("additional",finalstr);
                i.putExtra("type", types);
                i.putExtra("win", win);
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
    public void hideSoftKeyboard(View view){
        InputMethodManager imm =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
