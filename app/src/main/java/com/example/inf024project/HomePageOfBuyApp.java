package com.example.inf024project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class HomePageOfBuyApp extends AppCompatActivity implements View.OnClickListener {

    public Button profile_btn,bell_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_home_page);
        profile_btn = findViewById(R.id.profile_btn);
        bell_btn = findViewById(R.id.bell_btn);
        profile_btn.setOnClickListener(this);
        bell_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case(R.id.profile_btn):
                profile_bt();
            case(R.id.bell_btn):
                bell_btn();
        }
    }
    public void profile_bt(){
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }
    public void bell_btn(){
        Intent intent = new Intent(this, NotificationPage.class);
        startActivity(intent);
    }
}