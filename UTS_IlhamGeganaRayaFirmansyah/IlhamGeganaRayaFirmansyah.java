//8_Ilham Gegana Raya Firmansyah//
//MI//
import java.util.Scanner;
public class IlhamGeganaRayaFirmansyah{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sisiA, sisiAlas, sisiB;

		System.out.println("Masukkan Sisi A");
		sisiA = scan.nextInt();
		System.out.println("Masukkan Sisi B");
		sisiB= scan.nextInt();
		System.out.println("Masukkan Sisi Alas");
		sisiAlas = scan.nextInt();

		if(sisiA==sisiAlas && sisiA==sisiB && sisiB==sisiAlas){
			System.out.printf("Segitiga dengan Panjang Sisi A : %d, Sisi B : %d, Sisi Alas : %d adalah SEGITIGA SAMA SISI", sisiA, sisiB, sisiAlas);
		}else if(sisiA==sisiB && sisiA!=sisiAlas && sisiB!=sisiAlas){
			System.out.printf("Segitiga dengan Panjang Sisi A : %d, Sisi B : %d, Sisi Alas : %d adalah SEGITIGA SAMA KAKI", sisiA, sisiB, sisiAlas);		
		}else if(sisiA!=sisiB && sisiA!=sisiAlas && sisiB!=sisiAlas){
			System.out.printf("Segitiga dengan Panjang Sisi A : %d, Sisi B : %d, Sisi Alas : %d adalah SEGITIGA SEMBARANG", sisiA, sisiB, sisiAlas);
		}
	}
}