import java.util.Scanner;
public class Tugas1{
	public static void main(String []args){
		Scanner sc =new Scanner (System.in);
		int angka1, angka2;
		System.out.println("Masukkan Bilangan bulat pertama");
		angka1 = sc.nextInt();
		System.out.println("Masukkan Bilangan bulat kedua");
		angka2 = sc.nextInt();

		if (angka1>angka2){
			System.out.print("Bilangan yang lebih besar adalah " +angka1);
		}
		else if (angka1<angka2){
			System.out.println("Bilangan yang lebih besar adalah " +angka2);
		}
		else{
			System.out.println("Nilai bilangan sama");
		}
	}
}