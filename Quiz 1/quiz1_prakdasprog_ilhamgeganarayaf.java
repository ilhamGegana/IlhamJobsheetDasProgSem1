import java.util.Scanner;
public class quiz1_prakdasprog_ilhamgeganarayaf{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a;
		float b;

		System.out.println("Kalkulator Pertambahan");
		System.out.println("Masukkan Nilai");/*Memasukkan nilai pertama untuk ditambah*/
		a = sc.nextFloat();
		System.out.println("Masukkan Nilai Untuk ditambah");/*Memasukkan nilai kedua untuk ditambah*/
		b = sc.nextFloat();
		System.out.println("Hasil Pertambahan");
		System.out.println(a+b);

		System.out.println("Kalkulator Pengurangan");
		System.out.println("Masukkan Nilai");/*Memasukkan nilai pertama untuk dikurangi*/
		a = sc.nextFloat();
		System.out.println("Masukkan Nilai Untuk Dikurang");/*Memasukkan nilai kedua untuk dikurangi*/
		b = sc.nextFloat();
		System.out.println("Hasil Pengurangan");
		System.out.println(a-b);

		System.out.println("Kalkulator Perkalian");
    	System.out.println("Masukkan Nilai");/*Memasukkan nilai pertama untuk dikali*/
		a = sc.nextFloat();
		System.out.println("Masukkan Nilai Untuk dikali");/*Memasukkan nilai kedua untuk dikali*/
		b = sc.nextFloat();
		System.out.println("Hasil Perkalian");
		System.out.println(a*b);

    	System.out.println("Kalkulator Pembagian");
		System.out.println("Masukkan Nilai");/*Memasukkan nilai pertama untuk dibagi*/
		a = sc.nextFloat();
		System.out.println("Masukkan Nilai Untuk dibagi");/*Memasukkan nilai kedua untuk dibagi*/
		b = sc.nextFloat();
		System.out.println("Hasil Pembagian");
		System.out.println(a/b);
	}
}