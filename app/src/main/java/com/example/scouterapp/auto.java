package com.example.scouterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.ArrayList;


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

    //String finalgrid = "";

    // push_back equivalent

    ArrayList<String> finalgrid = new ArrayList<String>();




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
                String listString = String.join(", ", finalgrid);
                i.putExtra("auto_grid",listString);



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

        Button undo = (Button) findViewById(R.id.Undo);
        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalgrid.size() >= 1) {
                    int index = finalgrid.size() - 1;
                    String str = finalgrid.get(index);
                    String a = str.substring(0, 3);
                    //Toast.makeText(auto.this, a, Toast.LENGTH_SHORT).show();
                    Drawable transparentDrawable = new ColorDrawable(Color.TRANSPARENT);

                    if (a.equals("1,1")) {
                        grid1.setChecked(false);
                        grid1.setBackground(transparentDrawable);
                    }
                    if (a.equals("2,1")) {
                        grid2.setChecked(false);
                        grid2.setBackground(transparentDrawable);
                    }
                    if (a.equals("3,1")) {
                        grid3.setChecked(false);
                        grid3.setBackground(transparentDrawable);
                    }
                    if (a.equals("4,1")) {
                        grid4.setChecked(false);
                        grid4.setBackground(transparentDrawable);
                    }
                    if (a.equals("5,1")) {
                        grid5.setChecked(false);
                        grid5.setBackground(transparentDrawable);
                    }
                    if (a.equals("6,1")) {
                        grid6.setChecked(false);
                        grid6.setBackground(transparentDrawable);
                    }
                    if (a.equals("7,1")) {
                        grid7.setChecked(false);
                        grid7.setBackground(transparentDrawable);
                    }
                    if (a.equals("8,1")) {
                        grid8.setChecked(false);
                        grid8.setBackground(transparentDrawable);
                    }
                    if (a.equals("9,1")) {
                        grid9.setChecked(false);
                        grid9.setBackground(transparentDrawable);
                    }
                    if (a.equals("1,2")) {
                        grid10.setChecked(false);
                        grid10.setBackground(transparentDrawable);
                    }
                    if (a.equals("2,2")) {
                        grid11.setChecked(false);
                        grid11.setBackground(transparentDrawable);
                    }
                    if (a.equals("3,2")) {
                        grid12.setChecked(false);
                        grid12.setBackground(transparentDrawable);
                    }
                    if (a.equals("4,2")) {
                        grid13.setChecked(false);
                        grid13.setBackground(transparentDrawable);
                    }
                    if (a.equals("5,2")) {
                        grid14.setChecked(false);
                        grid14.setBackground(transparentDrawable);
                    }
                    if (a.equals("6,2")) {
                        grid15.setChecked(false);
                        grid15.setBackground(transparentDrawable);
                    }
                    if (a.equals("7,2")) {
                        grid16.setChecked(false);
                        grid16.setBackground(transparentDrawable);
                    }
                    if (a.equals("8,2")) {
                        grid17.setChecked(false);
                        grid17.setBackground(transparentDrawable);
                    }
                    if (a.equals("9,2")) {
                        grid18.setChecked(false);
                        grid18.setBackground(transparentDrawable);
                    }
                    if (a.equals("1,3")) {
                        grid19.setChecked(false);
                        grid19.setBackground(transparentDrawable);
                    }
                    if (a.equals("2,3")) {
                        grid20.setChecked(false);
                        grid20.setBackground(transparentDrawable);
                    }
                    if (a.equals("3,3")) {
                        grid21.setChecked(false);
                        grid21.setBackground(transparentDrawable);
                    }
                    if (a.equals("4,3")) {
                        grid22.setChecked(false);
                        grid22.setBackground(transparentDrawable);
                    }
                    if (a.equals("5,3")) {
                        grid23.setChecked(false);
                        grid23.setBackground(transparentDrawable);
                    }
                    if (a.equals("6,3")) {
                        grid24.setChecked(false);
                        grid24.setBackground(transparentDrawable);
                    }
                    if (a.equals("7,3")) {
                        grid25.setChecked(false);
                        grid25.setBackground(transparentDrawable);
                    }
                    if (a.equals("8,3")) {
                        grid26.setChecked(false);
                        grid26.setBackground(transparentDrawable);
                    }
                    if (a.equals("9,3")) {
                        grid27.setChecked(false);
                        grid27.setBackground(transparentDrawable);
                    }
                    finalgrid.remove(index);
                }
            }
        });


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
                    finalgrid.clear();
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


        /*
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
         */

        row1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // on below line we are getting radio button from our group.
                if (grid1.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                    cube.setChecked(false);
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);
                }
                else if (grid1.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                    cone.setChecked(false);
                    finalgrid.add("1,1,cone,1?");
                    grid1.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);

                }
                else if (grid1.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                    cube2.setChecked(false);
                    finalgrid.add("1,1,cube,-1?");
                    grid1.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid1.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    finalgrid.add("1,1,cone,-1?");
                    cone2.setChecked(false);

                    grid1.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid2.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                    finalgrid.add("2,1,cube,-1?");
                    grid2.setBackgroundResource(R.drawable.cube);
                    cube.setChecked(false);
                }
                else if (grid2.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);




                }
                else if (grid2.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("2,1,cube,-1?");
                    grid2.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);

                }
                else if (grid2.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("2,1,cone,-1?");
                    cone2.setChecked(false);

                    grid2.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid3.isChecked() && cube.isChecked()) {
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    row1.clearCheck();
                    cube.setChecked(false);

                }
                else if (grid3.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("3,1,cone,-1?");
                    grid3.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid3.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("3,1,cube,-1?");
                    cube2.setChecked(false);
                    grid3.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid3.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("3,1,cube,-1?");
                    cone2.setChecked(false);

                    grid3.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid4.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                   
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);


                }
                else if (grid4.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                    
                    finalgrid.add("4,1,cone,1?");
                    grid4.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid4.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("4,1,cube,-1?");
                    grid4.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid4.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("4,1,cone,-1?");
                    grid4.setBackgroundResource(R.drawable.xtraingle);
                    cone2.setChecked(false);


                }
                if (grid5.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("5,1,cube,1?");
                    grid5.setBackgroundResource(R.drawable.cube);
                    cube.setChecked(false);


                }
                else if (grid5.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);


                }
                else if (grid5.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("5,1,cube,-1?");
                    grid5.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid5.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("5,1,cone,-1?");
                    grid5.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid6.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                   
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);

                    //finalgrid.add("6,1,cube,1?";

                }
                else if (grid6.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("6,1,cone,1?");
                    grid6.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid6.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("6,1,cube,-1?");
                    grid6.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid6.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("6,1,cone,-1?");
                    grid6.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid7.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                   
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);

                }
                else if (grid7.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("7,1,cone,1?");
                    grid7.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid7.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("7,1,cube,-1?");
                    grid7.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid7.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("7,1,cone,-1?");
                    grid7.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid8.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                    cube.setChecked(false);

                    finalgrid.add("8,1,cube,1?");
                    grid8.setBackgroundResource(R.drawable.cube);


                }
                else if (grid8.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);

                    //finalgrid.add("8,1,cone,1?";

                }
                else if (grid8.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("8,1,cube,-1?");
                    grid8.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid8.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("8,1,cone,-1?");
                    grid8.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid9.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                    cube.setChecked(false);

                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("9,1,cube,1?";

                }
                else if (grid9.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("9,1,cone,1?");
                    grid9.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid9.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                   
                    finalgrid.add("9,1,cube,-1?");
                    grid9.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid9.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("9,1,cone,-1?");
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

                    AlertDialog alert11 = cube_message.create();
                    alert11.show();


                }
                else if (grid10.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("1,2,cone,1?");
                    grid10.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid10.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("1,2,cube,-1?");
                    grid10.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid10.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("1,2,cone,-1?");
                    grid10.setBackgroundResource(R.drawable.xtraingle);


                }

                if (grid11.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    finalgrid.add("2,2,cube,1?");
                    grid11.setBackgroundResource(R.drawable.cube);


                }
                else if (grid11.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);

                    //finalgrid.add("2,2,cone,1?";

                }
                else if (grid11.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("2,2,cube,-1?");
                    grid11.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid11.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("2,2,cone,-1?");
                    grid11.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid12.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("3,2,cube,1?";

                }
                else if (grid12.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("3,2,cone,1?");
                    grid12.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid12.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("3,2,cube,-1?");
                    grid12.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);



                }
                else if (grid12.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("3,2,cone,-1?");
                    grid12.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid13.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("4,2,cube,1?";

                }
                else if (grid13.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("4,2,cone,1?");
                    grid13.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid13.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("4,2,cube,-1?");
                    grid13.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid13.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("4,2,cone,-1?");
                    grid13.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid14.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    finalgrid.add("5,2,cube,1?");
                    grid14.setBackgroundResource(R.drawable.cube);


                }
                else if (grid14.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);

                    //finalgrid.add("5,2,cone,1?";

                }
                else if (grid14.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("5,2,cube,-1?");
                    grid14.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid14.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("5,2,cone,-1?");
                    grid14.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid15.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("6,2,cube,1?";

                }
                else if (grid15.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("6,2,cone,1?");
                    grid15.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid15.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("6,2,cube,-1?");
                    grid15.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid15.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("6,2,cone,-1?");
                    grid15.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid16.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);
                    cube.setChecked(false);

                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("7,2,cube,1?";

                }
                else if (grid16.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("7,2,cone,1?");
                    grid16.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid16.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("7,2,cube,-1?");
                    grid16.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid16.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("7,2,cone,-1?");
                    grid16.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid17.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    finalgrid.add("8,2,cube,1?");
                    grid17.setBackgroundResource(R.drawable.cube);


                }
                else if (grid17.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);

                    //finalgrid.add("8,2,cone,1?";

                }
                else if (grid17.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("8,2,cube,-1?");
                    grid17.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid17.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("8,2,cone,-1?");
                    grid17.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid18.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("9,2,cube,1?";

                }
                else if (grid18.isChecked() && cone.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("9,2,cone,1?");
                    grid18.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid18.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();
                   
                    finalgrid.add("9,2,cube,-1?");
                    grid18.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid18.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("9,2,cone,-1?");
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

                    finalgrid.add("1,3,cube,1?");
                    grid19.setBackgroundResource(R.drawable.cube);


                } else if (grid19.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("1,3,cone,1?");
                    grid19.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid19.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("1,3,cube,-1?");
                    grid19.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid19.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("1,3,cone,-1?");
                    grid19.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid20.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    finalgrid.add("2,3,cube,1?");
                    grid20.setBackgroundResource(R.drawable.cube);


                } else if (grid20.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("2,3,cone,1?");
                    grid20.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid20.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("2,3,cube,-1?");
                    grid20.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid20.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("2,3,cone,-1?");
                    grid20.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid21.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    finalgrid.add("3,3,cube,1?");
                    grid21.setBackgroundResource(R.drawable.cube);


                } else if (grid21.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("3,3,cone,1?");
                    grid21.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid21.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("3,3,cube,-1?");
                    grid21.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid21.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("3,3,cone,-1?");
                    grid21.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid22.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    finalgrid.add("4,3,cube,1?");
                    grid22.setBackgroundResource(R.drawable.cube);


                } else if (grid22.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("4,3,cone,1?");
                    grid22.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid22.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("4,3,cube,-1?");
                    grid22.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid22.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("4,3,cone,-1?");
                    grid22.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid23.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    finalgrid.add("5,3,cube,1?");
                    grid23.setBackgroundResource(R.drawable.cube);


                } else if (grid23.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("5,3,cone,1?");
                    grid23.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid23.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("5,3,cube,-1?");
                    grid23.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid23.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("5,3,cone,-1?");
                    grid23.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid24.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    finalgrid.add("6,3,cube,1?");
                    grid24.setBackgroundResource(R.drawable.cube);


                } else if (grid24.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("6,3,cone,1?");
                    grid24.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid24.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("6,3,cube,-1?");
                    grid24.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid24.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("6,3,cone,-1?");
                    grid24.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid25.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    finalgrid.add("7,3,cube,1?");
                    grid25.setBackgroundResource(R.drawable.cube);


                } else if (grid25.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("7,3,cone,1?");
                    grid25.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid25.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("7,3,cube,-1?");
                    grid25.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid25.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("7,3,cone,-1?");
                    grid25.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid26.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    finalgrid.add("8,3,cube,1?");
                    grid26.setBackgroundResource(R.drawable.cube);


                } else if (grid26.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("8,3,cone,1?");
                    grid26.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);



                } else if (grid26.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("8,3,cube,-1?");
                    grid26.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid26.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    finalgrid.add("8,3,cone,-1?");
                    grid26.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid27.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);
                    cube.setChecked(false);

                    finalgrid.add("9,3,cube,1?");
                    grid27.setBackgroundResource(R.drawable.cube);


                } else if (grid27.isChecked() && cone.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("9,3,cone,1?");
                    grid27.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid27.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();
                   
                    finalgrid.add("9,3,cube,-1?");
                    grid27.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid27.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);
                    finalgrid.add("9,3,cone,-1?");
                    grid27.setBackgroundResource(R.drawable.xtraingle);


                }

            }

        });}


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    }