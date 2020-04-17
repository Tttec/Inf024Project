package com.example.inf024project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuyOrGo extends AppCompatActivity implements View.OnClickListener{
    public Button buy,go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_or_go);

        buy = findViewById(R.id.buy_btn);
        go = findViewById(R.id.go_btn);
        buy.setOnClickListener(this);
        go.setOnClickListener(this);
        System.out.println("Hakan tarafından branch olusturuldu");
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.buy_btn:
                clickBuy_btn();
            case R.id.go_btn:
        }
    }

        // Buy butonuna basılınca yapılacak işler
        /*
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BuyOrGo.this, HomePageOfBuyApp.class);
                startActivity(intent);
            }
        });*/

        // Go butonuna basınca yapılacak isler
        /*
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/


    public void clickBuy_btn(){
        Intent intent = new Intent(this,HomePageOfBuyApp.class);
        startActivity(intent);
    }
}
