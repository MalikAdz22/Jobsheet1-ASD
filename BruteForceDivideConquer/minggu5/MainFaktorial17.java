package minggu5;

import java.util.Scanner;
public class MainFaktorial17 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("=====================================================");
       System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
       int elemen = sc.nextInt();
    
       Faktorial17 [] fk = new Faktorial17[elemen];
       for (int i = 0; i < elemen; i++){
            fk[i] = new Faktorial17();
            System.out.println("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
         }
         long startTimeBF = System.currentTimeMillis();
         System.out.println("========================================================");
         System.out.println("Hasil faktorial dengan Brute Force ");
         for (int i = 0; i < elemen; i++) {
             System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].FaktorialBF(fk[i].nilai));
         }
         long endTimeBF = System.currentTimeMillis();
         double executionTimeBF = (endTimeBF - startTimeBF) / 1000.0;
         System.out.println("Waktu eksekusi Brute Force: " + executionTimeBF + " detik");

       System.out.println("============================================");
       System.out.println("Hasil faktorial dengan Brute Force");
       for (int i = 0; i < elemen; i++) {
        System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].FaktorialBF(fk[i].nilai));
       }
       System.out.println("============================================");
       System.out.println("Hasil Faktorial dengan Devide dan Conquer");
       for (int i = 0; i < elemen; i++) {
        System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].FaktorialDC(fk[i].nilai));
       }
       System.out.println("==============================================");
    }
    
}
