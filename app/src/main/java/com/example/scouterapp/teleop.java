package com.example.scouterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class teleop extends AppCompatActivity {

    String cone_pickup_checked = "0";
    String ground_cone_checked = "0";
    String station_cube_checked = "0";
    String station_cone_checked = "0";
    String cube_pickup_checked = "0";
    String ground_cube_checked = "0";
    String finalgrid2 = "";
    ArrayList<String> finalgrid = new ArrayList<String>();


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
        String auto_grid = intent.getStringExtra("auto_grid");
        //String Second_array = intent.getStringExtra("Second_array");

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
                SeekBar simpleSeekBar = (SeekBar) findViewById(R.id.seekBar); // initiate the Seek bar
                int maxValue = simpleSeekBar.getProgress(); // get maximum value of the Seek bar
                String lol = String.valueOf(maxValue);


                Intent i = new Intent(teleop.this, endgame.class);


                //First Page
                i.putExtra("Match_Number", Match_Number);
                i.putExtra("Team_Number", Team_Number);
                i.putExtra("Alliance", Alliance.toString());
                i.putExtra("Driver_Station", Driver_Station);


                //Second page
                i.putExtra("climb_time", climb_time);
                i.putExtra("auto_grid", auto_grid);
                //i.putExtra("Second_array",Second_array);


                i.putExtra("left_community_checked", left_community_checked);
                i.putExtra("Docked_Engaged_checked", Docked_Engaged_checked);
                i.putExtra("docked_checked", docked_checked);
                i.putExtra("engaged_checked", engaged_checked);


                //Third Page
                i.putExtra("cone_pickup_checked", cone_pickup_checked);
                i.putExtra("cube_pickup_checked", cube_pickup_checked);
                i.putExtra("station_cone_checked", station_cone_checked);
                i.putExtra("station_cube_checked", station_cube_checked);
                i.putExtra("ground_cone_checked", ground_cone_checked);
                i.putExtra("ground_cube_checked", ground_cube_checked);
                i.putExtra("teleop_grid", finalgrid2);
                i.putExtra("climb_time2", lol);


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
        CheckBox cube = (CheckBox) findViewById(R.id.Cube_select);
        CheckBox cone = (CheckBox) findViewById(R.id.Cone_select);
        RadioGroup shape2 = (RadioGroup) findViewById(R.id.shape2);
        

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


        //RadioButton x = (RadioButton) findViewById(R.id.X_select);
        RadioGroup row1 = (RadioGroup) findViewById(R.id.row1);
        RadioGroup row2 = (RadioGroup) findViewById(R.id.row2);
        RadioGroup row3 = (RadioGroup) findViewById(R.id.row3);

        Button reset = (Button) findViewById(R.id.Reset_Field);


        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(teleop.this);

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

        Button undo = (Button) findViewById(R.id.undo);

        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalgrid.size() >= 1) {
                    int index = finalgrid.size() - 1;
                    String str = finalgrid.get(index);
                    String a = str.substring(0, 3);
                    //Toast.makeText(teleop.this, a, Toast.LENGTH_SHORT).show();
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
        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(teleop.this);

                builder.setMessage("THIS IS FINAL!");
                builder.setTitle(" Are you sure you want to reset all data?");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // When the user click yes button then app will close
                    shape.clearCheck();
                    row1.clearCheck();
                    row2.clearCheck();
                    row3.clearCheck();
                    finalgrid2 = (String) "";
                });

                // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // If user click no then dialog box is canceled.
                    dialog.cancel();
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();
                // Show the Alert Dialog box
                alertDialog.show();
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
                    row1.clearCheck();
                    cube.setChecked(false);
                    Toast.makeText(teleop.this, "Grid1 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);
                }
                else if (grid1.isChecked() && cone.isChecked()) {
                    row1.clearCheck();
                    cone.setChecked(false);
                    Toast.makeText(teleop.this, "Grid1 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("1,1,cone,1?");
                    grid1.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);

                }
                else if (grid1.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();
                    cube2.setChecked(false);
                    Toast.makeText(teleop.this, "Grid1 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("1,1,cube,-1?");
                    grid1.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid1.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    Toast.makeText(teleop.this, "Grid1 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("1,1,cone,-1?");
                    cone2.setChecked(false);

                    grid1.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid2.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                    Toast.makeText(teleop.this, "Grid2 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("2,1,cube,-1?");
                    grid2.setBackgroundResource(R.drawable.cube);
                    cube.setChecked(false);
                }
                else if (grid2.isChecked() && cone.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid2 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);




                }
                else if (grid2.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid2 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("2,1,cube,-1?");
                    grid2.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);

                }
                else if (grid2.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid2 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("2,1,cone,-1?");
                    cone2.setChecked(false);

                    grid2.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid3.isChecked() && cube.isChecked()) {
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    row1.clearCheck();
                    Toast.makeText(teleop.this, "Grid3 Cube Selected", Toast.LENGTH_SHORT).show();
                    cube.setChecked(false);

                }
                else if (grid3.isChecked() && cone.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid3 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("3,1,cone,-1?");
                    grid3.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid3.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid3 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("3,1,cube,-1?");
                    cube2.setChecked(false);
                    grid3.setBackgroundResource(R.drawable.xcube);


                }
                else if (grid3.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid3 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("3,1,cube,-1?");
                    cone2.setChecked(false);

                    grid3.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid4.isChecked() && cube.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid4 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);


                }
                else if (grid4.isChecked() && cone.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid4 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("4,1,cone,1?");
                    grid4.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid4.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid4 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("4,1,cube,-1?");
                    grid4.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid4.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid4 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("4,1,cone,-1?");
                    grid4.setBackgroundResource(R.drawable.xtraingle);
                    cone2.setChecked(false);


                }
                if (grid5.isChecked() && cube.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid5 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("5,1,cube,1?");
                    grid5.setBackgroundResource(R.drawable.cube);
                    cube.setChecked(false);


                }
                else if (grid5.isChecked() && cone.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid5 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);


                }
                else if (grid5.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid5 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("5,1,cube,-1?");
                    grid5.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid5.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid5 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("5,1,cone,-1?");
                    grid5.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid6.isChecked() && cube.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid6 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);

                    //finalgrid.add("6,1,cube,1?";

                }
                else if (grid6.isChecked() && cone.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid6 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("6,1,cone,1?");
                    grid6.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid6.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid6 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("6,1,cube,-1?");
                    grid6.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid6.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid6 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("6,1,cone,-1?");
                    grid6.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid7.isChecked() && cube.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid7 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();
                    cube.setChecked(false);

                }
                else if (grid7.isChecked() && cone.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid7 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("7,1,cone,1?");
                    grid7.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid7.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid7 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("7,1,cube,-1?");
                    grid7.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid7.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid7 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("7,1,cone,-1?");
                    grid7.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid8.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid8 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("8,1,cube,1?");
                    grid8.setBackgroundResource(R.drawable.cube);


                }
                else if (grid8.isChecked() && cone.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid8 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);

                    //finalgrid.add("8,1,cone,1?";

                }
                else if (grid8.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid8 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("8,1,cube,-1?");
                    grid8.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid8.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid8 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("8,1,cone,-1?");
                    grid8.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid9.isChecked() && cube.isChecked()) {
                    row1.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid9 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("9,1,cube,1?";

                }
                else if (grid9.isChecked() && cone.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid9 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("9,1,cone,1?");
                    grid9.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid9.isChecked() && cube2.isChecked()) {
                    row1.clearCheck();

                    Toast.makeText(teleop.this, "Grid9 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("9,1,cube,-1?");
                    grid9.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid9.isChecked() && cone2.isChecked()) {
                    row1.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid9 X Cone Selected", Toast.LENGTH_SHORT).show();
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

                    Toast.makeText(teleop.this, "Grid10 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();


                }
                else if (grid10.isChecked() && cone.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid10 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("1,2,cone,1?");
                    grid10.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid10.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid10 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("1,2,cube,-1?");
                    grid10.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid10.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid10 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("1,2,cone,-1?");
                    grid10.setBackgroundResource(R.drawable.xtraingle);


                }

                if (grid11.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid11 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("2,2,cube,1?");
                    grid11.setBackgroundResource(R.drawable.cube);


                }
                else if (grid11.isChecked() && cone.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid11 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);

                    //finalgrid.add("2,2,cone,1?";

                }
                else if (grid11.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid11 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("2,2,cube,-1?");
                    grid11.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid11.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid11 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("2,2,cone,-1?");
                    grid11.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid12.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid12 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("3,2,cube,1?";

                }
                else if (grid12.isChecked() && cone.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid12 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("3,2,cone,1?");
                    grid12.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid12.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid12 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("3,2,cube,-1?");
                    grid12.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);



                }
                else if (grid12.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid12 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("3,2,cone,-1?");
                    grid12.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid13.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid13 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("4,2,cube,1?";

                }
                else if (grid13.isChecked() && cone.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid13 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("4,2,cone,1?");
                    grid13.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid13.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid13 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("4,2,cube,-1?");
                    grid13.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid13.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid13 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("4,2,cone,-1?");
                    grid13.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid14.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid14 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("5,2,cube,1?");
                    grid14.setBackgroundResource(R.drawable.cube);


                }
                else if (grid14.isChecked() && cone.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid14 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);

                    //finalgrid.add("5,2,cone,1?";

                }
                else if (grid14.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid14 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("5,2,cube,-1?");
                    grid14.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid14.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid14 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("5,2,cone,-1?");
                    grid14.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid15.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid15 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("6,2,cube,1?";

                }
                else if (grid15.isChecked() && cone.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid15 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("6,2,cone,1?");
                    grid15.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid15.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid15 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("6,2,cube,-1?");
                    grid15.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid15.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid15 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("6,2,cone,-1?");
                    grid15.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid16.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid16 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("7,2,cube,1?";

                }
                else if (grid16.isChecked() && cone.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid16 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("7,2,cone,1?");
                    grid16.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid16.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid16 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("7,2,cube,-1?");
                    grid16.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid16.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid16 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("7,2,cone,-1?");
                    grid16.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid17.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid17 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("8,2,cube,1?");
                    grid17.setBackgroundResource(R.drawable.cube);


                }
                else if (grid17.isChecked() && cone.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid17 Cone Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cone_message.create();
                    alert11.show();
                    cone.setChecked(false);

                    //finalgrid.add("8,2,cone,1?";

                }
                else if (grid17.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid17 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("8,2,cube,-1?");
                    grid17.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid17.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid17 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("8,2,cone,-1?");
                    grid17.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid18.isChecked() && cube.isChecked()) {
                    row2.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid18 Cube Selected", Toast.LENGTH_SHORT).show();
                    AlertDialog alert11 = cube_message.create();
                    alert11.show();

                    //finalgrid.add("9,2,cube,1?";

                }
                else if (grid18.isChecked() && cone.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid18 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("9,2,cone,1?");
                    grid18.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                }
                else if (grid18.isChecked() && cube2.isChecked()) {
                    row2.clearCheck();

                    Toast.makeText(teleop.this, "Grid18 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("9,2,cube,-1?");
                    grid18.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid18.isChecked() && cone2.isChecked()) {
                    row2.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid18 X Cone Selected", Toast.LENGTH_SHORT).show();
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

                    Toast.makeText(teleop.this, "Grid19 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("1,3,cube,1?");
                    grid19.setBackgroundResource(R.drawable.cube);


                } else if (grid19.isChecked() && cone.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid19 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("1,3,cone,1?");
                    grid19.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid19.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid19 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("1,3,cube,-1?");
                    grid19.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid19.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid19 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("1,3,cone,-1?");
                    grid19.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid20.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid20 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("2,3,cube,1?");
                    grid20.setBackgroundResource(R.drawable.cube);


                } else if (grid20.isChecked() && cone.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid20 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("2,3,cone,1?");
                    grid20.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid20.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid20 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("2,3,cube,-1?");
                    grid20.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid20.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid20 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("2,3,cone,-1?");
                    grid20.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid21.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid21 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("3,3,cube,1?");
                    grid21.setBackgroundResource(R.drawable.cube);


                } else if (grid21.isChecked() && cone.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid21 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("3,3,cone,1?");
                    grid21.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid21.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid21 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("3,3,cube,-1?");
                    grid21.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid21.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid21 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("3,3,cone,-1?");
                    grid21.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid22.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid22 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("4,3,cube,1?");
                    grid22.setBackgroundResource(R.drawable.cube);


                } else if (grid22.isChecked() && cone.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid22 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("4,3,cone,1?");
                    grid22.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid22.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid22 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("4,3,cube,-1?");
                    grid22.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid22.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid22 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("4,3,cone,-1?");
                    grid22.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid23.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid23 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("5,3,cube,1?");
                    grid23.setBackgroundResource(R.drawable.cube);


                } else if (grid23.isChecked() && cone.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid23 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("5,3,cone,1?");
                    grid23.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid23.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid23 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("5,3,cube,-1?");
                    grid23.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid23.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid23 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("5,3,cone,-1?");
                    grid23.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid24.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid24 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("6,3,cube,1?");
                    grid24.setBackgroundResource(R.drawable.cube);


                } else if (grid24.isChecked() && cone.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid24 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("6,3,cone,1?");
                    grid24.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid24.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid24 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("6,3,cube,-1?");
                    grid24.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid24.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid24 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("6,3,cone,-1?");
                    grid24.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid25.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid25 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("7,3,cube,1?");
                    grid25.setBackgroundResource(R.drawable.cube);


                } else if (grid25.isChecked() && cone.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid25 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("7,3,cone,1?");
                    grid25.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid25.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid25 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("7,3,cube,-1?");
                    grid25.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid25.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid25 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("7,3,cone,-1?");
                    grid25.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid26.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid26 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("8,3,cube,1?");
                    grid26.setBackgroundResource(R.drawable.cube);


                } else if (grid26.isChecked() && cone.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid26 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("8,3,cone,1?");
                    grid26.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);



                } else if (grid26.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid26 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("8,3,cube,-1?");
                    grid26.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid26.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);

                    Toast.makeText(teleop.this, "Grid26 X Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("8,3,cone,-1?");
                    grid26.setBackgroundResource(R.drawable.xtraingle);


                }
                if (grid27.isChecked() && cube.isChecked()) {
                    row3.clearCheck();
                    cube.setChecked(false);
                    cube.setChecked(false);

                    Toast.makeText(teleop.this, "Grid27 Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("9,3,cube,1?");
                    grid27.setBackgroundResource(R.drawable.cube);


                } else if (grid27.isChecked() && cone.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid27 Cone Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("9,3,cone,1?");
                    grid27.setBackgroundResource(R.drawable.triangle_real);
                    cone.setChecked(false);


                } else if (grid27.isChecked() && cube2.isChecked()) {
                    row3.clearCheck();

                    Toast.makeText(teleop.this, "Grid27 X Cube Selected", Toast.LENGTH_SHORT).show();
                    finalgrid.add("9,3,cube,-1?");
                    grid27.setBackgroundResource(R.drawable.xcube);
                    cube2.setChecked(false);


                }
                else if (grid27.isChecked() && cone2.isChecked()) {
                    row3.clearCheck();
                    cone2.setChecked(false);
                    Toast.makeText(teleop.this, "Grid27 X Cone Selected", Toast.LENGTH_SHORT).show();
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