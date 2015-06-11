package com.ardy;

/**
 * Created by Lenovo on 6/11/2015.
 */
public class TestClass {
    public static void main(String[] args) {
        Kernet Supri = new Kernet ("Supri sapii",19,'L',"Jalan Perlimaan",7);

        Bis pertama = new Bis("Scania","Patas",2010,"Harapan jaya",Supri);
        System.out.println(pertama.toString());
    }

}

