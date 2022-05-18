package com.example.myapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MAIN=100;
    public static final int REQUEST_CODE_SIGNUP=101;
    private Button login_exit;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button login_button1 = findViewById(R.id.login_button1);
        Button login_button2 = findViewById(R.id.login_button2);
        Button login_exit = findViewById(R.id.login_exit);

        //회원가입 버튼 클릭시 SIGN UP창으로 이동
        login_button2.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),JoinActivity.class);
                startActivityForResult(intent,REQUEST_CODE_SIGNUP);
            }
        });

        //앱 종료 버튼 클릭 시 앱 종료
        login_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(LoginActivity.this)
                        .setTitle("Application 종료")
                        .setMessage("애플리케이션을 종료하시겠습니까?")

                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(LoginActivity.this, "애플리케이션이 종료되었습니다.", Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        })
                        .setNegativeButton("NO", null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }

        });

    }

    // 로그인 기능
    public void login(View v){
        EditText editText=findViewById(R.id.login_editText1); //아이디
        EditText editText2=findViewById(R.id.login_editText2); //패스워드

        //회원가입창에서 가져온 데이터 입력
        Intent receiveIntent=getIntent();

        String id = receiveIntent.getStringExtra("userid");
        String pw = receiveIntent.getStringExtra("userpw");
        String name = receiveIntent.getStringExtra("username");

        String userid = editText.getText().toString();
        String userpw = editText2.getText().toString();

        //아이디 비밀번호 둘 다 맞다면 홈 화면으로 이동. 틀리면 메시지 출력
        if(userid.equals(id)){
            if(userpw.equals(pw)){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);

                Toast.makeText(this,name+"님 안녕하세요.",Toast.LENGTH_SHORT).show();
                startActivityForResult(intent,REQUEST_CODE_MAIN);
            }
            else{
                Toast.makeText(getApplicationContext(),"아이디 혹은 비밀번호가 일치하지 않습니다",Toast.LENGTH_SHORT).show();
            }
        }
        else{ Toast.makeText(getApplicationContext(),"아이디 혹은 비밀번호가 일치하지 않습니다",Toast.LENGTH_SHORT).show();
        }
    }
}
