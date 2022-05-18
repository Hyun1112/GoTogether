package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class EtcActivity extends AppCompatActivity {
    ImageButton list_mone, list_yumi, list_forest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_etc);

        list_mone = (ImageButton) findViewById(R.id.list_mone);
        list_forest = (ImageButton) findViewById(R.id.list_forest);
        list_yumi = (ImageButton) findViewById(R.id.list_yumi);

        list_mone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_act = new Intent(getApplicationContext(),MoneActivity.class);
                startActivity(intent_act);
            }
        });

        list_forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_act = new Intent(getApplicationContext(),ForestActivity.class);
                startActivity(intent_act);
            }
        });

        list_yumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_act = new Intent(getApplicationContext(),YumiActivity.class);
                startActivity(intent_act);
            }
        });
    }

}
