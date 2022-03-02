public class bola {
    public int jari;

    public bola(int r) {
        jari = r;
    }

    public double volume() {
        return (4 / 3) * 3.14 * (jari * jari * jari);
    }

    public double luasPermukaan() {
        return 4 * 3.14 * (jari * jari * jari);
    }
}