class testTabungan {
	public static void main(String[] args) {
		Tabungan ardy = new Tabungan();

		System.out.println("simpanan=" +ardy.setsimpanan());
		System.out.println("pemilikRek=" +ardy.setpemilikRek());
		System.out.println("noRek=" +ardy.getnoRek());
		System.out.println("bunga=" +ardy.getbunga());
		ardy.menabung();
		System.out.println(" ");



	Tabungan reza = new Tabungan("BCA","reza");

		System.out.println("simpanan=" +reza.setsimpanan());
		System.out.println("pemilikRek=" +reza.setpemilikRek());
		reza.mengambil();
		System.out.println(" ");



	Tabungan dan = new Tabungan("BRI","dan",1441180076);

		System.out.println("simpanan=" +dan.setsimpanan());
		System.out.println("pemilikRek=" +dan.setpemilikRek());
		System.out.println("noRek=" +dan.getnoRek());
		dan.transfer();
		System.out.println("");



	Tabungan muha = new Tabungan("Mandiri","muha",1441180088,70);

		System.out.println("simpanan=" +muha.setsimpanan());
		System.out.println("pemilikRek=" +muha.setpemilikRek());
		System.out.println("noRek=" +muha.getnoRek());
		System.out.println("bunga=" +muha.getbunga());
		muha.menerimaTransfer();
		System.out.println(" ");
	}
}
	







