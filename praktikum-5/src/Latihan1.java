public class Latihan1 {

    // Method luas persegi panjang
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    // Method luas lingkaran
    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        // Panggil kedua-dua method dengan beberapa nilai berbeda
        System.out.println("Luas Persegi Panjang (p=5, l=3): " + luasPersegiPanjang(5, 3));
        System.out.println("Luas Persegi Panjang (p=10, l=7): " + luasPersegiPanjang(10, 7));

        System.out.println("Luas Lingkaran (r=7): " + luasLingkaran(7));
        System.out.println("Luas Lingkaran (r=14): " + luasLingkaran(14));
    }
}