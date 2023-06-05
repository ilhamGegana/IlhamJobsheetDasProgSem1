import java.util.Scanner;
public class Tugas2 {
    static double hitungKelilingLingkaran(double jari2) {
        double keliling = 3.14159265359 * (jari2 + jari2);
        return keliling;
    }
    static double hitungLuasLingkaran(double jari2) {
        double luas = 3.14159265359 * jari2 * jari2;
        return luas;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Panjang Jari-jari lingkaran : ");
        double jari2 = input.nextInt();
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Keliling Lingkaran dengan Jari-jari " + jari2 + " adalah : " + hitungKelilingLingkaran(jari2));
        System.out.println("Luas Lingkaran dengan Jari-jari " + jari2 + " adalah : " + hitungLuasLingkaran(jari2));
    }
}