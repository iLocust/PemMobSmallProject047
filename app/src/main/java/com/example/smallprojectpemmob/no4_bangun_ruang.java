package com.example.smallprojecticha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class no4_bangun_ruang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no4_bangun_ruang);
        getSupportActionBar().setTitle("Hitung Bangun Ruang");
    }

    public void bola(View view) {
        Intent intent = new Intent(no4_bangun_ruang.this, no4_bola.class);
        startActivity(intent);
    }

    public void balok(View view) {
        Intent intent = new Intent(no4_bangun_ruang.this,no4_balok.class);
        startActivity(intent);
    }

    public void tabung(View view) {
        Intent intent = new Intent(no4_bangun_ruang.this, no4_tabung.class);
        startActivity(intent);
    }
    }