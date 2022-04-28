package Tugas;

public class Tugas2Queue {
    int max, size, front, rear;
    Tugas2Mahasiswa[] antrian;

    public Tugas2Queue(int n) {
        max = n;
        antrian = new Tugas2Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan : " + antrian[front].nama + " " + antrian[front].nim + " "
                    + antrian[front].absen + " " + antrian[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen yang belakang : " + antrian[rear].nama + " " + antrian[rear].nim + " "
                    + antrian[rear].absen + " " + antrian[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(
                        antrian[i].nama + " " + antrian[i].nim + " " + antrian[i].absen + " " + antrian[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].nim + " " + antrian[i].absen + " " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(Tugas2Mahasiswa dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Tugas2Mahasiswa dequeue() {
        Tugas2Mahasiswa dt = new Tugas2Mahasiswa();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekPosition(String nim) {
        int i = front;
        boolean j = true;
        while (j) {
            if (nim.equals(this.antrian[i].nim)) {
                System.out.println("data " + antrian[i].nim + " ada di index ke-" + i);
                j = false;
            }
            i++;
        }
    }

    public void printTugas2Mahasiswa(int posisi) {
        int i = front;
        boolean j = true;
        while (j) {
            if (posisi == i) {
                System.out.println("data pada index ke - " + i + " adalah " + this.antrian[i].nim + " "
                        + this.antrian[i].nama + " " + this.antrian[i].absen + " " + this.antrian[i].ipk);
                j = false;
            }
            i++;
        }
    }
}