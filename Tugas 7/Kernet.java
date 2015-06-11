package com.ardy;

/**
 * Created by Lenovo on 6/11/2015.
 */
public class Kernet {
    private String namaKernet;
    private int umurKernet;
    private char jenisKelamin;
    private String alamatKernet;
    private int tahunKernet;

    public Kernet(String namaKernet, int umurKernet, char jenisKelamin, String alamatKernet) {
        this.namaKernet = namaKernet;
        this.umurKernet = umurKernet;
        this.jenisKelamin = jenisKelamin;
        this.alamatKernet = alamatKernet;
    }

    public Kernet(String namaKernet, int umurKernet, char jenisKelamin, String alamatKernet, int tahunKernet) {
        this.namaKernet = namaKernet;
        this.umurKernet = umurKernet;
        this.jenisKelamin = jenisKelamin;
        this.alamatKernet = alamatKernet;
        this.tahunKernet = tahunKernet;
    }

    public String getNamaKernet() {
        return namaKernet;
    }

    public void setNamaKernet(String namaKernet) {
        this.namaKernet = namaKernet;
    }

    public int getUmurKernet() {
        return umurKernet;
    }

    public void setUmurKernet(int umurKernet) {
        this.umurKernet = umurKernet;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamatKernet() {
        return alamatKernet;
    }

    public void setAlamatKernet(String alamatKernet) {
        this.alamatKernet = alamatKernet;
    }

    public int getTahunKernet() {
        return tahunKernet;
    }

    public void setTahunKernet(int tahunKernet) {
        this.tahunKernet = tahunKernet;
    }

    @Override
    public String toString() {
        return "Kernet{" +
                "namaKernet='" + namaKernet + '\'' +
                ", umurKernet=" + umurKernet +
                ", jenisKelamin=" + jenisKelamin +
                ", alamatKernet='" + alamatKernet + '\'' +
                ", tahunKernet=" + tahunKernet +
                '}';
    }
}
