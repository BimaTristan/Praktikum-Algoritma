import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        Movie data = new Movie();
        System.out.print("Masukkan jumlah movie :");
        int juMhs = s.nextInt();
        Movie[] input = new Movie[juMhs];
        data.listMovie = input;

        System.out.println("-------------------------");
        System.out.println("Masukkan data film!");
        for (int i = 0; i < juMhs; i++) {
            System.out.println("---------------------");
            System.out.println("ID\t : ");
            int id = s.nextInt();
            System.out.println("Judul\t :");
            String nama = sl.nextLine();
            System.out.println("Tahun\t : ");
            int tahun = s.nextInt();
            System.out.println("Rating\t : ");
            double rating = s.nextDouble();

            Movie m = new Movie(id, nama, tahun, rating);
            data.tambah(m);
        }

        System.out.println("--------------------------------------");
        System.out.println("Data keseluruhan Film : ");
        data.tampil();

        System.out.println("______________________________________");
        System.out.println("______________________________________");

        System.out.println("Data setelah diurutkan menggunakan bubble sort (DESC): ");
        data.bubbleSort();
        data.tampil();

        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan rating film yang dicari: ");
        System.out.println("rating : ");
        double cari = s.nextDouble();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        s.close();
        sl.close();
    }
}