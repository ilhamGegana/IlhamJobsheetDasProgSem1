import java.util.Scanner;
public class Tugas2{
	public static void main(String[] args) {
		int pengunjungAnak = 5, pengunjungDewasa = 5, tiketAnak = 50000, tiketDewasa = 100000, pemasukanPerhari, total=0;
		System.out.println("Harga tiket anak-anak : Rp. "+tiketAnak);
		System.out.println("Harga tiket Dewasa    : Rp. "+tiketDewasa);
		System.out.println("Pengunjung Anak setiap hari   : "+pengunjungAnak);
		System.out.println("Pengunjung Dewasa setiap hari : "+pengunjungDewasa);

		for(int tanggal = 1; tanggal <=31; tanggal++){

			if (tanggal%7 ==0){
				System.out.printf("\nTanggal %d libur tidak ada pemasukan", tanggal);
				continue;
			}else{
				pemasukanPerhari=pengunjungAnak*tiketAnak + pengunjungDewasa*tiketDewasa;
				total=total+pemasukanPerhari;
				System.out.printf("\nPemasukan tanggal %d adalah Rp. %d",tanggal, total);
			}
		}
		System.out.println("\n========================");
		System.out.println("\nPendapatan bulan agustus: Rp. "+total);
		System.out.println("\n========================");
	}
}