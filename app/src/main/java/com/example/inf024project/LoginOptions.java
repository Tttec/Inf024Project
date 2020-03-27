package com.example.inf024project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginOptions extends AppCompatActivity implements View.OnClickListener {

    private Button register, facebook, google, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_options);
        facebook = (Button) findViewById(R.id.facebook);
        google = (Button) findViewById(R.id.google);
        register = (Button) findViewById(R.id.register);
        login = (Button) findViewById(R.id.login_login_options);
        register.setOnClickListener(this);
        facebook.setOnClickListener(this);
        google.setOnClickListener(this);
        login.setOnClickListener(this);
    }


    public void onClick(View v) {

        switch (v.getId()) {
            case (R.id.register):
                openRegister();
                break;
            case (R.id.facebook): // facebook ile bağlan butonuna tıklama
                break;
            case (R.id.google): // google ile bağlan butonuna tıklama
                break;
            case (R.id.login_login_options):
                openLogin();
                break;


        }
    }

    public void openRegister(){
        Intent intent=new Intent(LoginOptions.this, Register.class);
        startActivity(intent);
    }

    public void openLogin(){
        Intent intent=new Intent(LoginOptions.this, UserLogin.class);
        startActivity(intent);
    }


    }
