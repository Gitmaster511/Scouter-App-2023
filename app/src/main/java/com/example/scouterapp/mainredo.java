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
//Could be removed


public class mainredo extends AppCompatActivity {
    RadioGroup radioGroup;

    String Alliance= "";
    String driver_station;
    String d = "sharedPrefs";







    @SuppressLint("AppCompatMethod")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = getIntent();

        //Main
        String Match_Number = intent.getStringExtra("Match_Number");
        String Team_Number = intent.getStringExtra("Team_Number");
        String Alliance = intent.getStringExtra("Alliance");
        String Driver_Station = intent.getStringExtra("Driver_Station");




        //Auto
        String climb_time21 = intent.getStringExtra("climb_time");
        String climb_time = climb_time21.replace(":", "");

        String left_community_checked = intent.getStringExtra("left_community_checked");
        String Docked_Engaged_checked = intent.getStringExtra("Docked_Engaged_checked");
        String docked_checked = intent.getStringExtra("docked_checked");
        String engaged_checked = intent.getStringExtra("engaged_checked");
        String auto_grid2 = intent.getStringExtra("auto_grid");
        String auto_grid = (String) auto_grid2.replace(",",".");




        //Teleop
        String cone_pickup_checked = intent.getStringExtra("cone_pickup_checked");
        String cube_pickup_checked = intent.getStringExtra("cube_pickup_checked");
        String station_cone_checked = intent.getStringExtra("station_cone_checked");
        String station_cube_checked = intent.getStringExtra("station_cube_checked");
        String ground_cone_checked = intent.getStringExtra("ground_cone_checked");
        String ground_cube_checked = intent.getStringExtra("ground_cube_checked");
        String teleop_grid = intent.getStringExtra("teleop_grid");
        String climb_time22 = intent.getStringExtra("climb_time2");
        String climb_time2 = (String) climb_time22.replace(":", "");



        //Endgame
        String attempted_checked = intent.getStringExtra("attempted_checked");
        String docked2_checked = intent.getStringExtra("docked2_checked");
        String engaged2_checked = intent.getStringExtra("engaged2_checked");
        String soloclimb_checked = intent.getStringExtra("soloclimb_checked");
        String gave_assistance_checked = intent.getStringExtra("gave_assistance_checked");
        String recieved_assistance_checked = intent.getStringExtra("recieved_assistance_checked");
        String parked_checked = intent.getStringExtra("parked_checked");
        String climb_time33 = intent.getStringExtra("climb_time3");
        String climb_time3 = climb_time33.replace(":", "");

        String aggression = intent.getStringExtra("aggression");
        String additional = intent.getStringExtra("additional");
        String type = intent.getStringExtra("type");

        String win = intent.getStringExtra("win");


        if(savedInstanceState != null) {
            String matchNumber_string_lol;
            matchNumber_string_lol = (String) savedInstanceState.getString("matchNumber_string_2");

        }

        // Remove topbar and bottombar


        //DON'T CHANGE THIS IT WORKS WITHOUT THE CHANGE
        requestWindowFeature(Window.FEATURE_NO_TITLE);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);


        //Match Number
        EditText matchNumber = (EditText) findViewById(R.id.match_number_input);
        matchNumber.setTextColor(Color.WHITE);//set the red text color
        String matchNumber_string = "";
        matchNumber_string = (String) matchNumber.getText().toString();



        //Team Number
        EditText teamNumber = (EditText) findViewById(R.id.team_number_input);
        teamNumber.setTextColor(Color.WHITE);//set the red text color
        //String teamNumberOutput = teamNumber.getText().toString();
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


                if (Red.isChecked())
                {
                    Alliance = (String) "Red";
                }

                if (Blue.isChecked())
                {
                    Alliance = (String) "Blue";
                }


                if(Left.isChecked())
                {
                    DriverStation = (String) "Left";
                }
                if(Mid.isChecked())
                {
                    DriverStation = (String) "Middle";
                }
                if(Right.isChecked())
                {
                    DriverStation = (String) "Right";
                }

                Intent i = new Intent(mainredo.this, qr.class);
                i.putExtra ( "Match_Number", matchNumber.getText().toString());
                i.putExtra ( "Team_Number", teamNumber.getText().toString());
                i.putExtra ( "Alliance", Alliance.toString());
                i.putExtra("Driver_Station", DriverStation);

                i.putExtra ( "Match_Number", Match_Number);
                i.putExtra ( "Team_Number", Team_Number);
                i.putExtra ( "Alliance", Alliance);
                i.putExtra("Driver_Station",Driver_Station);

                //Second page
                i.putExtra("climb_time", climb_time);
                i.putExtra("auto_grid",auto_grid);
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
                i.putExtra("aggression", aggression);
                i.putExtra("aggression", aggression);
                i.putExtra ("additional",additional);
                i.putExtra("type", type);
                i.putExtra("win", win);
                startActivity(i);

                startActivity(i);
            }
        });





        //Radio Group, displays what button is pressed with Toast
        radioGroup = findViewById(R.id.driverStationButton);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                                  @Override
                                                  public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                      // on below line we are getting radio button from our group.
                                                      RadioButton radioButton = findViewById(checkedId);
                                                  }
                                              }
        );
    }
      /*
    @Override

    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("matchNumber_string_2", "5");

    }
    */


}