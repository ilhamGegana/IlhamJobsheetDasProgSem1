import java.util.Scanner;
public class ProyekTiketKonser2 {
	static String nama, email, nomorHp;
	public static String[] konser = {"Konser Taylor Swift", "Konser Justin Bieber", "Konser YOASOBI", "Konser Noah"};
	static int stok, tiketDibeli;
	public static int[] arrStok= {800, 1000, 900, 400, 1800};

	static void profil() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan Nama Anda");
		nama = sc.next();
		System.out.print("Masukkan Nomor HP Anda");
		nomorHp = sc.next();
		System.out.print("Masukkan E-mail Anda");
		email = sc.next();
	}
	/*static void pilihanKonser() {
		Scanner sc = new Scanner (System.in);
		String pilihan, day;
		int stok, stokDay2, stokJustin, stokYoasobi, stokNoah, tiketDibeli;
		float totalDibeli;
		String tanggal[][] = {{"24 Desember 2022", "25 Desember 2022"}, {"7 Januari 2022"}, {"15 Januari 2022"}, {"4 Februari 2022"}};
		String jamMulai[][] = {{"13.00 WIB", "19.00 WIB"}, {"18.30 WIB"}, {"09.00 WIB"}};
		String tempat[] = {"Istora Senayan, GBK", "Sentul International Convention Center, Bogor", "Beach City International Stadium, Ancol Beach City"};
		float hargaTiket[] = {2000000, 2500000, 3000000, 1500000};

		System.out.println("1. " + konser[0]);
		System.out.println("2. " + konser[1]);
		System.out.println("3. " + konser[2]);
		System.out.println("4. " + konser[3]);
		System.out.print("Pilihlah Dengan memasukkan angkanya: ");
		pilihan = sc.next();

		for(stok = arrStok[0]; stok > 0;) {
			if (pilihan.equalsIgnoreCase("1")) {
				System.out.println("Day 1: " + tanggal[0][0]);
				System.out.println("Day 2: " + tanggal[0][1]);
				day = sc.next();

				if (day.equalsIgnoreCase("1")) {
					System.out.println("Stok Tiket adalah: " + stok);
					System.out.println("Jam Mulai Konser: " + jamMulai[0][0]);
					System.out.println("Tempat Konser: " + tempat[0]);
					System.out.println("Harga Tiket: Rp" + hargaTiket[0] + " per orang");
					System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
					tiketDibeli = sc.nextInt();
					totalDibeli = tiketDibeli * hargaTiket[0];
					System.out.println("Total Uang Yang Akan Dibayar: " + totalDibeli);
					sisaStok -= tiketDibeli;
					System.out.println("Sisa Tiket Setelah Pembelian: " + sisaStok);
					
				} else if (day.equalsIgnoreCase("2")){
					stokDay2 = stok + 200;
					System.out.println("Stok Tiket adalah: " + stokDay2);
					System.out.println("Jam Mulai Konser: " + jamMulai[0][1]);
					System.out.println("Tempat Konser: " + tempat[0]);
					System.out.println("Harga Tiket: Rp" + hargaTiket[1] + " per orang");
					System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
					tiketDibeli = sc.nextInt();
					totalDibeli = tiketDibeli * hargaTiket[1];
					System.out.println("Total Uang Yang Akan Dibayar: " + totalDibeli);
					stok = stokDay2 - tiketDibeli;
					System.out.println("Sisa Tiket Setelah Pembelian: " + stok);
				} else {
					System.out.println("Angka yang dimasukkan salah!!");
				}
				break;

			} else if (pilihan.equalsIgnoreCase("2")) {
				System.out.println("Tanggal Konser Justin Bieber: " + tanggal[1][0]);
				stokJustin = stok + 100;
				System.out.println("Stok Tiket adalah: " + stokJustin);
				System.out.println("Jam Mulai Konser: " + jamMulai[1][0]);
				System.out.println("Tempat Konser: " + tempat[1]);
				System.out.println("Harga Tiket: Rp" + hargaTiket[2] + " per orang");
				System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
				tiketDibeli = sc.nextInt();
				totalDibeli = tiketDibeli * hargaTiket[2];
				System.out.println("Total Uang Yang Akan Dibayar: " + totalDibeli);
				stok = stokJustin - tiketDibeli;
				System.out.println("Sisa Tiket Setelah Pembelian: " + stok);
				break;

			} else if (pilihan.equalsIgnoreCase("3")) {
				System.out.println("Tanggal Konser YOASOBI: " + tanggal[2][0]);
				stokYoasobi = stok - 400;
				System.out.println("Stok Tiket adalah: " + stokYoasobi);
				System.out.println("Jam Mulai Konser: " + jamMulai[1][0]);
				System.out.println("Tempat Konser: " + tempat[2]);
				System.out.println("Harga Tiket: Rp" + hargaTiket[1] + " per orang");
				System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
				tiketDibeli = sc.nextInt();
				totalDibeli = tiketDibeli * hargaTiket[1];
				System.out.println("Total Uang Yang Akan Dibayar: " + totalDibeli);
				stok = stokYoasobi - tiketDibeli;
				System.out.println("Sisa Tiket Setelah Pembelian: " + stok);
				break;

			} else if (pilihan.equalsIgnoreCase("4")) {
				System.out.println("Tanggal Konser NOAH: " + tanggal[3][0]);
				stokNoah = stok + 1000;
				System.out.println("Stok Tiket adalah: " + stokNoah);
				System.out.println("Jam Mulai Konser: " + jamMulai[2][0]);
				System.out.println("Tempat Konser: " + tempat[0]);
				System.out.println("Harga Tiket: Rp" + hargaTiket[3] + " per orang");
				System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
				tiketDibeli = sc.nextInt();
				totalDibeli = tiketDibeli * hargaTiket[3];
				System.out.println("Total Uang Yang Akan Dibayar: " + totalDibeli);
				stok = stokNoah - tiketDibeli;
				System.out.println("Sisa Tiket Setelah Pembelian: " + stok);
				break;
			} else{
				System.out.println("Angka yang anda masukkan salah!");
				break;*/
			}


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String x=null, y;
		String pilihan, day;
		int stok, stokDay2, stokJustin, stokYoasobi, stokNoah, tiketDibeli;
		float totalDibeli;
		String tanggal[][] = {{"24 Desember 2022", "25 Desember 2022"}, {"7 Januari 2022"}, {"15 Januari 2022"}, {"4 Februari 2022"}};
		String jamMulai[][] = {{"13.00 WIB", "19.00 WIB"}, {"18.30 WIB"}, {"09.00 WIB"}};
		String tempat[] = {"Istora Senayan, GBK", "Sentul International Convention Center, Bogor", "Beach City International Stadium, Ancol Beach City"};
		float hargaTiket[] = {2000000, 2500000, 3000000, 1500000};
		do{
			profil();
			do{
				System.out.println("1. " + konser[0]);
				System.out.println("2. " + konser[1]);
				System.out.println("3. " + konser[2]);
				System.out.println("4. " + konser[3]);
				System.out.print("Pilihlah Dengan memasukkan angkanya: ");
				pilihan = sc.next();

				if (pilihan.equalsIgnoreCase("1")) {
					System.out.println("Day 1: " + tanggal[0][0]);
					System.out.println("Day 2: " + tanggal[0][1]);
					day = sc.next();

					if (day.equalsIgnoreCase("1")) {
						System.out.println("Stok Tiket adalah: " + arrStok[0]);
						System.out.println("Jam Mulai Konser: " + jamMulai[0][0]);
						System.out.println("Tempat Konser: " + tempat[0]);
						System.out.println("Harga Tiket: Rp" + hargaTiket[0] + " per orang");
						System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
						tiketDibeli = sc.nextInt();
						totalDibeli = tiketDibeli * hargaTiket[0];
						System.out.println("Total Uang Yang Akan Dibayar: " + totalDibeli);
						arrStok[0] -= tiketDibeli;
						System.out.println("Sisa Tiket Setelah Pembelian: " + arrStok[0]);
					
					} else if (day.equalsIgnoreCase("2")){
						System.out.println("Stok Tiket adalah: " + arrStok[1]);
						System.out.println("Jam Mulai Konser: " + jamMulai[0][1]);
						System.out.println("Tempat Konser: " + tempat[0]);
						System.out.println("Harga Tiket: Rp" + hargaTiket[1] + " per orang");
						System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
						tiketDibeli = sc.nextInt();
						totalDibeli = tiketDibeli * hargaTiket[1];
						System.out.println("Total Uang Yang Akan Dibayar: " + totalDibeli);
						arrStok[1] -= tiketDibeli;
						System.out.println("Sisa Tiket Setelah Pembelian: " + arrStok[1]);
					} else {
						System.out.println("Angka yang dimasukkan salah!!");
					}
					break;

				} else if (pilihan.equalsIgnoreCase("2")) {
					System.out.println("Tanggal Konser Justin Bieber: " + tanggal[1][0]);
					System.out.println("Stok Tiket adalah: " + arrStok[2]);
					System.out.println("Jam Mulai Konser: " + jamMulai[1][0]);
					System.out.println("Tempat Konser: " + tempat[1]);
					System.out.println("Harga Tiket: Rp" + hargaTiket[2] + " per orang");
					System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
					tiketDibeli = sc.nextInt();
					totalDibeli = tiketDibeli * hargaTiket[2];
					System.out.println("Total Uang Yang Akan Dibayar: " + totalDibeli);
					arrStok[2] -= tiketDibeli;
					System.out.println("Sisa Tiket Setelah Pembelian: " + arrStok[2]);
					break;

				} else if (pilihan.equalsIgnoreCase("3")) {
					System.out.println("Tanggal Konser YOASOBI: " + tanggal[2][0]);
					System.out.println("Stok Tiket adalah: " + stokYoasobi);
					System.out.println("Jam Mulai Konser: " + jamMulai[1][0]);
					System.out.println("Tempat Konser: " + tempat[2]);
					System.out.println("Harga Tiket: Rp" + hargaTiket[1] + " per orang");
					System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
					tiketDibeli = sc.nextInt();
					totalDibeli = tiketDibeli * hargaTiket[1];
					System.out.println("Total Uang Yang Akan Dibayar: " + totalDibeli);
					arrStok[3] -= tiketDibeli;
					System.out.println("Sisa Tiket Setelah Pembelian: " + arrStok[3]);
					break;

				} else if (pilihan.equalsIgnoreCase("4")) {
					System.out.println("Tanggal Konser NOAH: " + tanggal[3][0]);
					System.out.println("Stok Tiket adalah: " + stokNoah);
					System.out.println("Jam Mulai Konser: " + jamMulai[2][0]);
					System.out.println("Tempat Konser: " + tempat[0]);
					System.out.println("Harga Tiket: Rp" + hargaTiket[3] + " per orang");
					System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
					tiketDibeli = sc.nextInt();
					totalDibeli = tiketDibeli * hargaTiket[3];
					System.out.println("Total Uang Yang Akan Dibayar: " + totalDibeli);
					arrStok[4] -= tiketDibeli;
					System.out.println("Sisa Tiket Setelah Pembelian: " + arrStok[4]);
					break;
				} else{
					System.out.println("Angka yang anda masukkan salah!");
					break;//

				System.out.println("y/t");
				x = sc.next();
			} while (x.equalsIgnoreCase("t"));
			System.out.println("y/t");
			y = sc.next();
		} while (y.equalsIgnoreCase("y"));
	}
}