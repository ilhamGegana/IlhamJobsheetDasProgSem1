import java.util.Scanner;
public class Tugas3{
	public static void main(String []args){
		Scanner sc =new Scanner (System.in);
		float uas, uts, kuis, tugas;
		double akhir;

		System.out.println("Masukkan Nilai UAS");
		uas =sc.nextFloat();
		System.out.println("Masukkan Nilai UTS");
		uts =sc.nextFloat();
		System.out.println("Masukkan Nilai Kuis");
		kuis =sc.nextFloat();
		System.out.println("Masukkan Nilai Tugas");
		tugas =sc.nextFloat();

		akhir = ((uas*0.4)+(uts*0.3)+(kuis*0.1)+(tugas*0.2));

		if (akhir>=65){
			System.out.println("Tidak Remidi");
		}
		else{
			System.out.println("Remidi");
		}
	}
}