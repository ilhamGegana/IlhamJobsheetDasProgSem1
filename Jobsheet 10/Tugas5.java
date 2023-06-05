import java.util.Scanner;
public class Tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[11];
        for (int i = 0; i < A.length; i++) {
            System.out.print((i+1) + " ");
            A[i] = input.nextInt();
            i++;

        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}