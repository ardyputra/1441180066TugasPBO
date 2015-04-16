class testMobil {
	public static void main(String[] args) {
		mobil ardy = new mobil();

		System.out.println("merk		=" +ardy.getmerk());
		System.out.println("platNomor	=" +ardy.getplatNomor());
		System.out.println("warna 		=" +ardy.getwarna());
		System.out.println("mesin		=" +ardy.getmesin() +"cc");
		System.out.println("kecepatan	=" +ardy.getkecepatan() +"km");
		ardy.maju();
		System.out.println(" ");	

	 mobil akbar = new mobil("Bugati","N4412DY");

		System.out.println("merk		=" +akbar.getmerk());
		System.out.println("platNomor	=" +akbar.getplatNomor());
		akbar.mundur();
		System.out.println(" ");


	mobil melinda = new mobil("Subaru","M33L","Merah");

		System.out.println("merk		=" +melinda.getmerk());
		System.out.println("platNomor 	=" +melinda.getplatNomor());
		System.out.println("warna  		=" +melinda.getwarna());
		melinda.berhenti();
		System.out.println(" ");


	mobil adam = new mobil("Kia","A44AM","Hitam",1800);

		System.out.println("merk		=" +adam.getmerk());
		System.out.println("platNomor 	=" +adam.getplatNomor());
		System.out.println("warna  		=" +adam.getwarna());
		System.out.println("mesin   	=" +adam.getmesin() +"cc");
		adam.belok();
		System.out.println(" ");

	mobil dan = new mobil("Viper","D4N","Biru",2200,135);

		System.out.println("merk		=" +dan.getmerk());
		System.out.println("platNomor 	=" +dan.getplatNomor());
		System.out.println("warna  		=" +dan.getwarna());
		System.out.println("mesin   	=" +dan.getmesin() +"cc");
		System.out.println("kecepatan	=" +dan.getkecepatan() +"km"); 
		dan.ngebut();
		System.out.println(" ");
	

	
}
}