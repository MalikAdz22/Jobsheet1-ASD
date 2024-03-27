public class MainHotel17 {
    public static void main(String[] args) {
        HotelService17 list = new HotelService17();
        Hotel17 m1 = new Hotel17("GoldenTulip", "Batu", 35000, (byte)5);
        Hotel17 m5 = new Hotel17("GrandMercure", "Malang", 29000, (byte)4);
        Hotel17 m2 = new Hotel17("RedDors", "Malang", 15000, (byte)1);
        Hotel17 m3 = new Hotel17("Dewarna", "Kediri", 25000, (byte)3);
        Hotel17 m4 = new Hotel17("Helios", "Kepanjen", 22000, (byte)2);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data hotel = ");
        list.tampilAll();

        System.out.println("Data hotel dengan filter harga termurah = ");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Data hotel dengan filter bintang tertinggi");
        list.selectionSort();
        list. tampilAll();

    }
}

