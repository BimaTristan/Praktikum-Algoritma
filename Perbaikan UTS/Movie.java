public class Movie {

    int id, tahun;
    String nama;
    Double rating;

    Movie listMovie[];
    int idx;

    Movie() {
    }

    Movie(int i, String n, int t, Double r) {
        id = i;
        nama = n;
        tahun = t;
        rating = r;
    }

    void tampil() {
        for (Movie m : listMovie) {
            System.out.println("----------------------");
            System.out.println("ID : " + m.id);
            System.out.println("Judul : " + m.nama);
            System.out.println("Tahun : " + m.tahun);
            System.out.println("Rating : " + m.rating);
        }
    }

    void tambah(Movie m) {
        if (idx < listMovie.length) {
            listMovie[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    public int FindSeqSearch(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMovie.length; j++) {
            if (listMovie[j].rating == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void bubbleSort() {
        for (int i = 0; i < listMovie.length - 1; i++) {
            for (int j = 1; j < listMovie.length - i; j++) {
                if (listMovie[j].rating > listMovie[j - 1].rating) {
                    Movie tmp = listMovie[j];
                    listMovie[j] = listMovie[j - 1];
                    listMovie[j - 1] = tmp;
                }
            }
        }
    }

    public void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("tahun : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(double id, int pos) {
        if (pos != -1) {
            System.out.println("ID\t : " + listMovie[pos].id);
            System.out.println("Judul\t : " + listMovie[pos].nama);
            System.out.println("Tahun\t : " + listMovie[pos].tahun);
            System.out.println("Rating\t : " + listMovie[pos].rating);
        }
    }
}
