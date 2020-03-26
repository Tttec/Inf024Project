package com.example.inf024project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kaydol extends AppCompatActivity {
    private Button kaydol_btn;
    TextView kaydol,politika;
    EditText ad,soyad,email,sifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Buton ve TextView ları tanımlıyor
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kaydol);

        //edittextleri butonları ve textviewları tanıtmak
        ad=findViewById(R.id.Ad_et);
        soyad=findViewById(R.id.Soyad_et);
        email=findViewById(R.id.Email_et);
        sifre=findViewById(R.id.Sifre_et);
        kaydol_btn=findViewById(R.id.kaydol_btn);
        kaydol=findViewById(R.id.kaydol_tw);
        politika=findViewById(R.id.politika_tw);


        kaydol_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(Kaydol.this);
                alert.setTitle("Kayıt İşlemi");
                alert.setMessage("Kaydınız başarıyla tamamlanmıştır.");
                alert.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent=new Intent(Kaydol.this,KullaniciGirisi.class);
                        startActivity(intent);

                    }
                });
                alert.show();
                final String ad_str,soyad_str,email_str,sifre_str; //edittextteki degerleri stringlere atamak
                ad_str=ad.getText().toString();
                soyad_str=soyad.getText().toString();
                email_str=email.getText().toString();
                sifre_str=sifre.getText().toString();
                ad.setText(null);                                  //Butona basıldıgında Edittextler eski haline dönmesi icin
                soyad.setText(null);
                email.setText(null);
                sifre.setText(null);
            }
        });










    }
}
