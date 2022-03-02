import java.util.Scanner;

public class bangunRuang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan banyak kubus : ");
        int k = sc.nextInt();
        int s;
        kubus[] kbArray = new kubus[k];
        System.out.println("-----------------------");
        for (int i = 0; i < kbArray.length; i++) {
            System.out.print("Masukan sisi ke-" + (i + 1) + ": ");
            s = sc.nextInt();
            kbArray[i] = new kubus(s);
        }
        for (int i = 0; i < kbArray.length; i++) {
            System.out.println();
            System.out.println("Kubus ke - " + (i + 1));
            System.out.println("Sisi : " + kbArray[i].sisi);
            System.out.println("Volume ke-" + (i + 1) + ": " + kbArray[i].volume());
            System.out.println("Luas permukaan ke-" + (i + 1) + ": " + kbArray[i].luasPermukaan());
        }
        System.out.println();
        System.out.println("Masukan banyak balok : ");
        int b = sc.nextInt();
        int p, l, t;
        balok[] bArray = new balok[b];
        System.out.println("------------------------");
        for (int i = 0; i < bArray.length; i++) {
            System.out.print("Masukan panjang " + (i + 1) + ": ");
            p = sc.nextInt();
            System.out.print("Masukan lebar " + (i + 1) + ": ");
            l = sc.nextInt();
            System.out.print("Masukan tinggi " + (i + 1) + ": ");
            t = sc.nextInt();
            bArray[i] = new balok(p, l, t);
        }
        for (int i = 0; i < bArray.length; i++) {
            System.out.println();
            System.out.println("Balok ke - " + (i + 1));
            System.out.println("Panjang : " + bArray[i].panjang);
            System.out.println("Lebar : " + bArray[i].lebar);
            System.out.println("Tinggi : " + bArray[i].tinggi);
            System.out.println("Volume ke- " + (i + 1) + ": " + bArray[i].volume());
            System.out.println("Luas perukaan ke- " + (i + 1) + ": " + bArray[i].luasPermukaan());
        }
        System.out.println();
        System.out.print("Masukan banyak bola : ");
        int bo = sc.nextInt();
        int r;
        bola[] boArray = new bola[bo];
        System.out.println("---------------------");
        for (int i = 0; i < boArray.length; i++) {
            System.out.print("Masukan jari-jari " + (i + 1) + ": ");
            r = sc.nextInt();
            boArray[i] = new bola(r);
        }
        for (int i = 0; i < boArray.length; i++) {
            System.out.println();
            System.out.println("Bola ke - " + (i + 1));
            System.out.println("Jari-jari : " + boArray[i].jari);
            System.out.println("Volume ke - " + (i + 1) + ": " + boArray[i].volume());
            System.out.println("Luas permukaan ke - " + (i + 1) + ": " + boArray[i].luasPermukaan());
        }
        System.out.println();
    }
}