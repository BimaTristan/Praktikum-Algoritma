public class kubus {
    public int sisi;

    public kubus(int s) {
        sisi = s;
    }

    public int volume() {
        return sisi * sisi * sisi;
    }

    public int luasPermukaan() {
        return 6 * (sisi * sisi * sisi);
    }
}