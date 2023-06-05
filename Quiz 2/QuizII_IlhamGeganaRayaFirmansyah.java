//8_IlhamGeganaRayaFirmansyah//
//MI1A//
import java.util.Scanner;
public class QuizII_IlhamGeganaRayaFirmansyah {
	public static void main(String[] args) {
		String hari;
		double uang, total, diskonBayar, totalBelanja, sisa;
		double[] diskon = {0.075, 0.07, 0.105, 0.1, 0.09, 0.095, 0.125};
		Scanner sc = new Scanner(System.in);

		System.out.print("Uang yang anda miliki\t\t: ");
		uang = sc.nextDouble();
		System.out.print("Total pembelanjaan\t\t: ");
		total = sc.nextDouble();
		System.out.print("Masukkan hari\t\t\t: ");
		hari = sc.next();
		System.out.println("Vendor Dompet Digital yang digunakan: GoPay");

		System.out.println("--------------------------------------------");

		for (int i = 0; i < diskon.length; i++){
			if (hari.equalsIgnoreCase("Senin")) {
				System.out.println("Jenis promo yang anda dapatkan\t: Diskon 7,5%");
				diskonBayar = total * diskon[0];
				totalBelanja = total - diskonBayar;
				System.out.println("Uang yang harus dibayarkan\t: "+ totalBelanja);
				sisa = uang - totalBelanja;
				System.out.println("Sisa uang yang anda miliki\t: "+ sisa);
				break;
			} else if (hari.equalsIgnoreCase("Selasa")) {
				System.out.println("Jenis promo yang anda dapatkan\t: Diskon 7%");
				diskonBayar = total * diskon[1];
				totalBelanja = total - diskonBayar;
				System.out.println("Uang yang harus dibayarkan\t: "+ totalBelanja);
				sisa = uang - totalBelanja;
				System.out.println("Sisa uang yang anda miliki\t: "+ sisa);
				break;
			} else if (hari.equalsIgnoreCase("Rabu")) {
				System.out.println("Jenis promo yang anda dapatkan\t: Diskon 10,5%");
				diskonBayar = total * diskon[2];
				totalBelanja = total - diskonBayar;
				System.out.println("Uang yang harus dibayarkan\t: "+ totalBelanja);
				sisa = uang - totalBelanja;
				System.out.println("Sisa uang yang anda miliki\t: "+ sisa);
				break;
			} else if (hari.equalsIgnoreCase("Kamis")) {
				System.out.println("Jenis promo yang anda dapatkan\t: Diskon 10%");
				diskonBayar = total * diskon[3];
				totalBelanja = total - diskonBayar;
				System.out.println("Uang yang harus dibayarkan\t: "+ totalBelanja);
				sisa = uang - totalBelanja;
				System.out.println("Sisa uang yang anda miliki\t: "+ sisa);
				break;
			} else if (hari.equalsIgnoreCase("Jum'at")) {
				System.out.println("Jenis promo yang anda dapatkan\t: Diskon 9%");
				diskonBayar = total * diskon[4];
				totalBelanja = total - diskonBayar;
				System.out.println("Uang yang harus dibayarkan\t: "+ totalBelanja);
				sisa = uang - totalBelanja;
				System.out.println("Sisa uang yang anda miliki\t: "+ sisa);
				break;
			} else if (hari.equalsIgnoreCase("Sabtu")) {
				System.out.println("Jenis promo yang anda dapatkan\t: Diskon 9,5%");
				diskonBayar = total * diskon[5];
				totalBelanja = total - diskonBayar;
				System.out.println("Uang yang harus dibayarkan\t: "+ totalBelanja);
				sisa = uang - totalBelanja;
				System.out.println("Sisa uang yang anda miliki\t: "+ sisa);
				break;
			} else if (hari.equalsIgnoreCase("Minggu")) {
				System.out.println("Jenis promo yang anda dapatkan\t: Diskon 12,5%");
				diskonBayar = total * diskon[6];
				totalBelanja = total - diskonBayar;
				System.out.println("Uang yang harus dibayarkan\t: "+ totalBelanja);
				sisa = uang - totalBelanja;
				System.out.println("Sisa uang yang anda miliki\t: "+ sisa);
				break;
			} else {
				System.out.println("Hari yang dimasukkan tidak sesuai");
			}
		}	
	}
}