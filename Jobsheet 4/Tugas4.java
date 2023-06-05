import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C, totalbBelanja, totalBarangA, totalBarangB, totalBarangC, jumlahBarangA, jumlahBarangB, jumlahBarangC, total;
        double diskonTotal, totalBayar;

        System.out.println("Masukkan Harga Barang A");
        A = input.nextInt();
        System.out.println("Masukkan Jumlah Barang A");
        jumlahBarangA = input.nextInt();
        System.out.println("Masukkan Harga Barang B");
        B = input.nextInt();
        System.out.println("Masukkan Jumlah Barang B");
        jumlahBarangB = input.nextInt();
        System.out.println("Masukkan Harga Barang C");
        C = input.nextInt();
        System.out.println("Masukkan Jumlah Barang C");
        jumlahBarangC = input.nextInt();

        totalBarangA = A * jumlahBarangA;
        totalBarangB = B * jumlahBarangB;
        totalBarangC = C * jumlahBarangC;

        total = totalBarangA + totalBarangB + totalBarangC;
        
        System.out.println("--------------------------------------------");
        System.out.println("\t\tStruk Nota");
        System.out.println("--------------------------------------------");
        
        System.out.println("Nama Barang\t Harga   Jumlah\t Total");
        System.out.println("  Barang A\t " + A + "\t " + jumlahBarangA + "\t " + totalBarangA);
        System.out.println("  Barang B\t " + B + "\t " + jumlahBarangB + "\t " + totalBarangB);
        System.out.println("  Barang C\t " + C + "\t " + jumlahBarangC + "\t " + totalBarangC);
        System.out.println("\tTotal\t\t\t: " + total);

                if (total > 200000 && total <= 500000){
                    diskonTotal = total * (0.02);
                    totalBayar = total - diskonTotal;
                    System.out.println("\tDiskon\t\t\t: " + diskonTotal);
                    System.out.println("\tTotal Bayar\t\t: " + totalBayar);
                }
                else if (total > 500000 && total <= 1000000) {
                    diskonTotal = total * (0.05);
                    totalBayar = total - diskonTotal;
                    System.out.println("\tDiskon\t\t\t: " + diskonTotal);
                    System.out.println("\tTotal Bayar\t\t: " + totalBayar);
                }
                else if (total > 1000000) {
                    diskonTotal = total * (0.1);
                    totalBayar = total - diskonTotal;
                    System.out.println("\tDiskon\t\t\t: " + diskonTotal);
                    System.out.println("\tTotal Bayar\t\t: " + totalBayar);
                }
                else {
                    System.out.println("Pembelian kurang dari Rp. 200.000,00");
                }

    }
}