package com.example.smallprojecticha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class no4_balok extends AppCompatActivity {
    EditText edtPanjang,edtLebar,edtTinggi;
    TextView txtHasil;
    Double panjang,lebar,tinggi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no4_balok);
        initial();
    }

    class PersegiPanjang {
        public double panjang;
        public double lebar;

        public PersegiPanjang(double pj, double lb) {
            panjang = pj;
            lebar = lb;

        }

        public double hitung_luas() {
            return panjang * lebar;
        }

        public double hitung_keliling() {
            return (2 * (panjang + lebar));
        }
    }

    class Balok extends PersegiPanjang {
        double tinggi;

        public Balok(double pj, double lb, double t) {
            super(pj, lb);
            tinggi = t;
        }

        public double hitung_luas() {
            return (2 * (super.hitung_luas() + super.panjang * tinggi + super.lebar * tinggi));
        }

        public double hitung_volume() {
            return (super.hitung_luas() * tinggi);
        }

        public double hitung_keliling() {
            return (4 * (super.panjang + super.lebar + tinggi));
        }
    }

    private void initial() {
        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        edtTinggi = (EditText) findViewById(R.id.edt_tinggi);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);

        getSupportActionBar().setTitle("Balok");
    }

    public void hitung_luas(View view) {
        try {
            panjang = Double.parseDouble(edtPanjang.getText().toString());
            lebar = Double.parseDouble(edtLebar.getText().toString());
            tinggi = Double.parseDouble(edtTinggi.getText().toString());
            Balok balok = new Balok(panjang, lebar,tinggi);
            txtHasil.setText(String.valueOf("Hasil :\nLuas = " + balok.hitung_luas()));


            //panjang = Double.parseDouble(edtPanjang.getText().toString());
            //lebar = Double.parseDouble(edtLebar.getText().toString());
            //luas = panjang * lebar;
            //txtLuas.setText(String.valueOf("Luas = " + luas));

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "Masukan Nomor", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }

    public void hitung_keliling(View view) {
        try {
            panjang = Double.parseDouble(edtPanjang.getText().toString());
            lebar = Double.parseDouble(edtLebar.getText().toString());
            tinggi = Double.parseDouble(edtTinggi.getText().toString());
            Balok balok = new Balok(panjang, lebar,tinggi);
            txtHasil.setText(String.valueOf("Hasil :\nKeliling = " + balok.hitung_keliling()));


            //panjang = Double.parseDouble(edtPanjang.getText().toString());
            //lebar = Double.parseDouble(edtLebar.getText().toString());
            //luas = panjang * lebar;
            //txtLuas.setText(String.valueOf("Luas = " + luas));

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }

    public void hitung_volume(View view) {
        try {
            panjang = Double.parseDouble(edtPanjang.getText().toString());
            lebar = Double.parseDouble(edtLebar.getText().toString());
            tinggi = Double.parseDouble(edtTinggi.getText().toString());
            Balok balok = new Balok(panjang, lebar,tinggi);
            txtHasil.setText(String.valueOf("Hasil :\nVolume = " + balok.hitung_volume()));


            //panjang = Double.parseDouble(edtPanjang.getText().toString());
            //lebar = Double.parseDouble(edtLebar.getText().toString());
            //luas = panjang * lebar;
            //txtLuas.setText(String.valueOf("Luas = " + luas));

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }
}