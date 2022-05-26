package Tugas;

import java.util.Scanner;

public class vaksinMain {
    public static void menu() {
        System.out.println("====================");
        System.out.println("Pengantri Vaksin Extravaganza");
        System.out.println("====================");
        System.out.println("1. Tambah data penerima vaksin");
        System.out.println("2. Hapus data pengantri vaksin");
        System.out.println("3. Daftar penerima vaksin");
        System.out.println("4. Keluar");
        System.out.println("====================");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int pilih;

        vaksin v = new vaksin();

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            System.out.println("===================");
            try {
                switch (pilih) {
                    case 1:
                        System.out.println("===============");
                        System.out.println("Masukkan penerima vaksin: ");
                        System.out.print("No. antri: ");
                        int no = sc.nextInt();
                        System.out.print("Nama penerima: ");
                        String nama = s.nextLine();
                        v.addLast(no, nama);
                        System.out.println("===========");
                        break;
                    case 2:
                        v.removeFirst();
                        v.print();
                        break;
                    case 3:
                        v.print();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                }
            } catch (Exception E) {

            }
        } while (pilih <= 4 || pilih >= 1);

        sc.close();
        s.close();
    }
}
