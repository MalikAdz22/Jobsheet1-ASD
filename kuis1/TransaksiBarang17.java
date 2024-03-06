import java.util.ArrayList;

public class TransaksiBarang17 {

    private ArrayList<Barang17> barangs;
    private ArrayList<Barang17> pembelians;

    public TransaksiBarang17() {
        barangs = new ArrayList<>();
        pembelians = new ArrayList<>();
    }

    public void addBarang(Barang17 barang) {
        barangs.add(barang);
    }

    public void addPembelian(Barang17 barang) {
        pembelians.add(barang);
    }

    public void tampilkanBarang() {
        System.out.println("Daftar Barang:");
        System.out.println("-------------------------");
        System.out.printf("%-10s %-20s %-7s %s\n", "Kode", "Nama", "Harga", "Stok");
        for (Barang17 barang : barangs) {
            System.out.println(barang);
        }
    }

    public void tampilkanBarangPembelian() {
        System.out.println("\nDaftar Barang Pembelian:");
        System.out.println("-------------------------");
        System.out.printf("%-10s %-20s %-7s %s\n", "Kode", "Nama", "Harga", "Stok");
        for (Barang17 barang : pembelians) {
            System.out.println(barang);
        }
    }

    public void lakukanPembelian(String kodeBarang) {
        Barang17 barang = findBarangByKode(kodeBarang);
        if (barang != null) {
            if (barang.getStok() > 0) {
                barang.setStok(barang.getStok() - 1);
                pembelians.add(barang);
                System.out.println("Pembelian  " + barang.getNama() + " berhasil!");
            } else {
                System.out.println("Stok barang " + barang.getNama() + " habis!");
            }
        } else {
            System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan!");
        }
    }

    private Barang17 findBarangByKode(String kodeBarang) {
        for (Barang17 barang : barangs) {
            if (barang.getKode().equals(kodeBarang)) {
                return barang;
            }
        }
        return null;
    }
}
