package Tugas;

public class Film {
    String id, judul, tahun, director;

    public Film(String id, String judul, String tahun, String director) {
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }

    public String toString() {
        return "FILM {Id Film= " + id + ", Judul FIlm= " + judul + ", Tahun Tayang= " + tahun + ", Director= "
                + director + "}";
    }
}