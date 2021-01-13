package com.example.smallprojecticha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah_hal1(View view) {
        Intent intent = new Intent(MainActivity.this, no1_berat_badan.class);
        startActivity(intent);
    }

    public void pindah_hal5(View view) {
        Intent intent = new Intent(MainActivity.this,no5_konversi.class);
        startActivity(intent);
    }

    public void pindah_hal2(View view) {
        Intent intent = new Intent(MainActivity.this, no2_nilai_akhir.class);
        startActivity(intent);
    }

    public void pindah_hal3(View view) {
        Intent intent = new Intent(MainActivity.this, no3_bangun_datar.class);
        startActivity(intent);
    }

    public void pindah_hal4(View view) {
        Intent intent = new Intent(MainActivity.this,no4_bangun_ruang.class);
        startActivity(intent);
    }
}