package com.example.inf024project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Secenekler extends AppCompatActivity {
    Button buy,go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secenekler);

        buy=findViewById(R.id.buy_btn);
        go=findViewById(R.id.go_btn);

        // Buy butonuna basılınca yapılacak işler
        /*
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

        // Go butonuna basınca yapılacak isler
        /*
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }
}