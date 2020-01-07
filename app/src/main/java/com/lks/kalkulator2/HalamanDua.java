package com.lks.kalkulator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HalamanDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_dua);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        ItemSiswa siswaSatu = new ItemSiswa(1, "Satu");
//        ItemSiswa siswaDua = new ItemSiswa(2, "Dua");
//        ItemSiswa siswaTiga= new ItemSiswa(3, "Tiga");
//
//        ArrayList<ItemSiswa> data = new ArrayList<>();
//        data.add(siswaSatu);
//        data.add(siswaDua);
//        data.add(siswaTiga);
//
//        AdapterSiswa adapterSiswa = new AdapterSiswa(getApplicationContext(), data);
//
        ListView daftar = findViewById(R.id.daftar);
        daftar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        getResources().getStringArray(R.array.angka)[position],
                        Toast.LENGTH_LONG
                ).show();
            }
        });
//
//        daftar.setAdapter(adapterSiswa);
    }
}
