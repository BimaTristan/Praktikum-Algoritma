package Latihan;

import java.util.Scanner;

public class Tugas1Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        Tugas1Search data = new Tugas1Search();
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();
        Tugas1[] x = new Tugas1[jumMhs];
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

            Tugas1 m = new Tugas1(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Data Mahasiswa Setelah sorting asc berdasarkan NIM");
        System.out.println("-------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();
        data.selectionSort();

        System.out.println("____________________________________");
        System.out.println("____________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();

        System.out.println("===================================");
        System.out.println("menggunakan Binary Search");
        int posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);

        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}