package com.lks.kalkulator2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterSiswa extends BaseAdapter {

    ArrayList<ItemSiswa> data = new ArrayList<>();
    LayoutInflater layoutInflater;

    public AdapterSiswa(Context context, ArrayList<ItemSiswa> data) {
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public int getCount() {
        return this.data.size();
    }

    @Override
    public ItemSiswa getItem(int position) {
        return this.data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.data.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = this.layoutInflater.inflate(R.layout.item_siswa, parent, false);
        }

        TextView nomor = convertView.findViewById(R.id.nomor);
        TextView nama = convertView.findViewById(R.id.nama);

        ItemSiswa item = getItem(position);

        Log.d("ADAPTER", "getView: " + item.getNomor());
        Log.d("ADAPTER", "getView: " + item.getNama());

        nomor.setText(String.valueOf(item.getNomor()));
        nama.setText(item.getNama());

        return convertView;
    }
}
