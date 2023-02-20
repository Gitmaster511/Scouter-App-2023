package com.example.scouterapp;

import androidx.appcompat.app.AppCompatActivity;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
                BitMatrix matrix = writer.encode("Hello world", BarcodeFormat.QR_CODE,600,600);
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