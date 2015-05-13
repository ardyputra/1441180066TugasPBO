class Mobil extends Kendaraan {
	
	private int KecepatanMaks;
	private int JumlahRoda;

	Kendaraan mob = new Kendaraan();

	public Mobil (int KecepatanMaksinput, int Beratinput, int Kapasitasinput , int JumlahRodainput)
	{
		KecepatanMaks = KecepatanMaksinput;
		Berat		  = Beratinput;
		Kapasitas 	  = Kapasitasinput;
		JumlahRoda 	  = JumlahRodainput;
	}
	public void CetakSpesifikasi()
{
	System.out.println("Kecepatan Maks Kendaraan :" +mob.getKecepatanMaks());
	System.out.println("Kecepatan Maks Mobil : "+ KecepatanMaks);
	System.out.println("Berat Mobil : "+ Berat);
	System.out.println("Kapasitas Mobil : "+Kapasitas);
	System.out.println("Jumlah Roda Mobil : " + JumlahRoda);
}
	public void Jalankan(int Kecepatan)
	{
		System.out.println("Mobil dijalankan dengan Kecepatan :"+Kecepatan);
	}
}

