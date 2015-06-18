package com.ardy;

/**
 * Created by User on 17/06/2015.
 */
public class TestClass {


    public static void main(String[] args) {
        //buat objek rekening

        Rekening rek= new Rekening (20000000.0);
        Nasabah nas = new Nasabah("Ardy",rek);
        System.out.println(nas.toString());

        //tarik saldo sebesar 10 juta

        rek.tarik(10000000.0);
        System.out.println("Mengambil uang sebesar Rp. 10.000.000");

        //menampilkan saldo sekarang
        System.out.println("Sisa saldo Anda Sebesar =" + rek.getSaldo());

        //setor saldo sebesar 5 juta
        rek.setor(5000000.0);
        System.out.println("Anda Setor uang Sebesar Rp. 5.000.000");

        //tampilkan saldo sekarang
        System.out.printf("Saldo Anda Sebesar =" + rek.getSaldo());

    }
}

