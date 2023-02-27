package com.example.scouterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
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

import java.util.Arrays;
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
    String cone_pickup_checked = "0";
    String ground_cone_checked = "0";
    String station_cube_checked = "0";
    String station_cone_checked = "0";
    String cube_pickup_checked = "0";
    String ground_cube_checked = "0";


    String climb_time2 = "";


    String Team_Number;
    String Match_Number;
    @SuppressLint("AppCompatMethod")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        Intent intent = getIntent();

        //First Page
        String Match_Number = intent.getStringExtra("Match_Number");
        String Team_Number = intent.getStringExtra("Team_Number");
        String Alliance = intent.getStringExtra("Alliance");
        String Driver_Station = intent.getStringExtra("Driver_Station");








        //Auto
        String climb_time = intent.getStringExtra("climb_time");
        String First_array = intent.getStringExtra("First_array");
        String Second_array = intent.getStringExtra("Second_array");
        String left_community_checked = intent.getStringExtra("left_community_checked");
        String Docked_Engaged_checked = intent.getStringExtra("Docked_Engaged_checked");
        String assisted_checked = intent.getStringExtra("assisted_checked");
        String docked_checked = intent.getStringExtra("docked_checked");
        String engaged_checked = intent.getStringExtra("engaged_checked");










        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_teleop);



        // perform click  event on stop button to stop the chronometer


        Button forward = (Button) findViewById(R.id.Forward_page_3);
        Button backward = (Button) findViewById(R.id.Backward_page_3);

        CheckBox cone_pickup = (CheckBox) findViewById(R.id.Conepickup);

        cone_pickup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cone_pickup_checked = (String) "1";


            }
        });


        CheckBox cube_pickup = (CheckBox) findViewById(R.id.Cubepickup);
        cube_pickup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cube_pickup_checked = (String) "1";

            }
        });



        CheckBox station_cone = (CheckBox) findViewById(R.id.Station_cone);

        station_cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                station_cone_checked = (String) "1";

            }
        });

        CheckBox station_cube = (CheckBox) findViewById(R.id.Station_cube);
        station_cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                station_cube_checked = (String) "1";
            }
        });

        CheckBox ground_cone = (CheckBox) findViewById(R.id.Ground_cone);
        ground_cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ground_cone_checked = (String) "1";
            }
        });


        CheckBox ground_cube = (CheckBox) findViewById(R.id.Ground_cube);
        ground_cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ground_cube_checked = (String) "1";


            }
        });




        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int [][] final3 = new int[3][9];
                final3[0] = new int[]{grid1_first, grid2_first, grid3_first, grid4_first, grid5_first, grid6_first, grid7_first, grid8_first, grid9_first};
                final3[1] = new int[]{grid10_first, grid11_first, grid12_first, grid13_first, grid14_first, grid15_first, grid16_first, grid17_first, grid18_first};
                final3[2] = new int[]{grid19_first, grid20_first, grid21_first, grid22_first, grid23_first, grid24_first, grid25_first, grid26_first, grid27_first};

                int [][] final4 = new int[3][9];
                final4[0] = new int[]{grid1_second, grid2_second, grid3_second, grid4_second, grid5_second, grid6_second, grid7_second, grid8_second, grid9_second};
                final4[1] = new int[]{grid10_second, grid11_second, grid12_second, grid13_second, grid14_second, grid15_second, grid16_second, grid17_second, grid18_second};
                final4[2] = new int[]{grid19_second, grid20_second, grid21_second, grid22_second, grid23_second, grid24_second, grid25_second, grid26_second, grid27_second};

                String final33 = Arrays.deepToString(final3);
                String final44 = Arrays.deepToString(final4);



                Intent i = new Intent(teleop.this, endgame.class);




                //First Page
                i.putExtra ( "Match_Number", Match_Number);
                i.putExtra ( "Team_Number", Team_Number);
                i.putExtra ( "Alliance", Alliance.toString());
                i.putExtra("Driver_Station",Driver_Station);


                //Second page
                i.putExtra("climb_time", climb_time);
                i.putExtra("First_array",First_array);
                i.putExtra("Second_array",Second_array);


                i.putExtra("left_community_checked",left_community_checked);
                i.putExtra("Docked_Engaged_checked",Docked_Engaged_checked);
                i.putExtra("assisted_checked",assisted_checked);
                i.putExtra("docked_checked",docked_checked);
                i.putExtra("engaged_checked",engaged_checked);


                //Third Page
                i.putExtra("cone_pickup_checked", cone_pickup_checked);
                i.putExtra("cube_pickup_checked",cube_pickup_checked);
                i.putExtra("station_cone_checked",station_cone_checked);
                i.putExtra("station_cube_checked",station_cube_checked);
                i.putExtra("ground_cone_checked",ground_cone_checked);
                i.putExtra("ground_cube_checked",ground_cube_checked);
                i.putExtra("final3",final33);
                i.putExtra("final4",final44);
                i.putExtra("climb_time2",climb_time2);


                startActivity(i);
            }
        });

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
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
        RadioGroup shape2 = (RadioGroup) findViewById(R.id.shape2);


        RadioButton Cube2 = (RadioButton) findViewById(R.id.Cube_select2);
        RadioButton Cone2 = (RadioButton) findViewById(R.id.Cone_select2);

        //RadioButton x = (RadioButton) findViewById(R.id.X_select);
        RadioGroup row1 = (RadioGroup) findViewById(R.id.row1);
        RadioGroup row2 = (RadioGroup) findViewById(R.id.row2);
        RadioGroup row3 = (RadioGroup) findViewById(R.id.row3);

        Button reset = (Button) findViewById(R.id.Reset_Field);

        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                shape.clearCheck();
                row1.clearCheck();
                row2.clearCheck();
                row3.clearCheck();
            }
        });


        AlertDialog.Builder cube_message = new AlertDialog.Builder(teleop.this);
        cube_message.setMessage("Cube can't be placed there");
        cube_message.setCancelable(true);

        cube_message.setPositiveButton(
                "Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog.Builder cone_message = new AlertDialog.Builder(teleop.this);
        cone_message.setMessage("Cone can't be placed there");
        cone_message.setCancelable(true);
        cone_message.setPositiveButton(
                "Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });



        row1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on below line we are getting radio button from our group.
                if (grid1.isChecked() && cube.isChecked()) {
                    //grid1_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid1 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                }
                else if (grid1.isChecked() && cone.isChecked()) {
                    //grid1_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid1 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid1.isChecked() && Cube2.isChecked()) {
                    grid1_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid1 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid1.isChecked() && Cone2.isChecked()) {
                    grid1_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid1 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid2.isChecked() && cube.isChecked()) {
                    grid2_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid2 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid2.isChecked() && cone.isChecked()) {
                    //grid2_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid2 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();

                }
                else if (grid2.isChecked() && Cube2.isChecked()) {
                    grid2_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid2 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid2.isChecked() && Cone2.isChecked()) {
                    grid2_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid2 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid3.isChecked() && cube.isChecked()) {
                    //grid3_first += 1;
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
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
                else if (grid3.isChecked() && Cube2.isChecked()) {
                    grid3_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid3 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid3.isChecked() && Cone2.isChecked()) {
                    grid3_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid3 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid4.isChecked() && cube.isChecked()) {
                    //grid4_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid4 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                }
                else if (grid4.isChecked() && cone.isChecked()) {
                    grid4_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid4 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid4.isChecked() && Cube2.isChecked()) {
                    grid4_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid4 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid4.isChecked() && Cone2.isChecked()) {
                    grid4_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid4 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid5.isChecked() && cube.isChecked()) {
                    grid5_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid5 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid5.isChecked() && cone.isChecked()) {
                    //grid5_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid5 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                }
                else if (grid5.isChecked() && Cube2.isChecked()) {
                    grid5_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid5 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid5.isChecked() && Cone2.isChecked()) {
                    grid5_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid5 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid6.isChecked() && cube.isChecked()) {
                    //grid6_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid6 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                }
                else if (grid6.isChecked() && cone.isChecked()) {
                    grid6_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid6 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid6.isChecked() && Cube2.isChecked()) {
                    grid6_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid6 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid6.isChecked() && Cone2.isChecked()) {
                    grid6_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid6 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid7.isChecked() && cube.isChecked()) {
                    //grid7_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid7 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                }
                else if (grid7.isChecked() && cone.isChecked()) {
                    grid7_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid7 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid7.isChecked() && Cube2.isChecked()) {
                    grid7_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid7 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid7.isChecked() && Cone2.isChecked()) {
                    grid7_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid7 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid8.isChecked() && cube.isChecked()) {
                    grid8_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid8 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid8.isChecked() && cone.isChecked()) {
                    //grid8_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid8 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                }
                else if (grid8.isChecked() && Cube2.isChecked()) {
                    grid8_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid8 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid8.isChecked() && Cone2.isChecked()) {
                    grid8_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid8 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid9.isChecked() && cube.isChecked()) {
                    //grid9_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid9 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                }
                else if (grid9.isChecked() && cone.isChecked()) {
                    grid9_first += 1;
                    row1.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid9 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid9.isChecked() && Cube2.isChecked()) {
                    grid9_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid9 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid9.isChecked() && Cone2.isChecked()) {
                    grid9_second += 1;
                    row1.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid9 X Cone Selected", Toast.LENGTH_SHORT).show();
                }



            }
        });




        row2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on below line we are getting radio button from our group.
                if (grid10.isChecked() && cube.isChecked()) {
                    //grid10_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid10 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                }
                else if (grid10.isChecked() && cone.isChecked()) {
                    grid10_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid10 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid10.isChecked() && Cube2.isChecked()) {
                    grid10_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid10 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid10.isChecked() && Cone2.isChecked()) {
                    grid10_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid10 X Cone Selected", Toast.LENGTH_SHORT).show();
                }

                if (grid11.isChecked() && cube.isChecked()) {
                    grid11_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid11 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid11.isChecked() && cone.isChecked()) {
                    //grid11_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid11 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                }
                else if (grid11.isChecked() && Cube2.isChecked()) {
                    grid11_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid11 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid11.isChecked() && Cone2.isChecked()) {
                    grid11_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid11 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid12.isChecked() && cube.isChecked()) {
                    //grid12_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid12 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                }
                else if (grid12.isChecked() && cone.isChecked()) {
                    grid12_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid12 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid12.isChecked() && Cube2.isChecked()) {
                    grid12_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid12 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid12.isChecked() && Cone2.isChecked()) {
                    grid12_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid12 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid13.isChecked() && cube.isChecked()) {
                    //grid13_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid13 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                }
                else if (grid13.isChecked() && cone.isChecked()) {
                    grid13_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid13 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid13.isChecked() && Cube2.isChecked()) {
                    grid13_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid13 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid14.isChecked() && cube.isChecked()) {
                    grid14_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid14 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid14.isChecked() && cone.isChecked()) {
                    //grid14_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid14 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                }
                else if (grid14.isChecked() && Cube2.isChecked()) {
                    grid14_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid14 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid14.isChecked() && Cone2.isChecked()) {
                    grid14_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid14 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid15.isChecked() && cube.isChecked()) {
                    //grid15_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid15 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                }
                else if (grid15.isChecked() && cone.isChecked()) {
                    grid15_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid15 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid15.isChecked() && Cube2.isChecked()) {
                    grid15_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid15 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid15.isChecked() && Cone2.isChecked()) {
                    grid15_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid15 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid16.isChecked() && cube.isChecked()) {
                    //grid16_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid16 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                }
                else if (grid16.isChecked() && cone.isChecked()) {
                    grid16_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid16 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid16.isChecked() && Cube2.isChecked()) {
                    grid16_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid16 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid16.isChecked() && Cone2.isChecked()) {
                    grid16_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid16 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid17.isChecked() && cube.isChecked()) {
                    grid17_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid17 Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid17.isChecked() && cone.isChecked()) {
                    //grid17_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid17 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                }
                else if (grid17.isChecked() && Cube2.isChecked()) {
                    grid17_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid17 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid17.isChecked() && Cone2.isChecked()) {
                    grid17_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid17 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid18.isChecked() && cube.isChecked()) {
                    //grid18_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid18 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                }
                else if (grid18.isChecked() && cone.isChecked()) {
                    grid18_first += 1;
                    row2.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid18 Cone Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid18.isChecked() && Cube2.isChecked()) {
                    grid18_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid18 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid18.isChecked() && Cone2.isChecked()) {
                    grid18_second += 1;
                    row2.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid18 X Cone Selected", Toast.LENGTH_SHORT).show();
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
                } else if (grid19.isChecked() && cone.isChecked()) {
                    grid19_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid19 Cone Selected", Toast.LENGTH_SHORT).show();
                } else if (grid19.isChecked() && Cube2.isChecked()) {
                    grid19_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid19 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid19.isChecked() && Cone2.isChecked()) {
                    grid19_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid19 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid20.isChecked() && cube.isChecked()) {
                    grid20_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid20 Cube Selected", Toast.LENGTH_SHORT).show();
                } else if (grid20.isChecked() && cone.isChecked()) {
                    grid20_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid20 Cone Selected", Toast.LENGTH_SHORT).show();
                } else if (grid20.isChecked() && Cube2.isChecked()) {
                    grid20_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid20 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid20.isChecked() && Cone2.isChecked()) {
                    grid20_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid20 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid21.isChecked() && cube.isChecked()) {
                    grid21_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid21 Cube Selected", Toast.LENGTH_SHORT).show();
                } else if (grid21.isChecked() && cone.isChecked()) {
                    grid21_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid21 Cone Selected", Toast.LENGTH_SHORT).show();
                } else if (grid21.isChecked() && Cube2.isChecked()) {
                    grid21_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid21 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid21.isChecked() && Cone2.isChecked()) {
                    grid21_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid21 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid22.isChecked() && cube.isChecked()) {
                    grid22_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid22 Cube Selected", Toast.LENGTH_SHORT).show();
                } else if (grid22.isChecked() && cone.isChecked()) {
                    grid22_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid22 Cone Selected", Toast.LENGTH_SHORT).show();
                } else if (grid22.isChecked() && Cube2.isChecked()) {
                    grid22_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid22 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid22.isChecked() && Cone2.isChecked()) {
                    grid22_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid22 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid23.isChecked() && cube.isChecked()) {
                    grid23_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid23 Cube Selected", Toast.LENGTH_SHORT).show();
                } else if (grid23.isChecked() && cone.isChecked()) {
                    grid23_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid23 Cone Selected", Toast.LENGTH_SHORT).show();
                } else if (grid23.isChecked() && Cube2.isChecked()) {
                    grid23_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid23 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid23.isChecked() && Cone2.isChecked()) {
                    grid23_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid23 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid24.isChecked() && cube.isChecked()) {
                    grid24_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid24 Cube Selected", Toast.LENGTH_SHORT).show();
                } else if (grid24.isChecked() && cone.isChecked()) {
                    grid24_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid24 Cone Selected", Toast.LENGTH_SHORT).show();
                } else if (grid24.isChecked() && Cube2.isChecked()) {
                    grid24_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid24 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid24.isChecked() && Cone2.isChecked()) {
                    grid24_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid24 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid25.isChecked() && cube.isChecked()) {
                    grid25_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid25 Cube Selected", Toast.LENGTH_SHORT).show();
                } else if (grid25.isChecked() && cone.isChecked()) {
                    grid25_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid25 Cone Selected", Toast.LENGTH_SHORT).show();
                } else if (grid25.isChecked() && Cube2.isChecked()) {
                    grid25_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid25 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid25.isChecked() && Cone2.isChecked()) {
                    grid25_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid25 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid26.isChecked() && cube.isChecked()) {
                    grid26_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid26 Cube Selected", Toast.LENGTH_SHORT).show();
                } else if (grid26.isChecked() && cone.isChecked()) {
                    grid26_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid26 Cone Selected", Toast.LENGTH_SHORT).show();
                } else if (grid26.isChecked() && Cube2.isChecked()) {
                    grid26_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid26 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid26.isChecked() && Cone2.isChecked()) {
                    grid26_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid26 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
                if (grid27.isChecked() && cube.isChecked()) {
                    grid27_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid27 Cube Selected", Toast.LENGTH_SHORT).show();
                } else if (grid27.isChecked() && cone.isChecked()) {
                    grid27_first += 1;
                    row3.clearCheck();
                    shape.clearCheck();
                    Toast.makeText(teleop.this, "Grid27 Cone Selected", Toast.LENGTH_SHORT).show();
                } else if (grid27.isChecked() && Cube2.isChecked()) {
                    grid27_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid27 X Cube Selected", Toast.LENGTH_SHORT).show();
                }
                else if (grid27.isChecked() && Cone2.isChecked()) {
                    grid27_second += 1;
                    row3.clearCheck();
                    shape2.clearCheck();
                    Toast.makeText(teleop.this, "Grid27 X Cone Selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}