import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int KKM = 70;

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int n = input.nextInt();

        int[] nilai = new int[n];

        System.out.println("\nMasukkan nilai ujian masing-masing mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        int total = 0;
        int tertinggi = nilai[0];
        int terendah  = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;


        for (int i = 0; i < n; i++) {
            total += nilai[i];
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        double rataRata = (double) total / n;
        int[] nilaiSebelum = new int[n];
        for (int i = 0; i < n; i++) {
            nilaiSebelum[i] = nilai[i];
        }

        //Bubble Sort (ascending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    // Tukar posisi
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("Jumlah mahasiswa      : " + n);
        System.out.println("KKM                   : " + KKM);

        System.out.println("\nNilai rata-rata       : " + String.format("%.2f", rataRata));
        System.out.println("Nilai tertinggi       : " + tertinggi);
        System.out.println("Nilai terendah        : " + terendah);

        System.out.println("\nJumlah mahasiswa LULUS         : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa TIDAK LULUS   : " + jumlahTidakLulus);

        //array sebelum diurutkan
        System.out.print("\nNilai SEBELUM diurutkan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiSebelum[i] + " ");
        }
        System.out.println();

        //array setelah diurutkan
        System.out.print("Nilai SESUDAH diurutkan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }

        input.close();
    }
}