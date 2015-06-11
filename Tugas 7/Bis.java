package com.ardy;

/**
 * Created by Lenovo on 6/11/2015.
 */
public class Bis {
    public static void main(String[] args) {
        // write your code here
    }
    private String merkBis;
    private String jenisBis;
    private int tahunBis;
    private String grupBis;
    private Kernet data;

    public Bis(String merkBis, String jenisBis, int tahunBis, String grupBis) {
        this.merkBis = merkBis;
        this.jenisBis = jenisBis;
        this.tahunBis = tahunBis;
        this.grupBis = grupBis;
    }

    public Bis(String merkBis, String jenisBis, int tahunBis, String grupBis, Kernet data) {
        this.merkBis = merkBis;
        this.jenisBis = jenisBis;
        this.tahunBis = tahunBis;
        this.grupBis = grupBis;
        this.data = data;
    }

    public String getMerkBis() {
        return merkBis;
    }

    public void setMerkBis(String merkBis) {
        this.merkBis = merkBis;
    }

    public String getJenisBis() {
        return jenisBis;
    }

    public void setJenisBis(String jenisBis) {
        this.jenisBis = jenisBis;
    }

    public int getTahunBis() {
        return tahunBis;
    }

    public void setTahunBis(int tahunBis) {
        this.tahunBis = tahunBis;
    }

    public String getGrupBis() {
        return grupBis;
    }

    public void setGrupBis(String grupBis) {
        this.grupBis = grupBis;
    }

    public Kernet getData() {
        return data;
    }

    public void setData(Kernet data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Bis{" +
                "merkBis='" + merkBis + '\'' +
                ", jenisBis='" + jenisBis + '\'' +
                ", tahunBis=" + tahunBis +
                ", grupBis='" + grupBis + '\'' +
                ", data=" + data +
                '}';
    }
}
