import java.util.Scanner;
public class TugasArray{
    public static void main(String[] args) {
        double nilai;
        char grade;
        Scanner sc = new Scanner (System.in);
        String []nama = new String [4];
        int [] kehadiran = new int[nama.length];
        int [] kerapian = new int [nama.length];
        int [] hasilKerja = new int [nama.length];

        for (int i=0; i<nama.length; i++){
            System.out.print("Masukkan nama karyawan: ");
            nama[i]=sc.next();
            System.out.print("Masukkan nilai kehadiran: ");
            kehadiran[i]=sc.nextInt();            
            System.out.print("Masukkan nilai kerapian: ");
            kerapian[i]=sc.nextInt();
            System.out.print("Masukkan hasil kerja: ");
            hasilKerja[i]=sc.nextInt();
            nilai= (0.3) * kehadiran[i] + (0.3) * kerapian[i] + (0.4) * hasilKerja[i];
            System.out.print("Nilai Akhir Karyawan: " + nilai);

            if (nilai >= 80 && nilai <= 100){
                grade = 'A';
                System.out.println("\nGrade Karyawan: " + grade);
            } else if (nilai >= 70 && nilai < 80){
                grade = 'B';
                System.out.println("\nGrade Karyawan: " + grade);
            } else if (nilai >= 59 && nilai < 70){
                grade = 'C';
                System.out.println("\nGrade Karyawan: " + grade);
            } else if (nilai >= 50 && nilai < 59){
                grade = 'D';
                System.out.println("\nGrade Karyawan: " + grade);
            } else if (nilai <50){
                grade = 'E';
                System.out.println("\nGrade Karyawan: " + grade);
            } else {
                System.out.println("\nNilai yang dimasukkan tidak sesuai!");
            }
        }
    }
}