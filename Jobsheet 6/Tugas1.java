import java.util.Scanner;
public class Tugas1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int batas;

		System.out.print("Masukkan batas angka: ");
		batas = scan.nextInt();

		for(int i=1; i<=batas; i++){
			if(i%3 !=0){/*Nim : 2231750001(Digit terakhir 1+2=3*/
				System.out.printf(i + " ");
			}
		}
	}
}