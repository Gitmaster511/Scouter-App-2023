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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Objects;

public class teleop extends AppCompatActivity {
    public int counter;
    private boolean isRunning;
    private boolean wasRunning;
    String climb_time = "";

    int grid1_first = 0;
    int grid1_second = 0;
    int grid2_first = 0;
    int grid2_second = 0;
    int grid3_first = 0;
    int grid3_second = 0;
    int grid4_first = 0;
    int grid4_second = 0;
    int grid5_first = 0;
    int grid5_second = 0;
    int grid6_first = 0;
    int grid6_second = 0;
    int grid7_first = 0;
    int grid7_second = 0;
    int grid8_first = 0;
    int grid8_second = 0;
    int grid9_first = 0;
    int grid9_second = 0;

    int grid10_first = 0;
    int grid10_second = 0;
    int grid11_first = 0;
    int grid11_second = 0;
    int grid12_first = 0;
    int grid12_second = 0;
    int grid13_first = 0;
    int grid13_second = 0;
    int grid14_first = 0;
    int grid14_second = 0;
    int grid15_first = 0;
    int grid15_second = 0;
    int grid16_first = 0;
    int grid16_second = 0;
    int grid17_first = 0;
    int grid17_second = 0;
    int grid18_first = 0;
    int grid18_second = 0;

    int grid19_first = 0;
    int grid19_second = 0;
    int grid20_first = 0;
    int grid20_second = 0;
    int grid21_first = 0;
    int grid21_second = 0;
    int grid22_first = 0;
    int grid22_second = 0;
    int grid23_first = 0;
    int grid23_second = 0;
    int grid24_first = 0;
    int grid24_second = 0;
    int grid25_first = 0;
    int grid25_second = 0;
    int grid26_first = 0;
    int grid26_second = 0;
    int grid27_first = 0;
    int grid27_second = 0;


    String Team_Number;
    String Match_Number;
    @SuppressLint("AppCompatMethod")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_teleop);

        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);


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

        Button forward = (Button) findViewById(R.id.Forward_page_3);
        Button backward = (Button) findViewById(R.id.Backward_page_3);

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
                Intent signup = new Intent(teleop.this, teleop.class);
                startActivity(signup);
            }
        });

        CheckBox cone_pickup = (CheckBox) findViewById(R.id.Conepickup);
        Boolean cone_pickup_checked = cone_pickup.isChecked();

        CheckBox cube_pickup = (CheckBox) findViewById(R.id.Cubepickup);
        Boolean cube_pickup_checked = cube_pickup.isChecked();

        CheckBox station_cone = (CheckBox) findViewById(R.id.Station_cone);
        Boolean station_cone_checked = station_cone.isChecked();

        CheckBox station_cube = (CheckBox) findViewById(R.id.Station_cube);
        Boolean station_cube_checked = station_cube.isChecked();

        CheckBox ground_cone = (CheckBox) findViewById(R.id.Ground_cone);
        Boolean ground_cone_checked = ground_cone.isChecked();

        CheckBox ground_cube = (CheckBox) findViewById(R.id.Ground_cube);
        Boolean ground_cube_checked = ground_cube.isChecked();

        int [][] final1 = new int[3][9];
        final1[0] = new int[]{grid1_first, grid2_first, grid3_first, grid4_first, grid5_first, grid6_first, grid7_first, grid8_first, grid9_first};
        final1[1] = new int[]{grid10_first, grid11_first, grid12_first, grid13_first, grid14_first, grid15_first, grid16_first, grid17_first, grid18_first};
        final1[2] = new int[]{grid19_first, grid20_first, grid21_first, grid22_first, grid23_first, grid24_first, grid25_first, grid26_first, grid27_first};

        int [][] final2 = new int[3][9];
        final2[0] = new int[]{grid1_second, grid2_second, grid3_second, grid4_second, grid5_second, grid6_second, grid7_second, grid8_second, grid9_second};
        final2[1] = new int[]{grid10_second, grid11_second, grid12_second, grid13_second, grid14_second, grid15_second, grid16_second, grid17_second, grid18_second};
        final2[2] = new int[]{grid19_second, grid20_second, grid21_second, grid22_second, grid23_second, grid24_second, grid25_second, grid26_second, grid27_second};


        forward.setOnClickListener(new View.OnClickListener() {

//************************This Here******************* the intent i variable maybe needs fixing
            @Override
            public void onClick(View v) {
                Intent i = new Intent(teleop.this, teleop.class);
                i.putExtra("climb_time", climb_time);
                i.putExtra("First_array",final1);
                i.putExtra("First_array",final2);

                startActivity(i);
            }
        });








        RadioButton grid1 = (RadioButton) findViewById(R.id.grid_1);
        RadioButton grid2 = (RadioButton) findViewById(R.id.grid_2);
        RadioButton grid3 = (RadioButton) findViewById(R.id.grid_3);
        RadioButton grid4 = (RadioButton) findViewById(R.id.grid_4);
        RadioButton grid5 = (RadioButton) findViewById(R.id.grid_5);
        RadioButton grid6 = (RadioButton) findViewById(R.id.grid_6);
        RadioButton grid7 = (RadioButton) findViewById(R.id.grid_7);
        RadioButton grid8 = (RadioButton) findViewById(R.id.grid_8);
        RadioButton grid9 = (RadioButton) findViewById(R.id.grid_9);
        RadioButton grid10 = (RadioButton) findViewById(R.id.grid_10);
        RadioButton grid11 = (RadioButton) findViewById(R.id.grid_11);
        RadioButton grid12 = (RadioButton) findViewById(R.id.grid_12);
        RadioButton grid13 = (RadioButton) findViewById(R.id.grid_13);
        RadioButton grid14 = (RadioButton) findViewById(R.id.grid_14);
        RadioButton grid15 = (RadioButton) findViewById(R.id.grid_15);
        RadioButton grid16 = (RadioButton) findViewById(R.id.grid_16);
        RadioButton grid17 = (RadioButton) findViewById(R.id.grid_17);
        RadioButton grid18 = (RadioButton) findViewById(R.id.grid_18);
        RadioButton grid19 = (RadioButton) findViewById(R.id.grid_19);
        RadioButton grid20 = (RadioButton) findViewById(R.id.grid_20);
        RadioButton grid21 = (RadioButton) findViewById(R.id.grid_21);
        RadioButton grid22 = (RadioButton) findViewById(R.id.grid_22);
        RadioButton grid23 = (RadioButton) findViewById(R.id.grid_23);
        RadioButton grid24 = (RadioButton) findViewById(R.id.grid_24);
        RadioButton grid25 = (RadioButton) findViewById(R.id.grid_25);
        RadioButton grid26 = (RadioButton) findViewById(R.id.grid_26);
        RadioButton grid27 = (RadioButton) findViewById(R.id.grid_27);









        RadioGroup shape = (RadioGroup) findViewById(R.id.shape);
        RadioButton cube = (RadioButton) findViewById(R.id.Cube_select);
        RadioButton cone = (RadioButton) findViewById(R.id.Cone_select);
        RadioButton x = (RadioButton) findViewById(R.id.X_select);
        RadioGroup row1 = (RadioGroup) findViewById(R.id.row1);
        RadioGroup row2 = (RadioGroup) findViewById(R.id.row2);
        RadioGroup row3 = (RadioGroup) findViewById(R.id.row3);

        row1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on below line we are getting radio button from our group.
                if (grid1.isChecked() && cube.isChecked()) {
                    grid1_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid1 Cube Selected", Toast.LENGTH_SHORT).show();
                    Toast.makeText(teleop.this, "The number is: " + grid1_first, Toast.LENGTH_SHORT).show();

                }
                else if (grid1.isChecked() && cone.isChecked()) {
                    grid1_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid1 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid1.isChecked() && x.isChecked()) {
                    grid1_second += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid1 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid2.isChecked() && cube.isChecked()) {
                    grid2_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid2 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid2.isChecked() && cone.isChecked()) {
                    grid2_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid2 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid2.isChecked() && x.isChecked()) {
                    grid2_second += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid2 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid3.isChecked() && cube.isChecked()) {
                    grid3_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid3 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid3.isChecked() && cone.isChecked()) {
                    grid3_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid3 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid3.isChecked() && x.isChecked()) {
                    grid3_second += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid3 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid4.isChecked() && cube.isChecked()) {
                    grid4_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid4 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid4.isChecked() && cone.isChecked()) {
                    grid4_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid4 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid4.isChecked() && x.isChecked()) {
                    grid4_second += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid4 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid5.isChecked() && cube.isChecked()) {
                    grid5_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid5 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid5.isChecked() && cone.isChecked()) {
                    grid5_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid5 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid5.isChecked() && x.isChecked()) {
                    grid5_second += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid5 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid6.isChecked() && cube.isChecked()) {
                    grid6_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid6 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid6.isChecked() && cone.isChecked()) {
                    grid6_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid6 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid6.isChecked() && x.isChecked()) {
                    grid6_second += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid6 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid7.isChecked() && cube.isChecked()) {
                    grid7_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid7 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid7.isChecked() && cone.isChecked()) {
                    grid7_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid7 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid7.isChecked() && x.isChecked()) {
                    grid7_second += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid7 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid8.isChecked() && cube.isChecked()) {
                    grid8_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid8 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid8.isChecked() && cone.isChecked()) {
                    grid8_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid8 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid8.isChecked() && x.isChecked()) {
                    grid8_second += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid8 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid9.isChecked() && cube.isChecked()) {
                    grid9_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid9 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid9.isChecked() && cone.isChecked()) {
                    grid9_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid9 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid9.isChecked() && x.isChecked()) {
                    grid9_second += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid9 X Selected", Toast.LENGTH_SHORT).show();
                }



            }
        });




        row2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on below line we are getting radio button from our group.
                if (grid10.isChecked() && cube.isChecked()) {
                    grid10_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid10 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid10.isChecked() && cone.isChecked()) {
                    grid10_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid10 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid10.isChecked() && x.isChecked()) {
                    grid10_second += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid10 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid11.isChecked() && cube.isChecked()) {
                    grid11_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid11 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid11.isChecked() && cone.isChecked()) {
                    grid11_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid11 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid11.isChecked() && x.isChecked()) {
                    grid11_second += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid11 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid12.isChecked() && cube.isChecked()) {
                    grid12_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid12 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid12.isChecked() && cone.isChecked()) {
                    grid12_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid12 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid12.isChecked() && x.isChecked()) {
                    grid12_second += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid12 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid13.isChecked() && cube.isChecked()) {
                    grid13_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid13 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid13.isChecked() && cone.isChecked()) {
                    grid13_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid13 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid13.isChecked() && x.isChecked()) {
                    grid13_second += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid13 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid14.isChecked() && cube.isChecked()) {
                    grid14_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid14 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid14.isChecked() && cone.isChecked()) {
                    grid14_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid14 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid14.isChecked() && x.isChecked()) {
                    grid14_second += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid14 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid15.isChecked() && cube.isChecked()) {
                    grid15_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid15 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid15.isChecked() && cone.isChecked()) {
                    grid15_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid15 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid15.isChecked() && x.isChecked()) {
                    grid15_second += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid15 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid16.isChecked() && cube.isChecked()) {
                    grid16_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid16 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid16.isChecked() && cone.isChecked()) {
                    grid16_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid16 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid16.isChecked() && x.isChecked()) {
                    grid16_second += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid16 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid17.isChecked() && cube.isChecked()) {
                    grid17_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid17 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid17.isChecked() && cone.isChecked()) {
                    grid17_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid17 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid17.isChecked() && x.isChecked()) {
                    grid17_second += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid17 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid18.isChecked() && cube.isChecked()) {
                    grid18_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid18 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid18.isChecked() && cone.isChecked()) {
                    grid18_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid18 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid18.isChecked() && x.isChecked()) {
                    grid18_second += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid18 X Selected", Toast.LENGTH_SHORT).show();
                }













            }
        });

        row3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on below line we are getting radio button from our group.
                if (grid19.isChecked() && cube.isChecked()) {
                    grid19_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid19 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid19.isChecked() && cone.isChecked()) {
                    grid19_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid19 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid19.isChecked() && x.isChecked()) {
                    grid19_second += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid19 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid20.isChecked() && cube.isChecked()) {
                    grid20_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid20 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid20.isChecked() && cone.isChecked()) {
                    grid20_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid20 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid20.isChecked() && x.isChecked()) {
                    grid20_second += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid20 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid21.isChecked() && cube.isChecked()) {
                    grid21_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid21 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid21.isChecked() && cone.isChecked()) {
                    grid21_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid21 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid21.isChecked() && x.isChecked()) {
                    grid21_second += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid21 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid22.isChecked() && cube.isChecked()) {
                    grid22_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid22 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid22.isChecked() && cone.isChecked()) {
                    grid22_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid22 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid22.isChecked() && x.isChecked()) {
                    grid22_second += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid22 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid23.isChecked() && cube.isChecked()) {
                    grid23_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid23 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid23.isChecked() && cone.isChecked()) {
                    grid23_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid23 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid23.isChecked() && x.isChecked()) {
                    grid23_second += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid23 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid24.isChecked() && cube.isChecked()) {
                    grid24_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid24 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid24.isChecked() && cone.isChecked()) {
                    grid24_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid24 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid24.isChecked() && x.isChecked()) {
                    grid24_second += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid24 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid25.isChecked() && cube.isChecked()) {
                    grid25_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid25 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid25.isChecked() && cone.isChecked()) {
                    grid25_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid25 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid25.isChecked() && x.isChecked()) {
                    grid25_second += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid25 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid26.isChecked() && cube.isChecked()) {
                    grid26_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid26 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid26.isChecked() && cone.isChecked()) {
                    grid26_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid26 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid26.isChecked() && x.isChecked()) {
                    grid26_second += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid26 X Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid27.isChecked() && cube.isChecked()) {
                    grid27_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid27 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid27.isChecked() && cone.isChecked()) {
                    grid27_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid27 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid27.isChecked() && x.isChecked()) {
                    grid27_second += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid27 X Selected", Toast.LENGTH_SHORT).show();
                }













            }
        });
    }


}