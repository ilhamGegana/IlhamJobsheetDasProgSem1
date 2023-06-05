import java.util.Scanner;
public class Tugas1 {
    static int Max3(int bil1, int bil2, int bil3) {
    int max = 0;
    int[] bil = {bil1, bil2, bil3};
    for (int i = 0; i < bil.length; i++) {
        if (bil[i] > max) {
            max = bil[i];
        }
    }
    return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===============================");

        System.out.print("Masukan bilangan Pertama  : ");
        int bil1 = input.nextInt();
        System.out.print("Masukan bilangan Kedua    : ");
        int bil2 = input.nextInt();
        System.out.print("Masukan bilangan Ketiga   : ");
        int bil3 = input.nextInt();

        System.out.println("=========================================================================");
        System.out.println("Nilai Maximal atau Tertinggi dari ketiga bilangan tersebut adalah :  " + Max3(bil1, bil2, bil3));
        System.out.println("=========================================================================");
    }
}