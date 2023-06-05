import java.util.Scanner;
public class Tugas3 {
    static float hasilnilai(int[] nilai, int mahasiswa) {
        float total = 0;
        for (int i = 0; i < mahasiswa; i++) {
            total =  total + nilai[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[100];
        System.out.print("Masukan Junlah Mahasiswa : ");
        int mahasiswa = input.nextInt();

        for (int i = 0; i < mahasiswa; i++) {
            System.out.println("Masukan Nilai Mahasiswa ke- " + (i+1) + " : ");
            nilai[i] = input.nextInt();
        }
        System.out.println();
        float total = hasilnilai(nilai, mahasiswa);
        float rata2 = (total/mahasiswa);
        System.out.println("Jumlah total dari semua Mahasiswa adalah : " + total);
        System.out.println("Jumlah Rata-rata dari semua Mahasiswa adalah : " + rata2);
    }
}