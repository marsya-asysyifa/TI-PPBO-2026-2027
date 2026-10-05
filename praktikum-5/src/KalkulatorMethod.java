import java.util.Scanner;

public class KalkulatorMethod {

    //Method Overloading dgn 2 parameter
    static double tambah(double a, double b) {
        return a + b;
    }

    //Method Overloading dgn 3 parameter
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak dibenarkan!");
            return 0;
        }
        return a / b;
    }

    static double pangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    static double akarKuadrat(double angka) {
        if (angka < 0) {
            System.out.println("Error: Akar kuadrat nombor negatif tidak sah!");
            return 0;
        }
        return Math.sqrt(angka);
    }

    static double riwayatKeMaksimum(double[] riwayatHasil) {
        if (riwayatHasil.length == 0) {
            return 0; // Jika belum ada riwayat
        }
        double max = riwayatHasil[0];
        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > max) {
                max = riwayatHasil[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] riwayatHasil = new double[1000];
        int jumlahRiwayat = 0; // Kiraan berapa banyak hasil telah disimpan

        int pilihan = 0;

        do {
            System.out.println("1. Tambah (2 angka)");
            System.out.println("2. Tambah (3 angka)");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi (0-7): ");

            pilihan = scanner.nextInt();
            double hasil = 0;
            boolean operasiDijalankan = true;

            // (b) Switch-case untuk memilih operasi
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b1 = scanner.nextDouble();
                    hasil = tambah(a1, b1); // Panggil method overload 2 param
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b2 = scanner.nextDouble();
                    System.out.print("Masukkan angka ketiga: ");
                    double c2 = scanner.nextDouble();
                    hasil = tambah(a2, b2, c2); // Panggil method overload 3 param
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b3 = scanner.nextDouble();
                    hasil = kurang(a3, b3);
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b4 = scanner.nextDouble();
                    hasil = kali(a4, b4);
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    double a5 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b5 = scanner.nextDouble();
                    hasil = bagi(a5, b5);
                    break;

                case 6:
                    System.out.print("Masukkan basis: ");
                    double basis = scanner.nextDouble();
                    System.out.print("Masukkan eksponen: ");
                    double eksponen = scanner.nextDouble();
                    hasil = pangkat(basis, eksponen);
                    break;

                case 7:
                    System.out.print("Masukkan angka: ");
                    double angka = scanner.nextDouble();
                    hasil = akarKuadrat(angka);
                    break;

                default:
                    System.out.println("Pilihan tidak sah! Sila cuba lagi.");
                    operasiDijalankan = false;
                    break;
            }

            if (operasiDijalankan) {
                System.out.println("Hasil: " + hasil);
                riwayatHasil[jumlahRiwayat] = hasil; // Simpan ke array
                jumlahRiwayat++; // Tambah kiraan
            }

        } while (pilihan != 0);

        if (jumlahRiwayat > 0) {
            double[] riwayatFinal = new double[jumlahRiwayat];
            for (int i = 0; i < jumlahRiwayat; i++) {
                riwayatFinal[i] = riwayatHasil[i];
            }

            double max = riwayatKeMaksimum(riwayatFinal);
            System.out.println("\nNilai terbesar yang pernah dihitung: " + max);
        } else {
            System.out.println("\nTiada operasi yang dijalankan.");
        }

        scanner.close();
    }
}