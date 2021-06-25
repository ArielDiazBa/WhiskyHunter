package com.example.apilicores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgW;
    private ImageView imgD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgW = findViewById(R.id.imgW);
        imgD = findViewById(R.id.imgD);
        imgW.setOnClickListener(this);
        imgD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgW){
            Intent intent = new Intent(this,whisky.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.imgD){
            Intent myIntent = new Intent(this,Destilerias.class);
            startActivity(myIntent);
        }

    }
}