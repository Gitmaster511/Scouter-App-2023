package com.example.scouterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class qr extends AppCompatActivity {


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
        String climb_time = intent.getStringExtra("climb_time");
        String left_community_checked = intent.getStringExtra("left_community_checked");
        String Docked_Engaged_checked = intent.getStringExtra("Docked_Engaged_checked");
        String assisted_checked = intent.getStringExtra("assisted_checked");
        String docked_checked = intent.getStringExtra("docked_checked");
        String engaged_checked = intent.getStringExtra("engaged_checked");
        String First_array = intent.getStringExtra("First_array");
        String Second_array = intent.getStringExtra("Second_array");
        First_array = (String) First_array.replace(",",".");
        Second_array = (String) Second_array.replace(",",".");




        //Teleop
        String cone_pickup_checked = intent.getStringExtra("cone_pickup_checked");
        String cube_pickup_checked = intent.getStringExtra("cube_pickup_checked");
        String station_cone_checked = intent.getStringExtra("station_cone_checked");
        String station_cube_checked = intent.getStringExtra("station_cube_checked");
        String ground_cone_checked = intent.getStringExtra("ground_cone_checked");
        String ground_cube_checked = intent.getStringExtra("ground_cube_checked");
        String final3 = intent.getStringExtra("final3");
        String final4 = intent.getStringExtra("final4");
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

        String aggression = intent.getStringExtra("aggression");
        String additional = intent.getStringExtra("additional");

        String win = intent.getStringExtra("win");


        //Final string output
        String finalresult = Match_Number + ";" + Team_Number + ";" + Alliance + ";" + Driver_Station + ";" + climb_time + ";" + First_array + ";" + Second_array + ";" + left_community_checked + ";" + Docked_Engaged_checked + ";" + assisted_checked + ";" + docked_checked + ";" + engaged_checked + ";" + cone_pickup_checked + ";" + cube_pickup_checked + ";" + station_cone_checked + ";" + station_cube_checked + ";" + ground_cone_checked + ";" + ground_cube_checked + ";" + final3 + ";" + final4 + ";" + climb_time2 + ";" + attempted_checked + ";" + docked2_checked + ";" + engaged2_checked + ";" + soloclimb_checked + ";" + gave_assistance_checked + ";" + recieved_assistance_checked + ";" + parked_checked + ";" + climb_time3 + ";" + aggression + ";" + additional + ";" + win + "?";




        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_qr);


        Button backward = (Button) findViewById(R.id.Backward_page_5);


        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(qr.this, notes.class);
                startActivity(signup);
            }
        });


        Button bt_generate = findViewById(R.id.button);
        bt_generate.setOnClickListener(v->{



            MultiFormatWriter writer = new MultiFormatWriter();
            try
            {
                BitMatrix matrix = writer.encode((finalresult),
                        BarcodeFormat.QR_CODE,
                        800,
                        800);
                BarcodeEncoder encoder = new BarcodeEncoder();
                Bitmap bitmap = encoder.createBitmap(matrix);
                ImageView iv_qr = findViewById(R.id.view9);
                //set data image to imageview
                iv_qr.setImageBitmap(bitmap);
            } catch (WriterException e)
            {
                e.printStackTrace();
            }
        });
    }}