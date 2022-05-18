package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Adapter adapter;
    ViewPager viewPager;
    ImageButton imgbtn1, imgbtn2, imgbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        adapter = new Adapter(this);
        viewPager.setAdapter(adapter);

        imgbtn1 = (ImageButton)findViewById(R.id.imagebtn1);
        imgbtn2 = (ImageButton)findViewById(R.id.imagebtn2);
        imgbtn3 = (ImageButton)findViewById(R.id.imagebtn3);

        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_act = new Intent(getApplicationContext(),SeoulActivity.class);
                startActivity(intent_act);
            }
        });

        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_act = new Intent(getApplicationContext(),EtcActivity.class);
                startActivity(intent_act);
            }
        });

        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_act = new Intent(getApplicationContext(),AliceActivity.class);
                startActivity(intent_act);
            }
        });

    }
}

