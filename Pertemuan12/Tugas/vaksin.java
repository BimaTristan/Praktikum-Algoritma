package Tugas;

public class vaksin {
    node head;
    int size;

    public vaksin() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            node tmp = head;
            System.out.println("===================");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("===================");
            System.out.println("|No\t|Nama\t|");
            while (tmp != null) {
                System.out.print("|" + tmp.no + "\t|" + tmp.nama + "\t|");
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println();
            System.out.println("Sisa antri: " + size);
            System.out.println();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int no, String nama) {
        if (isEmpty()) {
            head = new node(null, no, nama, null);
        } else {
            node newNode = new node(null, no, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int no, String nama) {
        if (isEmpty()) {
            addFirst(no, nama);
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            node newNode = new node(current, no, nama, null);
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
            System.out.println(head.nama + " Telah divaksin");
        } else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println(head.nama + " Telah divaksin");
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
}
