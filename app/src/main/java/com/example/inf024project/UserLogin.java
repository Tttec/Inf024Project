package com.example.inf024project;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class UserLogin extends AppCompatActivity {

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);
        login = (Button) findViewById(R.id.login_login_options);
        EditText loginEmail = (EditText) findViewById(R.id.login_email);
        EditText loginPass = (EditText) findViewById(R.id.login_pass);

        //login.setOnClickListener(this);

        }




    }



