package com.example.inf024project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GirisSecenek extends AppCompatActivity implements View.OnClickListener {

    private Button kayit, facebook, google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris_secenek);

        facebook = (Button) findViewById(R.id.facebook);
        google = (Button) findViewById(R.id.google);
        kayit = (Button) findViewById(R.id.kayit);
        kayit.setOnClickListener(this);
        facebook.setOnClickListener(this);
        google.setOnClickListener(this);
    }


    public void onClick(View v){

        switch (v.getId()){
            case (R.id.kayit):
                //openKayit();
                break;
            case(R.id.facebook): // facebook ile bağlan butonuna tıklama
                break;
            case(R.id.google): // google ile bağlan butonuna tıklama
                break;



        }
        //Kayıt ol butonuna basıldıgı zaman kayıt ol sayfasını acar
        kayit.setOnClickListener(new View.OnClickListener() { // Kayıt ol butonuna basıldıgında Kaydol Sayfasına gider
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GirisSecenek.this,Kaydol.class);
                startActivity(intent);
            }
        });


    }
}
