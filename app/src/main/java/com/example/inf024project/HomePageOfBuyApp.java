package com.example.inf024project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageOfBuyApp extends AppCompatActivity {

    private Button profile_btn;
    private Button bell_btn ;
    private Button camera_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_home_page);
        //Activate profile button
        profile_btn = (Button) findViewById(R.id.profile_btn);
        profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfilepage();
            }
        });

        //Activate notifications button
        bell_btn = (Button) findViewById(R.id.bell_btn);
        bell_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotificationPage();
            }
        });

        //Activate notifications button
        camera_btn = (Button) findViewById(R.id.camera_btn);
        camera_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductDetailsPage();
            }
        });
    }
    public void openProfilepage(){
        Intent intent = new Intent(this, ProfilePage.class );
                startActivity(intent);
    }

    public void openNotificationPage(){
        Intent intent = new Intent(this, NotificationPage.class);
        startActivity(intent);
    }
    public void openProductDetailsPage(){
        Intent intent = new Intent(this, ProductDetails.class);
        startActivity(intent);
    }
}