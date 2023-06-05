import java.util.Scanner;
public class Balok{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan panjang: ");
		int p = input.nextInt();
		System.out.print("Masukkan lebar: ");
		int l = input.nextInt();
		System.out.print("Masukkan tinggi: ");
		int t = input.nextInt();

		int luasPermukaan = 2 * ((p * l) + (p * t) + (l * t));
		System.out.println("Luas Permukaan Balok adalah: " + luasPermukaan);

		int volume = p * l * t;
		System.out.println("Volume Balok adalah: " + volume);
	}
}