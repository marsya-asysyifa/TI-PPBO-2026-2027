public class MethodDemo {
    // Method void: tidak mengembalikan nilai apa pun
    static void sapa() {
        System.out.println("Halo, selamat datang!");
    }

    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + " (" + umur + " tahun) - " + kota);
    }

    public static void main(String[] args) {
        sapa();
        sapa();
        sapa();

        // Panggil pada method main:
        sapa("Marsya");

        sapa("Nawra");


        // Panggil pada method main:
        tampilkanBiodata("Marsya", 19, "Lhokseumawe");
    }
}