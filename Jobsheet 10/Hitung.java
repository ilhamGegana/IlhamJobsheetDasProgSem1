import java.util.Scanner;
public class Hitung {
	static int kali(int angka1, int angka2) {
		int hasil = (angka1 + 10) % (angka2 + 19);
		return hasil;
	}

	static int kurang(int angka1, int angka2){
	angka1 = angka1 + 7;
	angka2 = angka2 + 4;
	int hasil = kali (angka1, angka2);
	return hasil;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Masukkan nilai 1: ");
		int angka1 = input.nextInt();
		System.out.print("Masukkan nilai 2: ");
		int angka2 = input.nextInt();
		int hasil = kurang(angka1, angka2);
		System.out.println("Hasil akhir adalah " + hasil);
	}
}