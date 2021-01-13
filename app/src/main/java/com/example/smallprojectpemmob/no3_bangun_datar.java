package com.example.smallprojecticha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class no3_bangun_datar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no3_bangun_datar);
        getSupportActionBar().setTitle("Hitung Bangun Datar");
    }

    public void lingkaran(View view) {
        Intent intent = new Intent(no3_bangun_datar.this, no3_lingkaran.class);
        startActivity(intent);
    }

    public void segitiga(View view) {
        Intent intent = new Intent(no3_bangun_datar.this, no3_segitiga.class);
        startActivity(intent);
    }

    public void persegi(View view) {
        Intent intent = new Intent(no3_bangun_datar.this, no3_persegi.class);
        startActivity(intent);
    }
}