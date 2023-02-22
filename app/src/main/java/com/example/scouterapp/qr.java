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
        int First_array = intent.getIntExtra("First_array", 0);
        int Second_array = intent.getIntExtra("Second_array", 0);
        String left_community_checked = intent.getStringExtra("left_community_checked");
        String Docked_Engaged_checked = intent.getStringExtra("Docked_Engaged_checked");
        String assisted_checked = intent.getStringExtra("assisted_checked");
        String docked_checked = intent.getStringExtra("docked_checked");
        String engaged_checked = intent.getStringExtra("engaged_checked");




        //Teleop
        String cone_pickup_checked = intent.getStringExtra("cone_pickup_checked");
        String cube_pickup_checked = intent.getStringExtra("cube_pickup_checked");
        String station_cone_checked = intent.getStringExtra("station_cone_checked");
        String station_cube_checked = intent.getStringExtra("station_cube_checked");
        String ground_cone_checked = intent.getStringExtra("ground_cone_checked");
        String ground_cube_checked = intent.getStringExtra("ground_cube_checked");
        int final3 = intent.getIntExtra("final3", 0);
        int final4 = intent.getIntExtra("final4", 0);
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
        


        //String First_array = String.valueOf(First_array);

        //String Second_array = String.valueOf(Second_array);

        String Third_array = String.valueOf(final3);

        String Fourth_array = String.valueOf(final4);



        //Second page

        String[] finalresult = {Match_Number, Team_Number, Alliance, Driver_Station,climb_time,left_community_checked,Docked_Engaged_checked,assisted_checked,docked_checked,engaged_checked,
                cone_pickup_checked,cube_pickup_checked,station_cone_checked,station_cube_checked,ground_cone_checked,ground_cube_checked,climb_time2,
                attempted_checked,docked2_checked,engaged2_checked,soloclimb_checked,gave_assistance_checked,recieved_assistance_checked,parked_checked,climb_time3,
                aggression,additional,win};

        String str = String.join(";", finalresult);



        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_qr);

        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

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
                BitMatrix matrix = writer.encode((str),
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