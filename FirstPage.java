package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FirstPage extends AppCompatActivity {
    EditText id_TextField; // 아이디 입력란 선언
    private EditText password_TextField; // 비밀번호 입력한 선언
    Button login_Button; // 로그인 버튼 선언
    Button signUp_Button; // 회원가입 버튼 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start();
    }

    void start (){
        id_TextField = (EditText) findViewById(R.id.id_TextField_L); // 아이디 입력란 정의
        password_TextField = (EditText) findViewById(R.id.password_TextField_L); // 비밀번호 입력란 정의

        login_Button = (Button) findViewById(R.id.login_Button_L); // 로그인 버튼 정의
        signUp_Button = (Button) findViewById(R.id.signUp_Button_L); // 회원가입 버튼 정의

        // 로그인 버튼 클릭 리스너 선언 및 정의
        login_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String id = id_TextField.getText().toString(); // 입력된 아이디 문자열로 가져오기
                String password = password_TextField.getText().toString(); // 입력된 비밀번호 문자열로 가져오기

                // 가져온 아이디와 비밀번호가 "null", ""이 아닐때 - "" = 공백
                if (id != null && password != null && id != "" && password != ""){
                    // id, password 비교 작업

                    // 아이디, 비밀번호가 맞을 경우
                    if (true){ // 임시로 true 설정
                        Intent main_Page = new Intent(getApplicationContext(), MainPage.class);
                        startActivity(main_Page); // 메인 페이지로 화면 전환

                        finish(); // 로그인 페이지 종료
                    } else { // 아이디, 비밀번호가 틀릴 경우

                    }
                } else { // 아이디 또는 비밀번호가 공백이거나 null일 경우
                    // 표시할 방식 정해야 함

                }

            }
        });

        // 회원가입 버튼 클릭 리스너 선언 및 정의
        signUp_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 회원가입 버튼 클릭 시 회원가입 화면으로 전환
                // 로그인 화면 위로 회원가입 화면을 올리는 방식 - 뒤로가기를 눌렀을때 로그인 화면으로 이동 됨
                Intent signUp_Page = new Intent(getApplicationContext(), SignUpPage.class);
                startActivity(signUp_Page);
            }
        });
    }

}