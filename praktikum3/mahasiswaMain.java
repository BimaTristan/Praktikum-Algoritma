public class mahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[3];

        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            mhs[i].input();
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasisswa ke-" + (i + 1));
            mhs[i].tampil();
        }
    }
}