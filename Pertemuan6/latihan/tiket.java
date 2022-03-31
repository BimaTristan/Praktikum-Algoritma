package latihan;

public class tiket {
    String maskapai, asal, tujuan;
    int harga;

    tiket(String m, int h, String a, String t) {
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }

    void tampilAll() {
        System.out.println("              Soekarno-Hatta International Airport            ");
        System.out.println("==============================================================");
        System.out.println("Carrier\t\t\t : " + maskapai);
        System.out.println("Price\t\t\t : Rp." + harga);
        System.out.println("Departure from\t\t : " + asal);
        System.out.println("Arrival to\t\t : " + tujuan);
        System.out.println("==============================================================");
    }
}