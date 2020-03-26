package com.example.inf024project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KullaniciGirisi extends AppCompatActivity implements View.OnClickListener {

    private Button giris_yap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kullanici_girisi);

        giris_yap = (Button) findViewById(R.id.giris_yap);

        EditText giris_email = (EditText) findViewById(R.id.giris_email);

        EditText giris_sifre = (EditText) findViewById(R.id.giris_sifre);

        giris_yap.setOnClickListener(this);

        }


    @Override
    public void onClick(View v) {
        giris_yap.setOnClickListener(new View.OnClickListener() { // Kayıt ol butonuna basıldıgında Kaydol Sayfasına gider
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KullaniciGirisi.this,Secenekler.class);
                startActivity(intent);
            }
        });

    }
}


