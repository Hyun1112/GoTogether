package com.example.myapp;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class YosigoActivity extends AppCompatActivity {

    ImageView yosigo_call, img_heart_yosigo;
    Button reserv_yosigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yosigo_detail);

        yosigo_call = (ImageView) findViewById(R.id.yosigo_call);
        reserv_yosigo = (Button) findViewById(R.id.reserv_yosigo);
        img_heart_yosigo = (ImageView) findViewById(R.id.img_heart_yosigo);
        final boolean[] i = {true};

        yosigo_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:025019544"));
                startActivity(intent);
            }
        });

        reserv_yosigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://groundseesaw.co.kr/"));
                startActivity(intent);
            }
        });

        img_heart_yosigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i[0] ==true){
                    img_heart_yosigo.setImageResource(R.drawable.heart_full);
                    i[0] = false;
                } else{
                    img_heart_yosigo.setImageResource(R.drawable.heart_non);
                    i[0] = false;
                }
            }
        });

    }

}
