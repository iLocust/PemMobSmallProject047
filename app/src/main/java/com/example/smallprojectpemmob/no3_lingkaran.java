package com.example.smallprojecticha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class no3_lingkaran extends AppCompatActivity {
    private EditText rtxt;
    private EditText hasil;
    private Button luas;
    private Button keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no3_lingkaran);
        getSupportActionBar().setTitle("Lingkaran");
        rtxt = (EditText) findViewById(R.id.rtxt);
        hasil = (EditText) findViewById(R.id.hasil);
        luas = (Button) findViewById(R.id.luas);
        keliling = (Button) findViewById(R.id.keliling);
    }

    public void luas1(View view) {
        try {

            int r = Integer.parseInt(rtxt.getText().toString());
            double phi = 22/7;
            double luas =  phi * r * r;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void keliling1(View view) {
        try {

            int r = Integer.parseInt(rtxt.getText().toString());
            double phi = 22/7;
            double keliling =  phi * 2 * r;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void kembali1(View view){
        finish();
    }
}