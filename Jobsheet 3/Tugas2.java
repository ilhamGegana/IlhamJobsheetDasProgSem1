import java.util.Scanner;
public class Tugas2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float itemMerahSebelumDiskon, itemBiruSebelumDiskon, itemMerahDiskon, itemBiruDiskon, totalUangYangHarusDibayar;

		System.out.println("Masukkan harga item merah sebelum diskon(Masukkan harga seperti 300,000 atau 300000)");
		itemMerahSebelumDiskon = sc.nextFloat();
		System.out.println("Masukkan harga item biru sebelum diskon(Masukkan harga seperti 275,000 atau 275000)");
		itemBiruSebelumDiskon = sc.nextFloat();
		itemMerahDiskon = itemMerahSebelumDiskon * 1/2;
		itemBiruDiskon = itemBiruSebelumDiskon * 3/10;
		totalUangYangHarusDibayar = itemMerahDiskon+itemBiruDiskon;
		System.out.println("Total Harga Yang Harus dibayar Susi adalah Rp."+totalUangYangHarusDibayar);
	}
}