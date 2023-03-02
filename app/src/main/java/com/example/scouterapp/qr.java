package com.example.scouterapp;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;
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
        climb_time = climb_time.replace(":", "");

        String left_community_checked = intent.getStringExtra("left_community_checked");
        String Docked_Engaged_checked = intent.getStringExtra("Docked_Engaged_checked");
        String docked_checked = intent.getStringExtra("docked_checked");
        String engaged_checked = intent.getStringExtra("engaged_checked");
        String auto_grid = intent.getStringExtra("auto_grid");
        auto_grid = (String) auto_grid.replace(",",".");




        //Teleop
        String cone_pickup_checked = intent.getStringExtra("cone_pickup_checked");
        String cube_pickup_checked = intent.getStringExtra("cube_pickup_checked");
        String station_cone_checked = intent.getStringExtra("station_cone_checked");
        String station_cube_checked = intent.getStringExtra("station_cube_checked");
        String ground_cone_checked = intent.getStringExtra("ground_cone_checked");
        String ground_cube_checked = intent.getStringExtra("ground_cube_checked");
        String teleop_grid = intent.getStringExtra("teleop_grid");
        String climb_time2 = intent.getStringExtra("climb_time2");
        climb_time2 = climb_time2.replace(":", "");



        //Endgame
        String attempted_checked = intent.getStringExtra("attempted_checked");
        String docked2_checked = intent.getStringExtra("docked2_checked");
        String engaged2_checked = intent.getStringExtra("engaged2_checked");
        String soloclimb_checked = intent.getStringExtra("soloclimb_checked");
        String gave_assistance_checked = intent.getStringExtra("gave_assistance_checked");
        String recieved_assistance_checked = intent.getStringExtra("recieved_assistance_checked");
        String parked_checked = intent.getStringExtra("parked_checked");
        String climb_time3 = intent.getStringExtra("climb_time3");
        climb_time3 = climb_time3.replace(":", "");

        String aggression = intent.getStringExtra("aggression");
        String additional = intent.getStringExtra("additional");
        String type = intent.getStringExtra("type");

        String win = intent.getStringExtra("win");

        //Final string output
        String finalresult = Match_Number + ";" + Team_Number + ";" + Alliance + ";" + Driver_Station + ";" + climb_time + ";" + auto_grid + ";" + left_community_checked + ";" + Docked_Engaged_checked + ";" + docked_checked + ";" + engaged_checked + ";" + cone_pickup_checked + ";" + cube_pickup_checked + ";" + station_cone_checked + ";" + station_cube_checked + ";" + ground_cone_checked + ";" + ground_cube_checked + ";" + teleop_grid + ";" + climb_time2 + ";" + attempted_checked + ";" + docked2_checked + ";" + engaged2_checked + ";" + soloclimb_checked + ";" + gave_assistance_checked + ";" + recieved_assistance_checked + ";" + parked_checked + ";" + climb_time3 + ";" + aggression + ";" + type + ";" + additional + ";" + win + "?";




        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_qr);

        AlertDialog.Builder check = new AlertDialog.Builder(qr.this);
        check.setIcon(android.R.drawable.ic_dialog_alert);

        check.setMessage("Is this correct?:" + "\n" +
                "Match Number: " + Match_Number + "\n" +
                "Team Number: " + Team_Number +"\n" +
                "Alliance: " + Alliance +"\n" +
                "Driver Station: " + Driver_Station +"\n"
);
        check.setCancelable(true);

        check.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        check.setNegativeButton(
                "\uD83D\uDE28 No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });






        Button backward = (Button) findViewById(R.id.Backward_page_5);


        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        Button bt_generate = findViewById(R.id.button);
        bt_generate.setOnClickListener(v->{
            AlertDialog alert11 = check.create();
            alert11.show();


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
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}