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

public class YumiActivity extends AppCompatActivity {

    ImageView yumi_call, img_heart_yumi;
    Button reserv_yumi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yumi_detail);

        yumi_call = (ImageView) findViewById(R.id.yumi_call);
        reserv_yumi = (Button) findViewById(R.id.reserv_yumi);
        img_heart_yumi = (ImageView) findViewById(R.id.img_heart_yumi);
        final boolean[] i = {true};

        yumi_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:07088930892"));
                startActivity(intent);
            }
        });

        reserv_yumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sangsangmadang.com/main/BS"));
                startActivity(intent);
            }
        });

        img_heart_yumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i[0] ==true){
                    img_heart_yumi.setImageResource(R.drawable.heart_full);
                    i[0] = false;
                } else{
                    img_heart_yumi.setImageResource(R.drawable.heart_non);
                    i[0] = false;
                }
            }
        });

    }

}
