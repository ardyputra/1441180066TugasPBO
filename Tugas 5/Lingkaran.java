class Lingkaran {
	int radius ;
	double p;
	public void cetakKeLayar()
	{
		System.out.println("Lingkaran");
		System.out.println("Jari-jari ="+radius);
		System.out.println("P = "+p);
	}
	
	public void ubahProperty(int radiusBaru, double pBaru)
	{
		radius = radiusBaru;
		p = pBaru;
	}

	public double hitungLuas()
	{
		double luas;
		luas = p*radius*radius*Math.PI;
		return luas;
	}

	public double hitungKeliling()
	{
		double keliling;
		keliling = p*2*radius*Math.PI;
		return keliling;
	}
}