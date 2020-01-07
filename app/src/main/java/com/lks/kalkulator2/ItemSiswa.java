package com.lks.kalkulator2;

public class ItemSiswa {
    int nomor;
    String nama;

    public ItemSiswa() {
    }

    public ItemSiswa(int nomor, String nama) {
        this.nomor = nomor;
        this.nama = nama;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
