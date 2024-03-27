import java.util.Scanner;
public class Buku17 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    int terjual(int jml) {
        if (stok >= jml) {
     
          stok -= jml;
          System.out.println("Penjualan " + jml + " buku berhasil!");
          System.out.println("Sisa stok: " + stok);
        } else {
             System.out.println("Stok buku tidak mencukupi!");
          System.out.println("Sisa stok: " + stok);
          System.out.println("Jumlah buku yang dapat dibeli: " + stok);
        }
        return jml;
      }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku17() {

    }

   public Buku17 (String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    int hitungHargaTotal(int terjual){
        int hargaTotal = harga * terjual;
        System.out.println("Harga Total : " + hargaTotal);
        return hargaTotal;
    }

    int hitungDiskon(int hargaTotal){
        int diskon = 0;
        if(hargaTotal > 150000){
            diskon = 12;
            System.out.println("Anda mendapatan diskon sebesar "+ diskon);
        }else if(hargaTotal >= 75000 ){
            diskon = 5;
            System.out.println("Anda mendapatan diskon sebesar "+ diskon);
        }else{
            System.out.println("Anda tidak mendapatan diskon");
        }
        return diskon;
    }

    void hitungHargaBayar(int hargaTotal, int diskon){
        int hitungBayar = 0, potongan = 0;
        if(diskon > 0){
            potongan = hargaTotal*diskon/100;
            hitungBayar = hargaTotal - potongan;
        }else{
            hitungBayar = hargaTotal;
        }
        System.out.println("Total yang harus anda bayar "+hitungBayar);
    }
}
