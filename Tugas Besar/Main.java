package Gingsoel;

/**
 * Created by user on 7/5/2015.
 */
public class Main {
    public static void main(String[] args) {
        // write your code here
        Liga english = new Liga("English");

        Divisi premierA = new Divisi("Premier A",english);
        Divisi premierB = new Divisi("Primier B",english);

        Klub arsenal = new Klub("Arsenal",premierA,english);
        Klub chelsea = new Klub("Chelsea",premierA,english);

        Klub wigan = new Klub("Wigan",premierB,english);
        Klub qpr = new Klub("Queens Park Ranger",premierB,english);

        english.setDaftarDivisi(premierA);
        english.setDaftarDivisi(premierB);

        premierA.setDaftarKlub(arsenal);
        premierA.setDaftarKlub(chelsea);

        premierB.setDaftarKlub(wigan);
        premierB.setDaftarKlub(qpr);

        //1 get daftar divisi by nama liga
        System.out.println(english.getDaftarDivisi());
        System.out.println("");

        //2 get daftar klub by nama liga
        english.setDaftarKlub(arsenal);
        System.out.println(english.getDaftarKlub());
        System.out.println("");

        //3 get daftar klub by nama divisi
        System.out.println(premierA.getDaftarKlub());
        System.out.println("");

        //4 get klub ini berada di divisi mana by nama klub
        arsenal.setNamaKlub("Arsenal");
        arsenal.setDivisi(premierA);
        System.out.println(arsenal.getNamaKlub());
        System.out.println(arsenal.getDivisi());
        System.out.println("");

        //5 get klub ini berada di liga apa by nama klub
        chelsea.getNamaKlub();
        System.out.println(chelsea.getNamaKlub());
        System.out.println(chelsea.getLiga());



    }
}
