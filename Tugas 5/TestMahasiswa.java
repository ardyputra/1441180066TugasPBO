public class TestMahasiswa{
	public static void main(String[] args) {
		mahasiswa mhs = new mahasiswa("Ardy Indracahya", 18);
		mhs.tampilkanBiodata();
		
		System.out.println("");

		mhs.setUmur(25);
		mhs.tampilkanBiodata();
	}
}