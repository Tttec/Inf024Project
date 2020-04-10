package com.example.inf024project;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class UserLogin extends AppCompatActivity implements View.OnClickListener{

    private Button login;
    private EditText loginEmail, loginPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);
        login = (Button) findViewById(R.id.login_login_options);
        loginEmail = (EditText) findViewById(R.id.login_email);
        loginPass = (EditText) findViewById(R.id.login_pass);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        OnLogin(v);
    }

    public void OnLogin(View view) {

    String username = (String) loginEmail.getText().toString();
    String password = (String) loginPass.getText().toString();
    String type = "login";
    DatabaseConnection db = new DatabaseConnection(this);
    db.execute(type, username, password);
    }


}



