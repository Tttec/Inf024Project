package com.example.inf024project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kaydol extends AppCompatActivity {
    private Button ad,soyad,email,sifre,kaydol_btn;
    TextView kaydol,politika;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Buton ve TextView ları tanımlıyor
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kaydol);

        ad=findViewById(R.id.Ad_btn);
        soyad=findViewById(R.id.Soyad_btn);
        email=findViewById(R.id.Email_btn);
        sifre=findViewById(R.id.Sifre_btn);
        kaydol_btn=findViewById(R.id.kaydol_btn);
        kaydol=findViewById(R.id.kaydol_tw);
        politika=findViewById(R.id.politika_tw);

    }
}
