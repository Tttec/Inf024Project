package com.example.inf024project;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class KullaniciGirisi extends AppCompatActivity {

    private Button girisYap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kullanici_girisi);
        System.out.println("burada");
        girisYap = (Button) findViewById(R.id.giris_yap_giris_secenekler);
        EditText loginEmail = (EditText) findViewById(R.id.giris_email);
        EditText loginSifre = (EditText) findViewById(R.id.giris_sifre);

        //giris_yap.setOnClickListener(this);

        }




    }



