import java.util.Scanner;
public class Tugas1_8{
	public static void main(String[] args) {
		String kelasEksekutif = "Eksekutif", kelasBisnis = "Bisnis", kelasLuxury = "Luxury", kelasRegular="Regular", kode;
        int biayaEksekutif = 1250000, biayaBisnis = 1375000, biayaLuxury = 2500000,biayaRegular=50000, biayaAdministrasi = 50000, totalBayar;
		Scanner scan = new Scanner(System.in);

		System.out.print("Masukkan Kode Keberangkatan [pg/sg/mg/reg] : ");
		kode = scan.nextLine();
		if (kode.equals("pg")){
			System.out.println("Kode Keberangkatan : "+kode);
			System.out.println("Kelas Kereta : "+kelasEksekutif);
			System.out.println("Biaya Tiket : "+biayaEksekutif );
			totalBayar=biayaEksekutif+biayaAdministrasi;
			System.out.println("Total Bayar : "+totalBayar);
		} else if(kode.equals("sg")){
			System.out.println("Kode Keberangkatan : "+kode);
			System.out.println("Kelas Kereta : "+kelasBisnis);
			System.out.println("Biaya Tiket : "+biayaBisnis );
			totalBayar=biayaBisnis+biayaAdministrasi;
			System.out.println("Total Bayar : "+totalBayar);
		} else if(kode.equals("mg")){
			System.out.println("Kode Keberangkatan : "+kode);
			System.out.println("Kelas Kereta : "+kelasLuxury);
			System.out.println("Biaya Tiket : "+biayaLuxury );
			totalBayar=biayaLuxury+biayaAdministrasi;
			System.out.println("Total Bayar : "+totalBayar);
		} else{
			System.out.println("Kode Keberangkatan : "+kode);
			System.out.println("Kelas Kereta : "+kelasRegular);
			System.out.println("Biaya Tiket : "+biayaRegular );
			totalBayar=biayaRegular+biayaAdministrasi;
			System.out.println("Total Bayar : "+totalBayar);
		}
	}
}
