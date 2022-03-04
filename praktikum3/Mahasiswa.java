import java.util.Scanner;

public class Mahasiswa {
    Scanner sc = new Scanner(System.in);
    String nama;
    int NIM;
    char kelamin;
    double ipk;

    void tampil() {
        System.out.println("nama : " + nama);
        System.out.println("nim : " + NIM);
        System.out.println("Jenis kelamin : " + kelamin);
        System.out.println("Nilai IPK : " + ipk);
    }

    void input() {
        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan nim : ");
        NIM = sc.nextInt();
        System.out.print("Masukkan jenis kelamin : ");
        kelamin = sc.next().charAt(0);
        System.out.print("Masukkan Nilai IPK : ");
        ipk = sc.nextDouble();
    }
}