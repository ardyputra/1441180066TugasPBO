class Segitiga {
	double alas;
	double tinggi;

	public void cetakKeLayar(){
		System.out.println("Segitiga");
		System.out.println("Alas : "+alas);
		System.out.println("Tinggi : "+tinggi);
	}

	public void ubahProperty( double alasBaru, double tinggiBaru){
		alas = alasBaru;
		tinggi = tinggiBaru;
	}

	public double hitungLuas(){
		double luas;
		luas = 0.5*alas*tinggi;
		return luas;
	}

	public double hitungKeliling(){
		double keliling;
		double sisiMiring = Math.sqrt((alas*alas) + (tinggi*tinggi));
		keliling = alas+tinggi+sisiMiring;
		return keliling;
	}
}