import java.util.Scanner;

public class Latihan5 {

    // Method hitung total
    static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }

    // Method filter nilai di atas rata-rata
    static int[] filterDiAtasRataRata(int[] data) {
        double rataRata = (double) hitungTotal(data) / data.length;

        int[] sementara = new int[data.length];
        int jumlah = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                sementara[jumlah] = nilai;
                jumlah++;
            }
        }

        // Salin ke array akhir dengan saiz yang tepat
        int[] hasil = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            hasil[i] = sementara[i];
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa banyak nilai? ");
        int jumlah = scanner.nextInt();
        int[] data = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        System.out.println("\nTotal: " + total);
        System.out.printf("Rata-rata: %.2f\n", rataRata);

        int[] diAtasRataRata = filterDiAtasRataRata(data);
        System.out.print("Nilai di atas rata-rata: ");
        for (int n : diAtasRataRata) {
            System.out.print(n + " ");
        }
        System.out.println();

        scanner.close();
    }
}