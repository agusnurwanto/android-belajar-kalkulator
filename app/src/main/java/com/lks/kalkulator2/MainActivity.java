package com.lks.kalkulator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hasil;
    EditText nilai1;
    EditText nilai2;
    Button tambah;
    Button kurang;
    Button kali;
    Button bagi;

    Button halaman2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasil = findViewById(R.id.hasil);
        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);

        halaman2 = findViewById(R.id.halaman2);
        halaman2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HalamanDua.class));
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ambil nilai input
                int n1 = Integer.parseInt(nilai1.getText().toString());
                int n2 = Integer.parseInt(nilai2.getText().toString());

                //hitung
                int h = n1 + n2;

                //tampilkan hasilnya
                hasil.setText(String.valueOf(h));
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(nilai1.getText().toString());
                int n2 = Integer.parseInt(nilai2.getText().toString());

                //hitung
                int h = n1 - n2;

                //tampilkan hasilnya
                hasil.setText(String.valueOf(h));
            }
        });
    }
}
