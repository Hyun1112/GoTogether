package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp.R;

public class JoinActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);

        EditText join_name=findViewById(R.id.join_name);
        EditText join_id=findViewById(R.id.join_id);
        EditText join_pw=findViewById(R.id.join_pw);
        Button join_back=findViewById(R.id.join_back);

        //뒤로가기 버튼
        join_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        //이름,id,pw를 putExtra로 담음.
        Button join_clear=findViewById(R.id.join_clear);
        join_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username=join_name.getText().toString();
                final String userid=join_id.getText().toString();
                final String userpw=join_pw.getText().toString();

                //모두 입력하지 않았을 때 알림 메시지
                if(username.equals("")||userid.equals("")||userpw.equals("")){
                    AlertDialog.Builder dialog=new AlertDialog.Builder(JoinActivity.this);
                    dialog.setIcon(R.mipmap.ic_launcher);
                    dialog.setTitle("알림");
                    dialog.setMessage("모두 입력하시오.");
                    dialog.setNegativeButton("확인",null);
                    dialog.show();
                }

                //모든 칸 입력 후 로그인 화면으로
                else{
                    Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                    intent.putExtra("userid",userid);
                    intent.putExtra("userpw",userpw);
                    intent.putExtra("username",username);
                    startActivityForResult(intent,RESULT_OK);
                }
            }
        });
    }
}
