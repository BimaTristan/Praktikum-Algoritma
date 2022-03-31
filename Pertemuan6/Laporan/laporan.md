# Nama        = Muhammad farhan Riza Putra
# Kelas/absen = TI - 1F / 21

## Jobsheet 6

**5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort**

```java
package percobaan;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nama        = " + nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("Umur        = " + umur);
        System.out.println("IPK         = " + ipk);
    }
}
```

```java
package percobaan;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
```

```java
package percobaan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
```

**5.2.3 Pertanyaan**

1. Terdapat di method apakah proses bubble sort?
    > Terdapat di method void bubbleSort()

2. Terdapat di method apakah proses selection sort?

    > Terdapat di method void selectionSort()

3. Apakah yang dimaksud proses swap? Tuliskan potongan program untuk melakukanproses swap tersebut!

    > Swap adalah pertukaran
    ```java
      Mahasiswa tmp = listMhs[j];
    listMhs[j] = listMhs[j-1]; //listMhs[j-1[ KOSONG
    listMhs[j-1] = tmp;
    ```
    ```java
      Mahasiswa tmp = listMhs[idxMin];
    listMhs[idxMin] = listMhs[i];
    listMhs[i] = tmp;
    ```

4. Di dalam method bubbleSort(), terdapat baris program seperti dibawah ini:
<img src = "image/pertanyaan1.png">
   Untuk apakah proses tersebut?

    > program diatas digunakan untuk proses swap atau penukaran(BubbleSort), dibuat agar tidak serta merta menukar
5. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
<img src = "image/pertanyaan2.png">

> a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?

    > Outer i, Berfungsi agar pengurutan terus berjalan hingga semua terurut

    > Inner j, Berfungsi melakukan pertukaran nilai secara terus menerus hingga urut

> b. Mengapa syarat dari perulangan i adalah i < listMhs.length-1 ?

    Karena yang diminta untuk di outputkan di data itu berjumlah 4, jadi karena length atau panjang dari mahasiswanya 5 maka perlu dikurangi 1 agar outputnya bisa 4.

> c. Mengapa syarat dari perulangan j adalah j\<listMhs.length-i ?

    agar batas dari perulangan j (perulangan dalam) memiliki rentang panjang sejumlah panjang array listMhs dikurangi i ketika melakukan swapping / penukaran nilai dari array listMhs agar bisa urut.

> d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa tahap bubble sort yang ditempuh?

    perulangan i akan berlangsung sebanyak 49 kali dan begitu juga dengan tahap bubble sortnya.
  
  
  **5.3 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort**

  ```java
  package percobaan;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nama        = " + nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("Umur        = " + umur);
        System.out.println("IPK         = " + ipk);
    }
}
```

```java
package percobaan;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
```

```java
package percobaan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
```

**5.3.3.** **Pertanyaan**

Di dalam method selection sort, terdapat baris program seperti dibawah ini:

<img src = "image/pertanyaan3.PNG">
Untuk apakah proses tersebut, jelaskan!

>- int idxMin = i digunakan untuk data pada index ke i; 
>- for(int j=i+1; j<listMhs.length; j++)  digunakan untuk startnya disebelahnya i atau data setelahnya i hingga akhir;
>- if(listMhs[j].ipk < listMhs[idxMin].ipk) digunakan untuk membandingkan apakah nilai idxMin lebih besar dari listMhs[j];**
>- idxMin = j; digunakan untuk j menjadi nilai baru dari idxMin.

<br>

**5.3 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort**

```java
package percobaan;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nama        = " + nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("Umur        = " + umur);
        System.out.println("IPK         = " + ipk);
    }
}
```

```java
package percobaan;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
```

```java
package percobaan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
```

**5.4.3 Pertanyaan**

1. Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara ascending atau decending, anda dapat melakukannya dengan menambahkan parameter pada pemanggilan fungsi insertionSort.

> class DaftarMahasiswaBerprestasi
```java
    void insertionSort(boolean asc){
        for(int i = 1; i < listMhs.length; i++){
            Mahasiswa temp = listMhs[i];
            int j = i;
            
            if(asc){
            while (j > 0 && listMhs[j-1].ipk > temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            }else {
                
            while (j > 0 && listMhs[j-1].ipk < temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }      
            listMhs[j] = temp;
        }
    }
}
```
> class mainMahasiswa
```java
System.out.println("Data Mahasiswa Setelah Insertion Sorting Asc Berdasarkan IPK"); //asc = kecil ke besar
list.insertionSort(true);
list.tampil();
```
```java
System.out.println("Data Mahasiswa Setelah Insertion Sorting Desc Berdasarkan IPK"); //desc = besar ke kecil
list.insertionSort(false);
list.tampil();
```

**5.5 Latihan Praktikum**

Sebuah yang bergerak dalam bidang penjualan tiket pesawat sedang mengembangkan backend untuk sistem pemesanan tiket, salah satu fiturnya adalah menampilkan daftar tiket yang tersedia berdasarkan pilihan filter yang diinginkan user. Daftar tiket ini harus dapat di sorting berdasarkan harga dimulai dari harga termurah ke harga tertinggi. Implementasikanlah class diagram berikut ini kedalam bahasapemrograman java kemudian buatlah proses sorting data untuk harga tiket menggunakan algoritma **bubble sort** dan **selection sort**.

<img src = "Image/pertanyaan4.png">

<br>

> class latihanTiket
```java
  package latihan;

public class tiket {
    String maskapai, asal, tujuan;
    int harga;

    tiket(String m, int h, String a, String t) {
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }

    void tampilAll() {
        System.out.println("              Soekarno-Hatta International Airport            ");
        System.out.println("==============================================================");
        System.out.println("Carrier\t\t\t : " + maskapai);
        System.out.println("Price\t\t\t : Rp." + harga);
        System.out.println("Departure from\t\t : " + asal);
        System.out.println("Arrival to\t\t : " + tujuan);
        System.out.println("==============================================================");
    }
}
```

> class latihanSistemTiket
```java
package latihan;

public class tiketService {
    tiket tikets[] = new tiket[4];
    int index;

    // method tambah
    void tambah(tiket t) {
        if (index < tikets.length) {
            tikets[index] = t;
            index++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    // method tampil
    void tampilAll() {
        for (tiket t : tikets) {
            t.tampilAll();
        }
    }

    // method bubble short()
    void bubbleSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            for (int j = 1; j < tikets.length - i; j++) {
                if (tikets[j].harga < tikets[j - 1].harga) {
                    // proses swap bubble short
                    tiket tmp = tikets[j];
                    tikets[j] = tikets[j - 1];
                    tikets[j - 1] = tmp;
                }
            }
        }
    }

    // method selection short
    void selectionShort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < tikets.length; j++) {
                if (tikets[j].harga > tikets[indexMin].harga) {
                    indexMin = j;
                }
            }
            // proses swap selection short
            tiket tmp = tikets[indexMin];
            tikets[indexMin] = tikets[i];
            tikets[i] = tmp;
        }
    }
}
```

> class latihanMainTiket
```java
package latihan;

public class mainTiket {
    public static void main(String[] args) {
        tiketService daftar = new tiketService();
        tiket t1 = new tiket("GARUDA INDONESIA", 1700000, "CGK - Soekarno Hatta", "DPS - Ngurah Rai");
        tiket t2 = new tiket("SINGAPORE AIRLINES", 3000000, "CGK - Soekarno Hatta", "SIN - Changi");
        tiket t3 = new tiket("CITILINK", 1200000, "CGK - Soekarno Hatta", "SUB - Juanda");
        tiket t4 = new tiket("BATIK AIR", 1300000, "CGK - Soekarno Hatta", "KNO - Kualanamu");

        daftar.tambah(t1);
        daftar.tambah(t2);
        daftar.tambah(t3);
        daftar.tambah(t4);

        System.out.println("--------------------------------------------------------------");
        System.out.println("                      DATA SEBELUM SORTING                    ");
        System.out.println("--------------------------------------------------------------");
        daftar.tampilAll();

        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("  DAFTAR HARGA SETELAH SORTING (ASC) MENGGUNAKAN BUBBLE SORT  ");
        System.out.println("--------------------------------------------------------------");
        daftar.bubbleSort();
        daftar.tampilAll();

        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println(" DAFTAR HARGA SETELAH SORTING (DSC) MENGGUNAKAN SELECTION SORT");
        System.out.println("--------------------------------------------------------------");
        daftar.selectionShort();
        daftar.tampilAll();
    }
}
```


