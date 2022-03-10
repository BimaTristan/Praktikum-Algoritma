package Percobaan;

import java.util.Scanner;

public class arrayObjectModif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang Elemen: ");
        int n = sc.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[n];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan nilai panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan nilai lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }
}