package latihan;

public class mainTiket {
    public static void main(String[] args) {
        tiketService daftar = new tiketService();
        tiket t1 = new tiket("GARUDA INDONESIA", 1700000, "CGK - Soekarno Hatta", "DPS - Ngurah Rai");
        tiket t2 = new tiket("SINGAPORE AIRLINES", 3000000, "CGK - Soekarno Hatta", "SIN - Changi");
        tiket t3 = new tiket("CITILINK", 1200000, "CGK - Soekarno Hatta", "SUB - Juanda");
        tiket t4 = new tiket("BATIK AIR", 1300000, "CGK - Soekarno Hatta", "KNO - Kualanamu");

        daftar.tambah(t1);
        daftar.tambah(t2);
        daftar.tambah(t3);
        daftar.tambah(t4);

        System.out.println("--------------------------------------------------------------");
        System.out.println("                      DATA SEBELUM SORTING                    ");
        System.out.println("--------------------------------------------------------------");
        daftar.tampilAll();

        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("  DAFTAR HARGA SETELAH SORTING (ASC) MENGGUNAKAN BUBBLE SORT  ");
        System.out.println("--------------------------------------------------------------");
        daftar.bubbleSort();
        daftar.tampilAll();

        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println(" DAFTAR HARGA SETELAH SORTING (DSC) MENGGUNAKAN SELECTION SORT");
        System.out.println("--------------------------------------------------------------");
        daftar.selectionShort();
        daftar.tampilAll();
    }
}
