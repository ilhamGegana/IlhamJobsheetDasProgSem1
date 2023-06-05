import java.util.Scanner;
public class ProyekTiketKonser3 {
	static String nama, email, nomorHp;
	public static String[] konser = {"Konser Taylor Swift", "Konser Justin Bieber", "Konser YOASOBI", "Konser Noah"};
	static int stok, tiketDibeli;
	static double totalDibeli;
	public static int[] arrStok= {800, 1000, 900, 400, 1800};
	public static String tanggal[][] = {{"24 Desember 2022", "25 Desember 2022"}, {"7 Januari 2022"}, {"15 Januari 2022"}, {"4 Februari 2022"}};
	public static String jamMulai[][] = {{"13.00 WIB", "19.00 WIB"}, {"18.30 WIB"}, {"09.00 WIB"}};
	public static String tempat[] = {"Istora Senayan, GBK", "Sentul International Convention Center, Bogor", "Beach City International Stadium, Ancol Beach City"};
	public static double hargaTiket[] = {2000000, 2500000, 3000000, 1500000};

	static void profil() {
		Scanner sc = new Scanner (System.in);
		System.out.println("-------------------------------------");
		System.out.println("- - - SELAMAT DATANG DI TIKETMU - - -");
		System.out.println("- - - Situs Beli Tiket Konsermu - - -");
		System.out.println("-------------------------------------");
		System.out.print("Masukkan Nama Anda\t: ");
		nama = sc.nextLine();
		System.out.print("Masukkan Nomor HP Anda\t: ");
		nomorHp = sc.nextLine();
		System.out.print("Masukkan E-mail Anda\t: ");
		email = sc.nextLine();
	}
	static void notaDay1(){
		Scanner sc = new Scanner (System.in);
		String wallet[] = {"Dana", "BRImo", "ShopeePay"};
		int angka;
		System.out.println("Jl. Lawangan Daya, Pademawu               ---------------------------");
		System.out.println("Pamekasan,                                - - - - - TIKETMU - - - - -");
		System.out.println("Jawa Timur                                ---------------------------");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("			  NOTA TRANSAKSI                  	     ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Nama Pembeli\t: " + nama);
		System.out.println("Nomor Telepon\t: " + nomorHp);
		System.out.println("E-Mail\t\t: " + email);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("			  UNTUK PEMBELIAN							 ");
		System.out.println("Tiket " + konser[0]);
		System.out.println("Tanggal Pelaksanaan Konser\t\t: " + tanggal[0][0]);
		System.out.println("Waktu Mulai Pelaksanaan Konser\t\t: " + jamMulai[0][0]);
		System.out.println("Dilaksanakan Di " + tempat[0]);
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Pembayaran Melalui: 1. "+wallet[0]);
		System.out.println("		    2. "+wallet[1]);
		System.out.println("		    3. "+wallet[2]);
		System.out.print("Pilih Dengan Memasukkan Angka: ");
		angka = sc.nextInt();
		switch (angka) {
		case 1:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[0]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[0]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;
		case 2:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[1]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[0]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;
		case 3:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[2]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[0]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;

		default:
			System.out.println("Angka Yang Anda Masukkan Salah!!");
		}

	}
	static void notaDay2(){
		Scanner sc = new Scanner (System.in);
		String wallet[] = {"Dana", "BRImo", "ShopeePay"};
		int angka;
		System.out.println("Jl. Lawangan Daya, Pademawu               ---------------------------");
		System.out.println("Pamekasan,                                - - - - - TIKETMU - - - - -");
		System.out.println("Jawa Timur                                ---------------------------");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("			  NOTA TRANSAKSI                  	     ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Nama Pembeli\t: " + nama);
		System.out.println("Nomor Telepon\t: " + nomorHp);
		System.out.println("E-Mail\t\t: " + email);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("			  UNTUK PEMBELIAN							 ");
		System.out.println("Tiket " + konser[0]);
		System.out.println("Tanggal Pelaksanaan Konser\t\t: " + tanggal[0][1]);
		System.out.println("Waktu Mulai Pelaksanaan Konser\t\t: " + jamMulai[0][1]);
		System.out.println("Dilaksanakan Di " + tempat[0]);
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Pembayaran Melalui: 1. "+wallet[0]);
		System.out.println("		    2. "+wallet[1]);
		System.out.println("		    3. "+wallet[2]);
		System.out.print("Pilih Dengan Memasukkan Angka: ");
		angka = sc.nextInt();
		switch (angka) {
		case 1:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[0]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[1]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;
		case 2:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[1]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[1]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;
		case 3:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[2]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[1]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;

		default:
			System.out.println("Angka Yang Anda Masukkan Salah!!");
		}

	}
	static void notaJustin(){
		Scanner sc = new Scanner (System.in);
		String wallet[] = {"Dana", "BRImo", "ShopeePay"};
		int angka;
		System.out.println("Jl. Lawangan Daya, Pademawu               ---------------------------");
		System.out.println("Pamekasan,                                - - - - - TIKETMU - - - - -");
		System.out.println("Jawa Timur                                ---------------------------");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("			  NOTA TRANSAKSI                  	     ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Nama Pembeli\t: " + nama);
		System.out.println("Nomor Telepon\t: " + nomorHp);
		System.out.println("E-Mail\t\t: " + email);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("			  UNTUK PEMBELIAN							 ");
		System.out.println("Tiket " + konser[1]);
		System.out.println("Tanggal Pelaksanaan Konser\t\t: " + tanggal[1][0]);
		System.out.println("Waktu Mulai Pelaksanaan Konser\t\t: " + jamMulai[1][0]);
		System.out.println("Dilaksanakan Di " + tempat[1]);
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Pembayaran Melalui: 1. "+wallet[0]);
		System.out.println("		    2. "+wallet[1]);
		System.out.println("		    3. "+wallet[2]);
		System.out.print("Pilih Dengan Memasukkan Angka: ");
		angka = sc.nextInt();
		switch (angka) {
		case 1:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[0]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[2]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;
		case 2:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[1]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[2]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;
		case 3:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[2]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[2]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;

		default:
			System.out.println("Angka Yang Anda Masukkan Salah!!");
		}

	}
	static void notaYoa(){
		Scanner sc = new Scanner (System.in);
		String wallet[] = {"Dana", "BRImo", "ShopeePay"};
		int angka;
		System.out.println("Jl. Lawangan Daya, Pademawu               ---------------------------");
		System.out.println("Pamekasan,                                - - - - - TIKETMU - - - - -");
		System.out.println("Jawa Timur                                ---------------------------");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("			  NOTA TRANSAKSI                  	     ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Nama Pembeli\t: " + nama);
		System.out.println("Nomor Telepon\t: " + nomorHp);
		System.out.println("E-Mail\t\t: " + email);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("			  UNTUK PEMBELIAN							 ");
		System.out.println("Tiket " + konser[2]);
		System.out.println("Tanggal Pelaksanaan Konser\t\t: " + tanggal[2][0]);
		System.out.println("Waktu Mulai Pelaksanaan Konser\t\t: " + jamMulai[1][0]);
		System.out.println("Dilaksanakan Di " + tempat[2]);
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Pembayaran Melalui: 1. "+wallet[0]);
		System.out.println("		    2. "+wallet[1]);
		System.out.println("		    3. "+wallet[2]);
		System.out.print("Pilih Dengan Memasukkan Angka: ");
		angka = sc.nextInt();
		switch (angka) {
		case 1:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[0]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[1]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;
		case 2:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[1]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[1]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;
		case 3:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[2]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[1]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;

		default:
			System.out.println("Angka Yang Anda Masukkan Salah!!");
		}

	}
	static void notaNoah(){
		Scanner sc = new Scanner (System.in);
		String wallet[] = {"Dana", "BRImo", "ShopeePay"};
		int angka;
		System.out.println("Jl. Lawangan Daya, Pademawu               ---------------------------");
		System.out.println("Pamekasan,                                - - - - - TIKETMU - - - - -");
		System.out.println("Jawa Timur                                ---------------------------");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("			  NOTA TRANSAKSI                  	     ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Nama Pembeli\t: " + nama);
		System.out.println("Nomor Telepon\t: " + nomorHp);
		System.out.println("E-Mail\t\t: " + email);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("			  UNTUK PEMBELIAN							 ");
		System.out.println("Tiket " + konser[3]);
		System.out.println("Tanggal Pelaksanaan Konser\t\t: " + tanggal[3][0]);
		System.out.println("Waktu Mulai Pelaksanaan Konser\t\t: " + jamMulai[2][0]);
		System.out.println("Dilaksanakan Di " + tempat[0]);
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Pembayaran Melalui: 1. "+wallet[0]);
		System.out.println("		    2. "+wallet[1]);
		System.out.println("		    3. "+wallet[2]);
		System.out.print("Pilih Dengan Memasukkan Angka: ");
		angka = sc.nextInt();
		switch (angka) {
		case 1:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[0]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[3]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;
		case 2:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[1]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[3]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;
		case 3:
			System.out.println("Anda Membayar Menggunakan\t: " + wallet[2]);
			System.out.println("Pembelian Sebanyak\t\t: "+ tiketDibeli +" Tiket");
			System.out.println("Harga 1 Tiket\t\t\t: Rp " + hargaTiket[3]);
			System.out.println("Total Pembayaran\t\t: Rp " + totalDibeli);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("		  SELAMAT TRANSAKSI BERHASIL!!                    ");
			System.out.println("--------------------------------------------------------------------");
			break;

		default:
			System.out.println("Angka Yang Anda Masukkan Salah!!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String x=null, y;
		String pilihan, day;

		do {
			profil();
			do {
				System.out.println("--------------");
				System.out.println("PILIHAN KONSER");
				System.out.println("--------------");
				System.out.println("1. " + konser[0]);
				System.out.println("2. " + konser[1]);
				System.out.println("3. " + konser[2]);
				System.out.println("4. " + konser[3]);
				System.out.print("Pilihlah Dengan memasukkan angkanya: ");
				pilihan = sc.next();
				System.out.println("");

				if (pilihan.equalsIgnoreCase("1")) {
					System.out.println("Day 1 " + konser[0] + " : " + tanggal[0][0]);
					System.out.println("Day 2 " + konser[0] + " : " + tanggal[0][1]);
					System.out.print("Pilihlah Harinya Dengan memasukkan angka (1/2): ");
					day = sc.next();
					System.out.println("");

					if (day.equalsIgnoreCase("1")){
						System.out.println("Stok Tiket adalah\t\t\t: " + arrStok[0]);
						if (arrStok[0] <= 0){
							System.out.println("Stok Tiket Habis!");
							break;
						}
						System.out.println("Jam Mulai Konser\t\t\t: " + jamMulai[0][0]);
						System.out.println("Tempat Konser\t\t\t\t: " + tempat[0]);
						System.out.println("Harga Tiket\t\t\t\t: Rp " + hargaTiket[0] + " per tiket");
						System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
						tiketDibeli = sc.nextInt();
						totalDibeli = tiketDibeli * hargaTiket[0];
						System.out.println("Total Uang Yang Akan Dibayar\t\t: Rp " + totalDibeli);
						arrStok[0] -= tiketDibeli;
						System.out.println("Sisa Tiket Setelah Pembelian\t\t: " + arrStok[0]);
						System.out.print("Apakah anda yakin dengan pilihan anda (y/t): ");
						x = sc.next();
						System.out.println("");
						if (x.equalsIgnoreCase("t")){
							arrStok[0] += tiketDibeli;
						} else {
							notaDay1();
						}

					} else if (day.equalsIgnoreCase("2")) {
						System.out.println("Stok Tiket adalah\t\t\t: " + arrStok[1]);
						if (arrStok[1] <= 0){
							System.out.println("Stok Tiket Habis!");
							break;
						}
						System.out.println("Jam Mulai Konser\t\t\t: " + jamMulai[0][1]);
						System.out.println("Tempat Konser\t\t\t\t: " + tempat[0]);
						System.out.println("Harga Tiket\t\t\t\t: Rp " + hargaTiket[1] + " per tiket");
						System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
						tiketDibeli = sc.nextInt();
						totalDibeli = tiketDibeli * hargaTiket[1];
						System.out.println("Total Uang Yang Akan Dibayar\t\t: Rp " + totalDibeli);
						arrStok[1] -= tiketDibeli;
						System.out.println("Sisa Tiket Setelah Pembelian\t\t: " + arrStok[1]);
						System.out.print("Apakah anda yakin dengan pilihan anda (y/t): ");
						x = sc.next();
						System.out.println("");
						if (x.equalsIgnoreCase("t")){
							arrStok[1] += tiketDibeli;
						} else {
							notaDay2();
						}

					} else {
						System.out.println("Angka yang dimasukkan salah!!");
					}
					continue;
				} else if (pilihan.equalsIgnoreCase("2")) {
					System.out.println("Tanggal " + konser[1] +"\t\t: " + tanggal[1][0]);
					System.out.println("Stok Tiket adalah\t\t\t: " + arrStok[2]);
					if (arrStok[2] <= 0){
						System.out.println("Stok Tiket Habis!");
						break;
					}
					System.out.println("Jam Mulai Konser\t\t\t: " + jamMulai[1][0]);
					System.out.println("Tempat Konser\t\t\t\t: " + tempat[1]);
					System.out.println("Harga Tiket\t\t\t\t: Rp " + hargaTiket[2] + " per tiket");
					System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
					tiketDibeli = sc.nextInt();
					totalDibeli = tiketDibeli * hargaTiket[2];
					System.out.println("Total Uang Yang Akan Dibayar\t\t: Rp " + totalDibeli);
					arrStok[2] -= tiketDibeli;
					System.out.println("Sisa Tiket Setelah Pembelian\t\t: " + arrStok[2]);
					System.out.print("Apakah anda yakin dengan pilihan anda (y/t): ");
					x = sc.next();
					System.out.println("");
					if (x.equalsIgnoreCase("t")){
						arrStok[2] += tiketDibeli;
					} else {
						notaJustin();
					}
					continue;

				} else if (pilihan.equalsIgnoreCase("3")){
					System.out.println("Tanggal " + konser[2] +"\t\t\t: " + tanggal[2][0]);
					System.out.println("Stok Tiket adalah\t\t\t: " + arrStok[3]);
					if (arrStok[3] <= 0){
						System.out.println("Stok Tiket Habis!");
						break;
					}
					System.out.println("Jam Mulai Konser\t\t\t: " + jamMulai[1][0]);
					System.out.println("Tempat Konser\t\t\t\t: " + tempat[2]);
					System.out.println("Harga Tiket\t\t\t\t: Rp " + hargaTiket[1] + " per tiket");
					System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
					tiketDibeli = sc.nextInt();
					totalDibeli = tiketDibeli * hargaTiket[1];
					System.out.println("Total Uang Yang Akan Dibayar\t\t: Rp " + totalDibeli);
					arrStok[3] -= tiketDibeli;
					System.out.println("Sisa Tiket Setelah Pembelian\t\t: " + arrStok[3]);
					System.out.print("Apakah anda yakin dengan pilihan anda (y/t): ");
					x = sc.next();
					System.out.println("");
					if (x.equalsIgnoreCase("t")){
						arrStok[3] += tiketDibeli;
					} else {
						notaYoa();
					}
					continue;

				} else if (pilihan.equalsIgnoreCase("4")){
					System.out.println("Tanggal " + konser[3] +"\t\t\t: "+ tanggal[3][0]);
					System.out.println("Stok Tiket adalah\t\t\t: " + arrStok[4]);
					if (arrStok[4] <= 0){
						System.out.println("Stok Tiket Habis!");
						break;
					}
					System.out.println("Jam Mulai Konser\t\t\t: " + jamMulai[2][0]);
					System.out.println("Tempat Konser\t\t\t\t: " + tempat[0]);
					System.out.println("Harga Tiket\t\t\t\t: Rp " + hargaTiket[3] + " per tiket");
					System.out.print("Masukkan Jumlah Tiket Yang Ingin Dibeli: ");
					tiketDibeli = sc.nextInt();
					totalDibeli = tiketDibeli * hargaTiket[3];
					System.out.println("Total Uang Yang Akan Dibayar\t\t: Rp " + totalDibeli);
					arrStok[4] -= tiketDibeli;
					System.out.println("Sisa Tiket Setelah Pembelian\t\t: " + arrStok[4]);
					System.out.print("Apakah anda yakin dengan pilihan anda (y/t): ");
					x = sc.next();
					System.out.println("");
					if (x.equalsIgnoreCase("t")){
						arrStok[4] += tiketDibeli;
					} else {
						notaNoah();
					}
					continue;

				} else {
					System.out.println("Angka yang anda masukkan salah!");
					break;
				}
			} while	(x.equalsIgnoreCase("t"));

			System.out.print("Apakah ingin melakukan pembelian lagi (y/t): ");
			y = sc.next();
		} while (y.equalsIgnoreCase("y"));
	}
}