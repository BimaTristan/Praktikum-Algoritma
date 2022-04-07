package Percobaan;

import java.util.Scanner;

public class MahasiswaMainEdit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhsEdit data = new PencarianMhsEdit();
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();
        Mahasiswa[] x = new Mahasiswa[jumMhs];
        data.listMhs = x;

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil :");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("____________________________________________");
        System.out.println("____________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);

        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("===================================");
        System.out.println("menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);

        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}