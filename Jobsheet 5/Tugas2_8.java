import java.util.Scanner;
public class Tugas2_8{
	public static void main(String[] args) {
		String menu, menu2, pilih;
		double sisi, alas, tinggi, jari2, luas, volume;
		Scanner scan =new Scanner(System.in);

		System.out.println("Pilih Menu : 1.Hitung luas");
		System.out.println("             2.Hitung volume");
		menu=scan.nextLine();
		if (menu.equals("1")){
			System.out.println("Pilih : a.Persegi");
			System.out.println("      : b.Segitiga");
			menu2=scan.nextLine();

			if (menu2.equals("a")){
				System.out.println("Masukkan sisi ");
				sisi=scan.nextDouble();
				luas=sisi*sisi;
				System.out.println("Luas Persegi = "+luas);
			} else if(menu2.equals("b")){
				System.out.println("Masukkan Alas ");
				alas=scan.nextDouble();
				System.out.println("Masukkan Tinggi ");
				tinggi=scan.nextDouble();
				luas=(0.5*alas)*tinggi;
				System.out.println("Luas Segitiga = "+luas);
			} else {
				System.out.println("Pilihan yang dimasukkan salah");
			}
		}else if (menu.equals("2")){
			System.out.println("Pilih : a.Kubus");
			System.out.println("      : b.Tabung");
			pilih=scan.nextLine();

			if (pilih.equalsIgnoreCase("a")){
				System.out.println("Masukkan sisi ");
				sisi=scan.nextDouble();
				volume=sisi*sisi*sisi;
				System.out.println("Volume Kubus = "+volume);
			} else if(pilih.equals("b")) {
				System.out.println("Masukkan jari-jari ");
				jari2=scan.nextDouble();
				System.out.println("Masukkan Tinggi ");
				tinggi=scan.nextDouble();
				volume=(3.14) * jari2 * jari2 * tinggi;
				System.out.println("Volume Tabung = "+volume);
			} else {
				System.out.println("Pilihan yang dimasukkan salah");
			}
		}
	}
}