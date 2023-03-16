package com.example.scouterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.widget.Toast;
import android.view.View;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;

import android.widget.Button;

import android.widget.SeekBar;



import java.util.Objects;

public class auto extends AppCompatActivity {

    String Docked_Engaged_checked = "0";
    String left_community_checked = "0";

    String docked_checked = "0";
    String engaged_checked = "0";

    String finalgrid = "";


    @SuppressLint("AppCompatMethod")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Old data

        Intent intent = getIntent();
        String Match_Number = intent.getStringExtra("Match_Number");
        String Team_Number = intent.getStringExtra("Team_Number");
        String Alliance = intent.getStringExtra("Alliance");
        String Driver_Station = intent.getStringExtra("Driver_Station");





        //Remove Topbar + bottom Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_auto);

        //simpleChronometer.setFormat(""); // set the format for a chronometer
        Button forward = (Button) findViewById(R.id.Forward_page_2);

        CheckBox left_community = (CheckBox) findViewById(R.id.left_community);
        left_community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (left_community.isChecked()) {
                    left_community_checked = (String) "1";
                }
            }
        });


        CheckBox Attempted = (CheckBox) findViewById(R.id.Attempted);
        Attempted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Attempted.isChecked()) {
                    Docked_Engaged_checked = (String) "1";
                }
            }
        });


        CheckBox docked = (CheckBox) findViewById(R.id.Docked);
        docked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (docked.isChecked()) {
                    docked_checked = (String) "1";
                }
            }
        });






        CheckBox engaged = (CheckBox) findViewById(R.id.Engaged);
        engaged.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (engaged.isChecked()) {
                    engaged_checked = (String) "1";
                }
            }
        });
        Button backward = (Button) findViewById(R.id.Backward_page_2);
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        forward.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                SeekBar simpleSeekBar = (SeekBar) findViewById(R.id.seekBar); // initiate the Seek bar
                int maxValue=simpleSeekBar.getProgress(); // get maximum value of the Seek bar
                String lol = String.valueOf(maxValue);




                Intent i = new Intent(auto.this, teleop.class);



                // Old
                i.putExtra ( "Match_Number", Match_Number);
                i.putExtra ( "Team_Number", Team_Number);
                i.putExtra("Alliance", Alliance);
                i.putExtra("Driver_Station",Driver_Station);


                i.putExtra("climb_time", lol);
                i.putExtra("auto_grid",finalgrid);



                i.putExtra("left_community_checked",left_community_checked);
                i.putExtra("Docked_Engaged_checked",Docked_Engaged_checked);
                i.putExtra("docked_checked",docked_checked);
                i.putExtra("engaged_checked",engaged_checked);

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


        CheckBox cube = (CheckBox) findViewById(R.id.Cube_select);
        CheckBox cone = (CheckBox) findViewById(R.id.Cone_select);
        CheckBox cube2 = (CheckBox) findViewById(R.id.Cube_select2);
        CheckBox cone2 = (CheckBox) findViewById(R.id.Cone_select2);
        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cube.isChecked()) {
                    cone.setChecked(false);
                    cone2.setChecked(false);
                    cube2.setChecked(false);

                }
            }
        });
        cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cone.isChecked()) {
                    cube.setChecked(false);
                    cone2.setChecked(false);
                    cube2.setChecked(false);

                }
            }
        });
        cube2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cube2.isChecked()) {
                    cube.setChecked(false);
                    cone2.setChecked(false);
                    cone.setChecked(false);

                }
            }
        });
        cone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cone2.isChecked()) {
                    cube.setChecked(false);
                    cube2.setChecked(false);
                    cone.setChecked(false);

                }
            }
        });

        RadioGroup row1 = (RadioGroup) findViewById(R.id.row1);
        RadioGroup row2 = (RadioGroup) findViewById(R.id.row2);
        RadioGroup row3 = (RadioGroup) findViewById(R.id.row3);

        Button RESET = (Button) findViewById(R.id.RESET);

        RESET.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(auto.this);

                builder.setMessage("THIS IS FINAL!");
                builder.setTitle(" Are you sure you want to reset all data?");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                    row1.clearCheck();
                    row2.clearCheck();
                    row3.clearCheck();
                    finalgrid = (String) "";
                    grid1.setBackgroundColor(Color.TRANSPARENT);
                    grid2.setBackgroundColor(Color.TRANSPARENT);
                    grid3.setBackgroundColor(Color.TRANSPARENT);
                    grid4.setBackgroundColor(Color.TRANSPARENT);
                    grid5.setBackgroundColor(Color.TRANSPARENT);
                    grid6.setBackgroundColor(Color.TRANSPARENT);
                    grid7.setBackgroundColor(Color.TRANSPARENT);
                    grid8.setBackgroundColor(Color.TRANSPARENT);
                    grid9.setBackgroundColor(Color.TRANSPARENT);
                    grid10.setBackgroundColor(Color.TRANSPARENT);
                    grid11.setBackgroundColor(Color.TRANSPARENT);
                    grid12.setBackgroundColor(Color.TRANSPARENT);
                    grid13.setBackgroundColor(Color.TRANSPARENT);
                    grid14.setBackgroundColor(Color.TRANSPARENT);
                    grid15.setBackgroundColor(Color.TRANSPARENT);
                    grid16.setBackgroundColor(Color.TRANSPARENT);
                    grid17.setBackgroundColor(Color.TRANSPARENT);
                    grid18.setBackgroundColor(Color.TRANSPARENT);
                    grid19.setBackgroundColor(Color.TRANSPARENT);
                    grid20.setBackgroundColor(Color.TRANSPARENT);
                    grid21.setBackgroundColor(Color.TRANSPARENT);
                    grid22.setBackgroundColor(Color.TRANSPARENT);
                    grid23.setBackgroundColor(Color.TRANSPARENT);
                    grid24.setBackgroundColor(Color.TRANSPARENT);
                    grid25.setBackgroundColor(Color.TRANSPARENT);
                    grid26.setBackgroundColor(Color.TRANSPARENT);
                    grid27.setBackgroundColor(Color.TRANSPARENT);

                });

                builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                    dialog.cancel();
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();
                // Show the Alert Dialog box
                alertDialog.show();
            }
        });

        AlertDialog.Builder cube_message = new AlertDialog.Builder(auto.this);
        cube_message.setMessage("Cube can't be placed there");
        cube_message.setCancelable(true);

        cube_message.setPositiveButton(
                "Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog.Builder cone_message = new AlertDialog.Builder(auto.this);
        cone_message.setMessage("Cone can't be placed there");
        cone_message.setCancelable(true);
        cone_message.setPositiveButton(
                "Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });


        Button clear = (Button) findViewById(R.id.clear);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cube.setChecked(false);
                cone.setChecked(false);
                cube2.setChecked(false);
                cone2.setChecked(false);
                grid1.setBackgroundColor(Color.TRANSPARENT);
                grid2.setBackgroundColor(Color.TRANSPARENT);
                grid3.setBackgroundColor(Color.TRANSPARENT);
                grid4.setBackgroundColor(Color.TRANSPARENT);
                grid5.setBackgroundColor(Color.TRANSPARENT);
                grid6.setBackgroundColor(Color.TRANSPARENT);
                grid7.setBackgroundColor(Color.TRANSPARENT);
                grid8.setBackgroundColor(Color.TRANSPARENT);
                grid9.setBackgroundColor(Color.TRANSPARENT);
                grid10.setBackgroundColor(Color.TRANSPARENT);
                grid11.setBackgroundColor(Color.TRANSPARENT);
                grid12.setBackgroundColor(Color.TRANSPARENT);
                grid13.setBackgroundColor(Color.TRANSPARENT);
                grid14.setBackgroundColor(Color.TRANSPARENT);
                grid15.setBackgroundColor(Color.TRANSPARENT);
                grid16.setBackgroundColor(Color.TRANSPARENT);
                grid17.setBackgroundColor(Color.TRANSPARENT);
                grid18.setBackgroundColor(Color.TRANSPARENT);
                grid19.setBackgroundColor(Color.TRANSPARENT);
                grid20.setBackgroundColor(Color.TRANSPARENT);
                grid21.setBackgroundColor(Color.TRANSPARENT);
                grid22.setBackgroundColor(Color.TRANSPARENT);
                grid23.setBackgroundColor(Color.TRANSPARENT);
                grid24.setBackgroundColor(Color.TRANSPARENT);
                grid25.setBackgroundColor(Color.TRANSPARENT);
                grid26.setBackgroundColor(Color.TRANSPARENT);
                grid27.setBackgroundColor(Color.TRANSPARENT);


            }
        });

        row1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on below line we are getting radio button from our group.
                if (grid1.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                    cube.setChecked(false);
                    Toast.makeText(auto.this, "Grid1 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);


                }
                else if (grid1.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                    cone.setChecked(false);
                    Toast.makeText(auto.this, "Grid1 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "1,1,cone,1?";
                    grid1.setBackgroundResource(R.drawable.triangle_blue);

                }
                else if (grid1.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                    cube2.setChecked(false);
                    Toast.makeText(auto.this, "Grid1 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "1,1,cube,-1?";
                    grid1.setBackgroundResource(R.drawable.xcube);

                }
                else if (grid1.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    Toast.makeText(auto.this, "Grid1 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "1,1,cone,-1?";
                    grid1.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid2.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                    Toast.makeText(auto.this, "Grid2 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "2,1,cube,1?";
                    grid2.setBackgroundResource(R.drawable.cube);
                    cube.setChecked(false);



                }
                else if (grid2.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid2 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();



                }
                else if (grid2.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid2 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "2,1,cube,-1?";
                    grid2.setBackgroundResource(R.drawable.xcube);

                }
                else if (grid2.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid2 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "2,1,cone,-1?";
                    grid2.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid3.isChecked() && cube.isChecked()) {
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    row1.clearCheck();
                    Toast.makeText(auto.this, "Grid3 Cube Selected", Toast.LENGTH_SHORT).show();
                    cube.setChecked(false);


                }
                else if (grid3.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid3 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "3,1,cone,1?";
                    grid3.setBackgroundResource(R.drawable.triangle_blue);


                }
                else if (grid3.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid3 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "3,1,cube,-1?";
                    grid3.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid3.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid3 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "3,1,cube,-1?";
                    grid3.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid4.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid4 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);


                }
                else if (grid4.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                    
                    Toast.makeText(auto.this, "Grid4 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "4,1,cone,1?";
                    grid4.setBackgroundResource(R.drawable.triangle_blue);


                }
                else if (grid4.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid4 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "4,1,cube,-1?";
                    grid4.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid4.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid4 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "4,1,cone,-1?";
                    grid4.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid5.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid5 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "5,1,cube,1?";
                    grid5.setBackgroundResource(R.drawable.cube);
                    cube.setChecked(false);


                }
                else if (grid5.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid5 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();


                }
                else if (grid5.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid5 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "5,1,cube,-1?";
                    grid5.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid5.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid5 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "5,1,cone,-1?";
                    grid5.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid6.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid6 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);

                    //finalgrid = (String) finalgrid + "6,1,cube,1?";

                }
                else if (grid6.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid6 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "6,1,cone,1?";
                    grid6.setBackgroundResource(R.drawable.triangle_blue);


                }
                else if (grid6.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid6 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "6,1,cube,-1?";
                    grid6.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid6.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid6 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "6,1,cone,-1?";
                    grid6.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid7.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid7 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);

                }
                else if (grid7.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid7 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "7,1,cone,1?";
                    grid7.setBackgroundResource(R.drawable.triangle_blue);


                }
                else if (grid7.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid7 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "7,1,cube,-1?";
                    grid7.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid7.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid7 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "7,1,cone,-1?";
                    grid7.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid8.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid8 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "8,1,cube,1?";
                    grid8.setBackgroundResource(R.drawable.cube);


                }
                else if (grid8.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid8 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();

                    //finalgrid = (String) finalgrid + "8,1,cone,1?";

                }
                else if (grid8.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid8 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "8,1,cube,-1?";
                    grid8.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid8.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid8 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "8,1,cone,-1?";
                    grid8.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid9.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid9 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid = (String) finalgrid + "9,1,cube,1?";

                }
                else if (grid9.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid9 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "9,1,cone,1?";
                    grid9.setBackgroundResource(R.drawable.triangle_blue);


                }
                else if (grid9.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid9 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "9,1,cube,-1?";
                    grid9.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid9.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid9 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "9,1,cone,-1?";
                    grid9.setBackgroundResource(R.drawable.xtraingle);


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
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid10 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();


                }
                else if (grid10.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid10 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "1,2,cone,1?";
                    grid10.setBackgroundResource(R.drawable.triangle_blue);


                }
                else if (grid10.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid10 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "1,2,cube,-1?";
                    grid10.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid10.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid10 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "1,2,cone,-1?";
                    grid10.setBackgroundResource(R.drawable.xtraingle);


                }

                if (grid11.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid11 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "2,2,cube,1?";
                    grid11.setBackgroundResource(R.drawable.cube);


                }
                else if (grid11.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid11 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();

                    //finalgrid = (String) finalgrid + "2,2,cone,1?";

                }
                else if (grid11.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid11 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "2,2,cube,-1?";
                    grid11.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid11.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid11 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "2,2,cone,-1?";
                    grid11.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid12.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid12 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid = (String) finalgrid + "3,2,cube,1?";

                }
                else if (grid12.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid12 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "3,2,cone,1?";
                    grid12.setBackgroundResource(R.drawable.triangle_blue);


                }
                else if (grid12.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid12 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "3,2,cube,-1?";
                    grid12.setBackgroundResource(R.drawable.xcube);



                }
                else if (grid12.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid12 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "3,2,cone,-1?";
                    grid12.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid13.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid13 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid = (String) finalgrid + "4,2,cube,1?";

                }
                else if (grid13.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid13 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "4,2,cone,1?";
                    grid13.setBackgroundResource(R.drawable.triangle_blue);


                }
                else if (grid13.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid13 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "4,2,cube,-1?";
                    grid13.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid13.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid13 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "4,2,cone,-1?";
                    grid13.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid14.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid14 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "5,2,cube,1?";
                    grid14.setBackgroundResource(R.drawable.cube);


                }
                else if (grid14.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid14 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();

                    //finalgrid = (String) finalgrid + "5,2,cone,1?";

                }
                else if (grid14.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid14 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "5,2,cube,-1?";
                    grid14.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid14.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid14 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "5,2,cone,-1?";
                    grid14.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid15.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid15 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid = (String) finalgrid + "6,2,cube,1?";

                }
                else if (grid15.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid15 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "6,2,cone,1?";
                    grid15.setBackgroundResource(R.drawable.triangle_blue);


                }
                else if (grid15.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid15 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "6,2,cube,-1?";
                    grid15.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid15.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid15 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "6,2,cone,-1?";
                    grid15.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid16.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid16 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid = (String) finalgrid + "7,2,cube,1?";

                }
                else if (grid16.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid16 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "7,2,cone,1?";
                    grid16.setBackgroundResource(R.drawable.triangle_blue);


                }
                else if (grid16.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid16 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "7,2,cube,-1?";
                    grid16.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid16.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid16 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "7,2,cone,-1?";
                    grid16.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid17.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid17 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "8,2,cube,1?";
                    grid17.setBackgroundResource(R.drawable.cube);


                }
                else if (grid17.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid17 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();

                    //finalgrid = (String) finalgrid + "8,2,cone,1?";

                }
                else if (grid17.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid17 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "8,2,cube,-1?";
                    grid17.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid17.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid17 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "8,2,cone,-1?";
                    grid17.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid18.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid18 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid = (String) finalgrid + "9,2,cube,1?";

                }
                else if (grid18.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid18 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "9,2,cone,1?";
                    grid18.setBackgroundResource(R.drawable.triangle_blue);


                }
                else if (grid18.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid18 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "9,2,cube,-1?";
                    grid18.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid18.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid18 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "9,2,cone,-1?";
                    grid18.setBackgroundResource(R.drawable.xtraingle);


                }



            }
        });

        row3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on below line we are getting radio button from our group.
                if (grid19.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid19 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "1,3,cube,1?";
                    grid19.setBackgroundResource(R.drawable.cube);


                } else if (grid19.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid19 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "1,3,cone,1?";
                    grid19.setBackgroundResource(R.drawable.triangle_blue);


                } else if (grid19.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid19 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "1,3,cube,-1?";
                    grid19.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid19.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid19 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "1,3,cone,-1?";
                    grid19.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid20.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid20 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "2,3,cube,1?";
                    grid20.setBackgroundResource(R.drawable.cube);


                } else if (grid20.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid20 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "2,3,cone,1?";
                    grid20.setBackgroundResource(R.drawable.triangle_blue);


                } else if (grid20.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid20 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "2,3,cube,-1?";
                    grid20.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid20.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid20 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "2,3,cone,-1?";
                    grid20.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid21.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid21 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "3,3,cube,1?";
                    grid21.setBackgroundResource(R.drawable.cube);


                } else if (grid21.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid21 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "3,3,cone,1?";
                    grid21.setBackgroundResource(R.drawable.triangle_blue);


                } else if (grid21.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid21 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "3,3,cube,-1?";
                    grid21.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid21.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid21 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "3,3,cone,-1?";
                    grid21.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid22.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid22 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "4,3,cube,1?";
                    grid22.setBackgroundResource(R.drawable.cube);


                } else if (grid22.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid22 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "4,3,cone,1?";
                    grid22.setBackgroundResource(R.drawable.triangle_blue);


                } else if (grid22.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid22 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "4,3,cube,-1?";
                    grid22.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid22.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid22 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "4,3,cone,-1?";
                    grid22.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid23.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid23 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "5,3,cube,1?";
                    grid23.setBackgroundResource(R.drawable.cube);


                } else if (grid23.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid23 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "5,3,cone,1?";
                    grid23.setBackgroundResource(R.drawable.triangle_blue);


                } else if (grid23.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid23 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "5,3,cube,-1?";
                    grid23.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid23.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid23 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "5,3,cone,-1?";
                    grid23.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid24.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid24 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "6,3,cube,1?";
                    grid24.setBackgroundResource(R.drawable.cube);


                } else if (grid24.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid24 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "6,3,cone,1?";
                    grid24.setBackgroundResource(R.drawable.triangle_blue);


                } else if (grid24.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid24 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "6,3,cube,-1?";
                    grid24.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid24.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid24 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "6,3,cone,-1?";
                    grid24.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid25.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid25 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "7,3,cube,1?";
                    grid25.setBackgroundResource(R.drawable.cube);


                } else if (grid25.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid25 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "7,3,cone,1?";
                    grid25.setBackgroundResource(R.drawable.triangle_blue);


                } else if (grid25.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid25 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "7,3,cube,-1?";
                    grid25.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid25.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid25 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "7,3,cone,-1?";
                    grid25.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid26.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid26 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "8,3,cube,1?";
                    grid26.setBackgroundResource(R.drawable.cube);


                } else if (grid26.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid26 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "8,3,cone,1?";
                    grid26.setBackgroundResource(R.drawable.triangle_blue);



                } else if (grid26.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid26 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "8,3,cube,-1?";
                    grid26.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid26.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid26 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "8,3,cone,-1?";
                    grid26.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid27.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);
                    cube.setChecked(false);

                    Toast.makeText(auto.this, "Grid27 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "9,3,cube,1?";
                    grid27.setBackgroundResource(R.drawable.cube);


                } else if (grid27.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid27 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "9,3,cone,1?";
                    grid27.setBackgroundResource(R.drawable.triangle_blue);


                } else if (grid27.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    Toast.makeText(auto.this, "Grid27 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "9,3,cube,-1?";
                    grid27.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid27.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    Toast.makeText(auto.this, "Grid27 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid = (String) finalgrid + "9,3,cone,-1?";
                    grid27.setBackgroundResource(R.drawable.xtraingle);


                }
            }

        });}
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    }