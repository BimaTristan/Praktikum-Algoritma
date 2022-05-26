package Tugas;

public class node {
    String nama;
    int no;
    node prev, next;

    node(node prev, int no, String nama, node next) {
        this.prev = prev;
        this.nama = nama;
        this.no = no;
        this.next = next;
    }
}
