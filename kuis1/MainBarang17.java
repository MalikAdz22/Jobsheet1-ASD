public class MainBarang17{

    public static void main(String[] args) {
        TransaksiBarang17 transaksiBarang = new TransaksiBarang17();

        // Menambahkan data Barang (minimal 5)
        transaksiBarang.addBarang(new Barang17("AB02", "Sapu", 7000, 10));
        transaksiBarang.addBarang(new Barang17("AB22", "Tempatsampah", 5000, 20));
        transaksiBarang.addBarang(new Barang17("AB11", "MakananIkan", 15000, 30));
        transaksiBarang.addBarang(new Barang17("AB23", "SikatGigi", 3000, 15));
        transaksiBarang.addBarang(new Barang17("AB12", "Meja", 30000, 5));
        transaksiBarang.addBarang(new Barang17("AB11", "Kursi", 15000, 8));
       
        // Menampilkan menu
        while (true) {
            System.out.println("Selamat Datang di Toko Malik Ganteng");
            System.out.println("Menu:");
            System.out.println("1. Daftar Barang");
            System.out.println("2. Lakukan Pembelian");
            System.out.println("3. Daftar Barang Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1-4): ");

            String pilihan = System.console().readLine();

            switch (pilihan) {
                case "1":
                    transaksiBarang.tampilkanBarang();
                    break;
                case "2":
                    lakukanPembelian(transaksiBarang);
                    break;
                case "3":
                    transaksiBarang.tampilkanBarangPembelian();
                    break;
                case "4":
                    System.out.println("Terimakasih");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void lakukanPembelian(TransaksiBarang17 transaksiBarang) {
        while (true) {
            System.out.println("\nMasukkan kode barang untuk membeli (atau 'K' untuk keluar): ");
            String kodeBarang = System.console().readLine();

            if (kodeBarang.equalsIgnoreCase("K")) {
                break;
            }

            transaksiBarang.lakukanPembelian(kodeBarang);
        }
    }
}