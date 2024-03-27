package Jobsheet6;

public class Main17 {
    public static void main(String[] args) {
        
    DaftarMahasiswaBerprestasi17 list = new DaftarMahasiswaBerprestasi17();
    Mahasiswa17 m1 = new Mahasiswa17 ("Nusa", 2017, 25, 3);
    Mahasiswa17 m2 = new Mahasiswa17 ("Rara", 2012, 19, 4);
    Mahasiswa17 m3 = new Mahasiswa17 ("Dompu", 2018, 19, 3.5);
    Mahasiswa17 m4 = new Mahasiswa17 ("Abdul", 2017, 23, 2);
    Mahasiswa17 m5 = new Mahasiswa17 ("Ummi", 2019, 21, 3.75);

    list.tambah (m1);
    list.tambah (m2);
    list.tambah (m3);
    list.tambah (m4);
    list.tambah (m5);

    System.out.println("Data mahasiswa sebelum sorting = ");
    list.tampil();

    System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
    list.bubbleSort();
    list.tampil();

    System.out.println("Data Mahasiswa Setelah Sorting asc Berdasarkan Ipk");
    list.selectionSort();
    list.tampil();

    System.out.println("Data Mahasiswa Setelah Sorting asc Berdasarkan Ipk");
    list.insertionSort();
    list.tampil();
    }
}
