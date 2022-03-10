package Percobaan;

public class segitiga {
    public int alas, tinggi;

    public segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return alas * tinggi / 2;
    }

    public int hitungKeliling() {
        return alas + alas + alas;
    }
}