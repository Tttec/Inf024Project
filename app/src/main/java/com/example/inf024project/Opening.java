package com.example.inf024project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Opening extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        linearLayout =(LinearLayout) findViewById(R.id.giris);
        linearLayout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        openLoginOptions();             //ekranın herhangi bir yerine tıklandığında bir sonraki sayfaya geçiyor.
    }

    public void openLoginOptions(){
        Intent intent = new Intent(this, LoginOptions.class);
        startActivity(intent);

    }

}

