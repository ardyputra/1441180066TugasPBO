public class TestBangun
{
	public static void main(String[] args) {
		Lingkaran circle = new Lingkaran();
		circle.radius = 7;
		circle.p=3.14;
		circle.cetakKeLayar();
		
		System.out.println("Luas = " + circle.hitungLuas());
		System.out.println("Keliling = " + circle.hitungKeliling());

		circle.ubahProperty(14,7);

		System.out.println("Property baru = ");

		circle.cetakKeLayar();

		System.out.println("Luas baru = " + circle.hitungLuas());
		System.out.println("Kelilig baru = " + circle.hitungKeliling());

		Segitiga segi = new Segitiga();

		segi.alas= 4;
		segi.tinggi=2;

		segi.cetakKeLayar();

		System.out.println("Luas = " + segi.hitungLuas());
		System.out.println("Keliling = " + segi.hitungKeliling());

		segi.ubahProperty(9,17);

		System.out.println("property baru = ");

		segi.cetakKeLayar();

		System.out.println("Luas baru = " + segi.hitungLuas());
		System.out.println("Keliling baru = " + segi.hitungKeliling());

	}
}