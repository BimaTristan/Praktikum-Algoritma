package Tugas;

public class Film {
    nodeFilm head;
    int size;

    public Film() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String id, String judul, double rating) {
        if (isEmpty()) {
            head = new nodeFilm(null, id, judul, rating, null);
        } else {
            nodeFilm newNode = new nodeFilm(null, id, judul, rating, null);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            nodeFilm current = head;
            while (current.next != null) {
                current = current.next;
            }
            nodeFilm newNode = new nodeFilm(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String id, String judul, double rating, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index film diluar batas");
        } else {
            nodeFilm current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                nodeFilm newNode = new nodeFilm(null, id, judul, rating, current);
                current.prev = newNode;
                head = newNode;
            } else {
                nodeFilm newNode = new nodeFilm(current.prev, id, judul, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            nodeFilm tmp = head;
            while (tmp != null) {
                System.out.println("ID: " + tmp.id);
                System.out.println(" Judul Film: " + tmp.judul);
                System.out.println(" Rating Film: " + tmp.rating);
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println("Sisa Film: " + size);
        } else {
            System.out.println("Linked list film kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list film masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list film masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        nodeFilm current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks film diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            nodeFilm current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
        size--;
    }

    public void bubbleSort() {
        nodeFilm current = null, index = null;
        double tmp;
        String temp;
        if (isEmpty()) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.rating < index.rating) {
                        tmp = current.rating;
                        current.rating = index.rating;
                        index.rating = tmp;
                        temp = current.id;
                        current.id = index.id;
                        index.id = temp;
                        temp = current.judul;
                        current.judul = index.judul;
                        index.judul = temp;
                    }
                }
            }
        }
    }

    public void searching(String cari) {
        int i = 0;
        boolean flag = false;
        nodeFilm current = head;

        if (head == null) {
            System.out.println("List film kosong");
            return;
        }
        while (current != null) {
            if (current.id.equalsIgnoreCase(cari)) {
                flag = true;
                break;
            }
            current = current.next;
            i++;
        }
        if (flag) {
            System.out.println("ID: " + cari + " ditemukan di indeks ke-" + i);
        } else {
            System.out.println("Film tidak ada di list");
        }
    }
}
