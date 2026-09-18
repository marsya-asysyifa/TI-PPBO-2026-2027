import java.util.Scanner;

public class HargaTiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah anda mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        int hargaTiket = 50000; //harga dasar

        if (mahasiswa && umur < 25) {
            hargaTiket = 30000; //harga khusus
            System.out.println("Anda mendapatkan harga khusus! ");
        } else if (umur > 12) {
            hargaTiket = 25000;
            System.out.println("Harga Tiket anak-anak: ");
        } else {
            System.out.println("Harga Tiket reguler: ");
        }
        System.out.print("Total harga tiket: Rp " + hargaTiket);
        input.close();
    }
}
