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

public class Register extends AppCompatActivity {
    private Button register_btn;
    TextView register;
    EditText name,surname,email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Buton ve TextView ları tanımlıyor
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        //edittextleri butonları ve textviewları tanıtmak
        name=findViewById(R.id.name_edit);
        surname=findViewById(R.id.surname_edit);
        email=findViewById(R.id.email_edit);
        pass=findViewById(R.id.pass_edit);
        register_btn=findViewById(R.id.register_btn);
        register=findViewById(R.id.register_tw);


        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {              //ALERT'A STRİNGS.XML'DEN BAĞLANTI YAPAMADIM ONA TEKRAR BAKILMASI GEREKİYOR
                AlertDialog.Builder alert = new AlertDialog.Builder(Register.this);
                alert.setTitle("Kayıt İşlemi");                                     //@string/recording
                alert.setMessage("Kaydınız başarıyla tamamlanmıştır.");             //@string/successful_login
                alert.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {          //@string/okey
                        Intent intent=new Intent(Register.this, BuyOrGo.class);
                        startActivity(intent);

                    }
                });
                alert.show();
                final String name_str,surname_str,email_str,pass_str; //edittextteki degerleri stringlere atamak
                name_str=name.getText().toString();
                surname_str=surname.getText().toString();
                email_str=email.getText().toString();
                pass_str=pass.getText().toString();
                name.setText(null);                                  //Butona basıldıgında Edittextler eski haline dönmesi icin
                surname.setText(null);
                email.setText(null);
                pass.setText(null);
            }
        });










    }
}
