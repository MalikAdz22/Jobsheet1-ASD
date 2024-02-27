import java.util.Scanner;

public class BukuMain17 {
    public static void main(String[] args) {
        Buku17 bk1 = new Buku17();
        bk1.judul = "Today Ends Tommorow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;       
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku17 bk2 = new Buku17("self reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku17 bukuMalik = new Buku17 ("Malik ganteng", "Malik", 68, 10, 71000);
        bukuMalik.gantiHarga(60000);
        bukuMalik.tampilInformasi();
        int terjual = bukuMalik.terjual(5);
        int hargaTotal = bukuMalik.hitungHargaTotal(terjual);
        int diskon = bukuMalik.hitungDiskon(hargaTotal);
        bukuMalik.hitungHargaBayar(hargaTotal, diskon);
    }
    
}
