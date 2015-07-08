package Gingsoel;

import tugasbesar.*;

import java.util.ArrayList;

/**
 * Created by user on 7/5/2015.
 */
public class Liga {
    private String namaLiga;
    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();
    private Klub daftarKlub;

    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public Liga(Klub daftarKlub) {
        this.daftarKlub = daftarKlub;
    }

    public Klub getDaftarKlub() {
        return daftarKlub;
    }

    public void setDaftarKlub(Klub daftarKlub) {
        this.daftarKlub = daftarKlub;
    }

    public String getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        return daftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi)
    {
        this.daftarDivisi.add(divisi);
    }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                '}';
    }
}
