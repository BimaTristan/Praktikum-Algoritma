package Latihan;

import java.util.Scanner;

public class Tugas2Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        Tugas2Search data = new Tugas2Search();
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();
        Tugas2[] x = new Tugas2[jumMhs];
        data.listMhs = x;

        System.out.println("-----------------------------");
        System.out.println("Masukkan Data Mahasiswa :");
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

            Tugas2 m = new Tugas2(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-----------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("____________________________________");
        System.out.println("____________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cari = sl.nextLine();

        System.out.println("===================================");
        System.out.println("menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);

        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}