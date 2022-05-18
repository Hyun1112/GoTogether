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

public class ForestActivity extends AppCompatActivity {

    ImageView forest_call, img_heart_forest;
    Button reserv_forest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forest_detail);

        forest_call = (ImageView) findViewById(R.id.forest_call);
        reserv_forest = (Button) findViewById(R.id.reserv_forest);
        img_heart_forest = (ImageView) findViewById(R.id.img_heart_forest);
        final boolean[] i = {true};

        forest_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0226430315"));
                startActivity(intent);
            }
        });

        reserv_forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.media-forest.co.kr/"));
                startActivity(intent);
            }
        });

        img_heart_forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i[0] ==true){
                    img_heart_forest.setImageResource(R.drawable.heart_full);
                    i[0] = false;
                } else{
                    img_heart_forest.setImageResource(R.drawable.heart_non);
                    i[0] = false;
                }
            }
        });

    }

}
