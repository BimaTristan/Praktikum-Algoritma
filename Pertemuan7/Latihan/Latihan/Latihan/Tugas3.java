package Latihan;

public class Tugas3 {
    public int[] data;
    public int maks = 0;
    public int posisi;
    public int jumlah = 0;

    Tugas3(int nilai[]) {
        data = nilai;
    }

    void tampil() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    void bubbleSort() {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j] > data[j - 1]) {
                    int tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
    }

    public int searching(int cari, int kiri, int kanan) {
        int mid;
        if (kanan >= kiri) {
            mid = (kiri + kanan) / 2;
            if (cari == data[mid]) {
                return (mid);
            } else if (data[mid] > cari) {
                return searching(cari, mid + 1, kanan);
            } else {
                return searching(cari, kiri, mid - 1);
            }
        }
        return -1;
    }

    public int nilaiTerbesar() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] > maks) {
                maks = data[i];
            }
        }
        System.out.println("Nilai terbesar adalah\t\t: " + maks);
        return maks;
    }

    public void tampilPosisi(int pos) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == maks) {
                jumlah++;
            }
        }
        System.out.println("Yang Berjumlah\t\t\t: " + jumlah + " Bilangan");
        System.out.println();
        posisi = maks;
        for (int i = 0; i < data.length; i++) {
            if (posisi == data[i]) {
                pos = i;
                System.out.println("Data Ditemukan pada Indeks ke-\t: " + pos);
            }
        }
    }
}