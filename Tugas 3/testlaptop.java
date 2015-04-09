class testLaptop {
	public static void main(String[] args) {
		laptop akbar = new laptop();

		System.out.println("warna=" +akbar.getwarna());
		System.out.println("merk=" +akbar.getmerk());
		System.out.println("wifi=" +akbar.getwifi());
		System.out.println("batrai=" +akbar.getbaterai());
		System.out.println(" ");



	laptop reza = new laptop("Acer","Ungu");

		System.out.println("warna=" +reza.getwarna());
		System.out.println("merk=" +reza.getmerk());

		System.out.println(" ");



	laptop dan = new laptop("Thosiba","merah","Koneksi");

		System.out.println("warna=" +dan.getwarna());
		System.out.println("merk=" +dan.getmerk());
		System.out.println("wifi=" +dan.getwifi());
		
		System.out.println("");



	laptop ardy = new laptop("Lenovo","Merah","Tak tersambung",70);

		System.out.println("warna=" +ardy.getwarna());
		System.out.println("merk=" +ardy.getmerk());
		System.out.println("wifi=" +ardy.getwifi());
		System.out.println("batrai=" +ardy.getbaterai());
		System.out.println(" ");
	}
}
	







