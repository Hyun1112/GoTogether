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

public class AliceActivity extends AppCompatActivity {

    ImageView alice_call, img_heart;
    Button reserv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alice_detail);

        alice_call = (ImageView) findViewById(R.id.alice_call);
        reserv1 = (Button) findViewById(R.id.reserv_alice);
        img_heart = (ImageView) findViewById(R.id.img_heart);
        final boolean[] i = {true};

        alice_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:025678878"));
                startActivity(intent);
            }
        });

        reserv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.myartmuseum.kr"));
                startActivity(intent);
            }
        });

        img_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i[0] ==true){
                    img_heart.setImageResource(R.drawable.heart_full);
                    i[0] = false;
                } else{
                    img_heart.setImageResource(R.drawable.heart_non);
                    i[0] = false;
                }
            }
        });

    }

}
