package minggu5;

import java.util.Scanner;
public class MainPangkat17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
    
        Pangkat17 [] png = new Pangkat17[elemen];
        for (int i = 0; i < elemen; i++){
            png[i] = new Pangkat17();
            System.out.println("Masukkan nilai yang ingin dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            png[i].pangkat = sc.nextInt();
        }
            System.out.println("============================================");
             System.out.println("Hasil Pangkat dengan Brute Force");
             for (int i = 0; i < elemen; i++) {
             System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].PangkatBF(png[i].nilai,png[i].pangkat));
            }
             System.out.println("============================================");
             System.out.println("Hasil Pangkat dengan Devide dan Conquer");
             for (int i = 0; i < elemen; i++) {
             System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].PangkatDC(png[i].nilai,png[i].pangkat));
            }
             System.out.println("==============================================");
    }
}
