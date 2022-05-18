package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SeoulActivity extends AppCompatActivity {

    ImageButton list_alice, list_yosigo, list_banksy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_seoul);

        list_alice = (ImageButton) findViewById(R.id.list_alice);
        list_yosigo = (ImageButton) findViewById(R.id.list_yosigo);
        list_banksy = (ImageButton) findViewById(R.id.list_banksy);

        list_alice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_act = new Intent(getApplicationContext(),AliceActivity.class);
                startActivity(intent_act);
            }
        });

        list_yosigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_act = new Intent(getApplicationContext(),YosigoActivity.class);
                startActivity(intent_act);
            }
        });

        list_banksy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_act = new Intent(getApplicationContext(),BanksyActivity.class);
                startActivity(intent_act);
            }
        });

    }

}
