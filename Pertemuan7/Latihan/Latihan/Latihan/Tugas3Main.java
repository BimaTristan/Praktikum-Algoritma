package Latihan;

import java.util.Scanner;

public class Tugas3Main {
    public static void main(String[] args) {
        int bil[] = { 12, 17, 2, 1, 70, 50, 90, 17, 2, 90 };

        Tugas3 array = new Tugas3(bil);

        int jum = 10;
        int maks = 0;

        System.out.println("------------------------------------------------");
        System.out.println("tampil data sebelum disorting adalah");
        array.tampil();
        array.bubbleSort();
        System.out.println("--------------------------------------------------");
        System.out.println("tampil data setelah dishorting dengan bubble short");
        array.tampil();
        System.out.println("___________________________________________________");
        array.nilaiTerbesar();
        array.searching(maks, 0, jum - 1);
        array.tampilPosisi(maks);
    }
}