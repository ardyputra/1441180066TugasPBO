package com.ardy;

/**
 * Created by User on 17/06/2015.
 */
public class Rekening {
    private Double saldo;
    private double hasil;


    public Rekening(Double saldo) {
        this.saldo = saldo;
    }

    public void tarik(double tarik){
        this.saldo = saldo - tarik;
    }
    public void setor(double setor){
        this.saldo = saldo + setor;
    }
    public Double getSaldo() {

        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Rekening{" +
                "saldo=" + saldo +
                '}';
    }
}
