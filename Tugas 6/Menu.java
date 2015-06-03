import java.util.Scanner;
public class Menu
{
	public static void main(String[] args)
	{
		for (int i=1;i<999;)
		{
		
		Scanner input = new Scanner (System.in);

		System.out.print("Masukkan Angka Pertama : ");
		int angka1 = input.nextInt();
		System.out.print("Masukkan Angka Kedua	 : ");
		int angka2 = input.nextInt();
		

		System.out.println("");
		System.out.println("Pilihan Operasi :");
		System.out.println("1. Jumlah");
		System.out.println("2. Pengurangan");
		System.out.println("3. Kali");
		System.out.println("4. Bagi");
		System.out.println("5. Exit");
		System.out.println("");

		System.out.print("Jenis operasi yang Anda Inginkan : ");
		int menu = input.nextInt();

		Menu:
			switch (menu)
			{
				case 1:
				System.out.println("Hasil Penjumlahan " +angka1+ " + " +angka2+ " = "+(angka1+angka2));
				break;
				

				case 2:
				System.out.println("Hasil Pengurangan " +angka1+ " - " +angka2+ " = "+(angka1-angka2));
				break;
				

				case 3:
				System.out.println("Hasil Perkalian " +angka1+ " * " +angka2+ " = "+(angka1*angka2));
				break;
				

				case 4:
				System.out.println("Hasil Pembagian " +angka1+ " / " +angka2+ " = "+(angka1/angka2));
				break;
				

				case 5:
				System.out.println("Selamat Tinggal ...");
					System.exit(0);
				break;

				default:
				System.out.println("Maaf, Tidak Ada Menu ...");
			
				break;
			}
		}
	}
}

				