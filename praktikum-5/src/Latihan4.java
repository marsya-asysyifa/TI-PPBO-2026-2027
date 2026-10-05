import java.util.Scanner;

public class Latihan4{

    // Method cari nilai minimum
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int nilai : data) {
            if (nilai < min) {
                min = nilai;
            }
        }
        return min;
    }

    // Method cari nilai maksimum
    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa banyak nilai ujian? ");
        int jumlah = scanner.nextInt();
        int[] nilaiUjian = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiUjian[i] = scanner.nextInt();
        }

        System.out.println("\nNilai Minimum: " + cariNilaiMinimum(nilaiUjian));
        System.out.println("Nilai Maksimum: " + cariNilaiMaksimum(nilaiUjian));

        scanner.close();
    }
}