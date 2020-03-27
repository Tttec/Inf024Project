package com.example.inf024project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class BuyOrGo extends AppCompatActivity {
    Button buy,go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_or_go);

        buy=findViewById(R.id.buy_btn);
        go=findViewById(R.id.go_btn);

        // Buy butonuna basılınca yapılacak işler

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BuyOrGo.this,buy.class);
                startActivity(intent);
            }
        });

        // Go butonuna basınca yapılacak isler
        /*
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }
}
