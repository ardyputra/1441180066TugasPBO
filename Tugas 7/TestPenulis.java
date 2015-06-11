package com.ardy;

/**
 * Created by Lenovo on 6/11/2015.
 */
public class TestPenulis {
    public static void main(String[] args) {

        Penulis Raditya = new Penulis("Jalan JKT",'L',"radit","Kawin",99);
        Penulis rezha = new Penulis("Jalan Madura",'L',"rezha","Perjaka",18);

        Buku kambingJantan = new Buku("Aku Nangis",46000.0,"Sinar Dunia",Raditya);
        System.out.println(kambingJantan.toString());
    }

}
