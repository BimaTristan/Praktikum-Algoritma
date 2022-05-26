package Tugas;

public class nodeFilm {
    String judul, id;
    double rating;
    nodeFilm prev, next;

    nodeFilm(nodeFilm prev, String id, String judul, double rating, nodeFilm next) {
        this.prev = prev;
        this.next = next;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }
}
