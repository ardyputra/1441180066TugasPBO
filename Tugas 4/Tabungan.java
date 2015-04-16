class Tabungan {

	 String simpanan;
	 String pemilikRek;
	 int noRek;
	 int bunga;

	 public Tabungan(){

	  simpanan		= "BNI";
	  pemilikRek	= "Ardy";
	  noRek 		= 1441180066;
	  bunga			= 50;
	  	
	 }
	 public Tabungan(String simpananInput, String pemilikRekInput){
	 	simpanan 	= simpananInput;
	 	pemilikRek 	= pemilikRekInput;

	 } 
	 public Tabungan(String simpananInput, String pemilikRekInput, int noRekInput){
	 	simpanan	=simpananInput;
	 	pemilikRek  =pemilikRekInput;
	 	noRek 		=noRekInput;
	 	
	 } 
	 public Tabungan(String simpananInput, String pemilikRekInput, int noRekInput, int bungaInput){
		simpanan	=simpananInput;
	 	pemilikRek 	=pemilikRekInput;
	 	noRek 		=noRekInput;
	 	bunga 		=bungaInput;

	 }


	public void menabung(){

		System.out.println("anda menabung");
	}
	public void mengambil(){

		System.out.println("anda mengambil uang");
	}
	public void transfer(){

		System.out.println("anda mengambil uang");
	}
	public void menerimaTransfer()	{
		System.out.println("anda mendapat transfer");			
	}
	public void cekSaldo()	{
		System.out.println("saldo anda :");			
	}

	public String setsimpanan(){
		return simpanan;
	}
	public String setpemilikRek(){
		return pemilikRek;
	}
	public int getnoRek(){
		return noRek;
	}
	public int getbunga(){
		return bunga;
	}
	
}