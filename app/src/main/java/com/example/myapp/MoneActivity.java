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

public class MoneActivity extends AppCompatActivity {

    ImageView mone_call, img_heart_mone;
    Button reserv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mone_detail);

        mone_call = (ImageView) findViewById(R.id.mone_call);
        reserv2 = (Button) findViewById(R.id.reserv2);
        img_heart_mone = (ImageView) findViewById(R.id.img_heart_mone);
        final boolean[] i = {true};

        mone_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:15222653"));
                startActivity(intent);
            }
        });

        reserv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bunkerdelumieres.com/"));
                startActivity(intent);
            }
        });

        img_heart_mone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i[0] ==true){
                    img_heart_mone.setImageResource(R.drawable.heart_full);
                    i[0] = false;
                } else{
                    img_heart_mone.setImageResource(R.drawable.heart_non);
                    i[0] = false;
                }
            }
        });

    }

}
