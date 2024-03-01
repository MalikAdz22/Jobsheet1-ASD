import java.util.Scanner;

public class PersegiPanjangdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak PersegiPanjang: ");
        int panjangArray = sc.nextInt();
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];
        int panjang, lebar;

        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang[i] = new PersegiPanjang();

            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

        arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang,lebar);
        }

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: " + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
            System.out.println("Luas: " + arrayOfPersegiPanjang[i].hitungLuas());
            System.out.println("Keliling: " + arrayOfPersegiPanjang[i].hitungKeliling());
        }

        // arrayOfPersegiPanjang[0] = new PersegiPanjang();
        // arrayOfPersegiPanjang[0].panjang = 110;
        // arrayOfPersegiPanjang[0].lebar = 30;

        // arrayOfPersegiPanjang[1] = new PersegiPanjang();
        // arrayOfPersegiPanjang[1].panjang = 80;12
        // arrayOfPersegiPanjang[1].lebar = 40;

        // arrayOfPersegiPanjang[2] = new PersegiPanjang();
        // arrayOfPersegiPanjang[2].panjang = 100;
        // arrayOfPersegiPanjang[2].lebar = 20;

        // System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang[0].panjang +", lebar: " + arrayOfPersegiPanjang[0].lebar);
        // System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang[1].panjang +", lebar: " + arrayOfPersegiPanjang[1].lebar);
        // System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang[2].panjang +", lebar: " + arrayOfPersegiPanjang[2].lebar);
    }
}
