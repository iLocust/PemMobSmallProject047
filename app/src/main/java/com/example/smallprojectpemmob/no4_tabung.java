package com.example.smallprojecticha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class no4_tabung extends AppCompatActivity {
    EditText edtJariJari, edtTinggi;
    TextView txtHasil;
    Double jari, tinggi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no4_tabung);
        initial();
    }

    class Lingkaran {
        public double jari_jari;

        public Lingkaran(double r) {
            jari_jari = r;
        }

        public double hitung_luas() {
            return Math.PI * Math.pow(jari_jari, 2);
        }

        public double hitung_keliling() {
            return (Math.PI * (2 * jari_jari));
        }
    }

    class Tabung extends Lingkaran {
        double tinggi;

        public Tabung(double r, double t) {
            super(r);
            this.tinggi = t;
        }

        public double hitung_volume() {
            return super.hitung_luas() * tinggi;
        }

        public double hitung_luas() {
            return (2 * super.hitung_luas()) + super.hitung_keliling() * tinggi;
        }
    }

    private void initial() {
        edtJariJari = (EditText) findViewById(R.id.edt_jari_tabung);
        edtTinggi = (EditText) findViewById(R.id.edt_tinggi_tabung);
        txtHasil = (TextView) findViewById(R.id.txt_hasil_tabung);

        getSupportActionBar().setTitle("Tabung / Silinder");
    }

    public void hitung_luas(View view) {
        try {
            jari = Double.parseDouble(edtJariJari.getText().toString());
            tinggi = Double.parseDouble(edtTinggi.getText().toString());
            Tabung tabung = new Tabung(jari,tinggi);
            txtHasil.setText(String.valueOf("Hasil :\nLuas = " + tabung.hitung_luas()));


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
            jari = Double.parseDouble(edtJariJari.getText().toString());
            tinggi = Double.parseDouble(edtTinggi.getText().toString());
            Tabung tabung = new Tabung(jari,tinggi);
            txtHasil.setText(String.valueOf("Hasil :\nVolume = " + tabung.hitung_volume()));


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