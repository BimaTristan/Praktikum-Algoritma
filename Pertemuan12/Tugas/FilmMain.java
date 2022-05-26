package Tugas;

import java.util.Scanner;

public class FilmMain {
    public static void menu() {
        System.out.println("====================");
        System.out.println("Data Film Layar Lebar");
        System.out.println("====================");
        System.out.println("1. Tambah data awal");
        System.out.println("2. Tambah data akhir");
        System.out.println("3. Tambah data indeks tertentu");
        System.out.println("4. Hapus data pertama");
        System.out.println("5. Hapus data terakhir");
        System.out.println("6. Hapus data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut data rating Film");
        System.out.println("10. Keluar");
        System.out.println("====================");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int pilihMenu, indeks;
        String cari;

        Film m = new Film();

        do {
            menu();
            pilihMenu = sc.nextInt();
            sc.nextLine();
            System.out.println("===================");
            try {
                switch (pilihMenu) {
                    case 1:
                        System.out.println("===============");
                        System.out.println("Masukkan ID Film: ");
                        String id = s.nextLine();
                        System.out.print("Masukkan Judul Film: ");
                        String judul = s.nextLine();
                        System.out.print("Masukkan Rating Film: ");
                        double rating = sc.nextDouble();
                        m.addFirst(id, judul, rating);
                        System.out.println("===========");
                        break;
                    case 2:
                        System.out.println("===============");
                        System.out.println("Masukkan ID Film: ");
                        id = s.nextLine();
                        System.out.print("Masukkan Judul Film: ");
                        judul = s.nextLine();
                        System.out.print("Masukkan Rating Film: ");
                        rating = sc.nextDouble();
                        m.addLast(id, judul, rating);
                        System.out.println("===========");
                        break;
                    case 3:
                        System.out.println("===============");
                        System.out.println("Masukkan indeks dimana Film dimasukkan: ");
                        indeks = sc.nextInt();
                        System.out.println("Masukkan ID Film: ");
                        id = s.nextLine();
                        System.out.print("Masukkan Judul Film: ");
                        judul = s.nextLine();
                        System.out.print("Masukkan Rating Film: ");
                        rating = sc.nextDouble();
                        m.add(id, judul, rating, indeks);
                        System.out.println("===========");
                        break;
                    case 4:
                        m.removeFirst();
                        System.out.println("Data Film Pertama telah dihapus");
                        break;
                    case 5:
                        m.removeLast();
                        System.out.println("Data Film Terakhir telah dihapus");
                        break;
                    case 6:
                        System.out.print("Masukkan indeks data Film yang ingin dihapus: ");
                        indeks = sc.nextInt();
                        m.remove(indeks);
                        break;
                    case 7:
                        m.print();
                        break;
                    case 8:
                        System.out.print("Masukkan ID Film yang ingin dicari: ");
                        cari = s.nextLine();
                        m.searching(cari);
                        break;
                    case 9:
                        m.bubbleSort();
                        m.print();
                        break;
                    case 10:
                        System.exit(0);
                        break;

                }
            } catch (Exception E) {

            }

        } while (pilihMenu <= 10 || pilihMenu >= 1);

        sc.close();
        s.close();
    }
}