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

public class BanksyActivity extends AppCompatActivity {

    ImageView banksy_call, img_heart_banksy;
    Button reserv_banksy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banksy_detail);

        banksy_call = (ImageView) findViewById(R.id.banksy_call);
        reserv_banksy = (Button) findViewById(R.id.reserv_banksy);
        img_heart_banksy = (ImageView) findViewById(R.id.img_heart_banksy);
        final boolean[] i = {true};

        banksy_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:025162513"));
                startActivity(intent);
            }
        });

        reserv_banksy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.seouliteum.com/"));
                startActivity(intent);
            }
        });

        img_heart_banksy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i[0] ==true){
                    img_heart_banksy.setImageResource(R.drawable.heart_full);
                    i[0] = false;
                } else{
                    img_heart_banksy.setImageResource(R.drawable.heart_non);
                    i[0] = false;
                }
            }
        });

    }

}
