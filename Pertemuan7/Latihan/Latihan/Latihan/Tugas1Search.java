package Latihan;

public class Tugas1Search {
    Tugas1 listMhs[];
    int idx;

    void tambah(Tugas1 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for (Tugas1 m : listMhs) {
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length; i++) {
            int idxMin = 1;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].nim < listMhs[idxMin].nim) {
                    idxMin = j;
                }
            }
        }
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data\t : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].nim) {
                return (mid);
            } else if (listMhs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}