package Gingsoel;

import java.util.ArrayList;

/**
 * Created by user on 7/5/2015.
 */
public class Divisi {
    private String namaDivisi;
    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();
    private Liga namaLiga;

    public Divisi(String namaDivisi, Liga namaLiga) {
        this.namaDivisi = namaDivisi;
        this.namaLiga = namaLiga;
    }

    public Liga getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(Liga namaLiga) {
        this.namaLiga = namaLiga;
    }

    public String getNamaDivisi() {

        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {

        this.namaDivisi = namaDivisi;
    }

    public ArrayList<Klub> getDaftarKlub() {
        return daftarKlub;
    }

    public void setDaftarKlub(Klub klub) {
        this.daftarKlub.add(klub);
    }

    @Override
    public String toString() {
        return "Divisi{" +
                "namaDivisi='" + namaDivisi + '\'' +
                '}';
    }
}
