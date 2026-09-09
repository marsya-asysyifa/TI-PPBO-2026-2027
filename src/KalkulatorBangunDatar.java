import java.util.Scanner;
public class KalkulatorBangunDatar {
    public static void main(String[] args) {

        //membuat objek scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        //persegi panjang
        //meminta pengguna memasukkan panjang persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        //meminta pengguna memasukkan lebar persegi panjang
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        //menghitung luas persegi panjang ( rumus : panjang x lebar )
        double LuasPersegiPanjang = panjang * lebar;

        //menghitung keliling persegi panjang ( rumus : 2 x (panjang x lebar)
        double KelilingPersegiPanjang = panjang * LuasPersegiPanjang;

        //menampilkan hasil perhitungan persegi panjang
        System.out.println("\nPERSEGI PANJANG");
        System.out.println("Luas Persegi Panjang: " + LuasPersegiPanjang);
        System.out.println("keliling Persegi Panjang: " + KelilingPersegiPanjang);

        //menyimpan hasil luas ke dalam variabel boolean
        //luasbesar bernilai true jika luas > 100, false jika sebaiknya
        boolean LuasBesar = LuasPersegiPanjang > 100;

        //menampilkan nilai boolean LuasBesar
        System.out.println("Luas Besar > 100?: " + LuasBesar);

        //LINGKARAN
        //meminta pengguna memasukkan jari" lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jarijari = input.nextDouble();

        //menghitung luas lingkaran (rumus: PI x r x r)
        double LuasLingkaran = Math.PI * jarijari * jarijari;

        //menghitung keliling lingkaran (rumus: 2 x PI x r)
        double KelilingLingkaran = 2 * Math.PI * jarijari;

        //menampilkan hasil perhitungan lingkaran
        System.out.println("\nLINGKARAN");
        System.out.println("Luas Lingkaran: " + LuasLingkaran);
        System.out.println("Keliling lingkaran: " + KelilingLingkaran);

        //menutup objek scanner utk menghindari kebocoran resource
        input.close();

    }
}
