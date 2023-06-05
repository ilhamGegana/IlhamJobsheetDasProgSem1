import java.util.Scanner;
public class Tugas2{
	public static void main(String []args){
		Scanner sc =new Scanner (System.in);
		int umur;
		System.out.println("Masukkan Umur");
		umur=sc.nextInt();

		if (umur>=17){
			System.out.println("Boleh Berkendara");
		}
		else{
			System.out.println("Tidak Boleh Berkendara");
		}
	}
}