package com.example.smallprojecticha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class no2_nilai_akhir extends AppCompatActivity {
    EditText xUTS, xUAS, xNA, xNH;
    int nuts, nuas;
    String xnh;
    double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no2_nilai_akhir);
        getSupportActionBar().setTitle("Hitung Nilai Akhir");
    }

    public void myClickHandler(View view){
        switch(view.getId()) {
            case R.id.btnproses:
                xUTS = (EditText)findViewById(R.id.euts);
                xUAS = (EditText)findViewById(R.id.euas);
                xNA = (EditText)findViewById(R.id.enilaiangka);
                xNH = (EditText)findViewById(R.id.epredikathuruf);
                nuts = Integer.parseInt(xUTS.getText().toString());
                nuas = Integer.parseInt(xUAS.getText().toString());
                hasil = 0.4 * nuts + 0.6 * nuas ;
                xNA.setText(hasil+"");
                if(hasil>= 80 && hasil <=100) xnh = "A";
                else if(hasil>= 70 && hasil <=79) xnh = "B";
                else if(hasil>= 60 && hasil <=69) xnh = "C";
                else if(hasil>= 50 && hasil <=59) xnh = "D";
                else if(hasil>= 0 && hasil <=49) xnh = "E";
                xNH.setText(xnh);
                break;

            case R.id.btnhapus:
                xUTS.setText("");
                xUAS.setText("");
                xNA.setText("");
                xNH.setText("");
                break;
        }
    }
}