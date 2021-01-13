package com.example.smallprojecticha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class no4_bola extends AppCompatActivity {
    EditText edtJariJari;
    TextView txtHasil;
    Double jari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no4_bola);
        initial();
    }

    private void initial() {
        edtJariJari = (EditText) findViewById(R.id.edt_jari_bola);
        txtHasil = (TextView) findViewById(R.id.txt_hasil_bola);

        getSupportActionBar().setTitle("Bola");
    }

    public void hitung_luas(View view) {
        try {
            jari = Double.parseDouble(edtJariJari.getText().toString());
            Bola bola = new Bola(jari);
            txtHasil.setText(String.valueOf("Hasil :\nLuas = " + bola.hitung_luas()));


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
            Bola bola = new Bola(jari);
            txtHasil.setText(String.valueOf("Hasil :\nVolume = " + bola.hitung_volume()));


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

    class Bola extends Lingkaran {

        public Bola(double r) {
            super(r);
        }

        public double hitung_luas() {
            return (4 * super.hitung_luas());
        }

        public double hitung_volume() {
            return (4.0 / 3 * Math.PI * (jari_jari*jari_jari*jari_jari));
        }
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
}