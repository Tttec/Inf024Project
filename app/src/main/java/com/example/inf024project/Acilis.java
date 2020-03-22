package com.example.inf024project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Acilis extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris);
        linearLayout =(LinearLayout) findViewById(R.id.giris);
        linearLayout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        openGirisSecenek();             //ekranın herhangi bir yerine tıklandığında bir sonraki sayfaya geçiyor.
    }

    public void openGirisSecenek(){
        Intent intent = new Intent(this, GirisSecenek.class);
        startActivity(intent);

    }

}

