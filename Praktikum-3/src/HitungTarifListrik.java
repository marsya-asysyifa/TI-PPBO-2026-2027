import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double TARIF_450 = 415.0;
        final double TARIF_900 = 1352.0;
        final double TARIF_1300 = 1444.70;
        final double TARIF_2200 = 1444.70;
        final double TARIF_DIATAS_2200 = 1700.0;

        System.out.println("=== PROGRAM HITUNG TARIF LISTRIK ===");
        System.out.println("Pilihan Golongan Daya:");
        System.out.println("1. 450 VA");
        System.out.println("2. 900 VA");
        System.out.println("3. 1300 VA");
        System.out.println("4. 2200 VA");
        System.out.println("5. Di atas 2200 VA");

        System.out.print("Masukkan pilihan golongan (1-5): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        double kwh = input.nextDouble();

        // 4) Validasi menggunakan operator logika
        if (kwh <= 0) {
            System.out.println("Error: Jumlah pemakaian kWh tidak boleh negatif atau nol!");
        } else {
            double tarifPerKwh = 0;
            String namaGolongan = "";
            boolean pilihanValid = true;

            // 3) Menentukan tarif berdasarkan golongan
            switch (pilihan) {
                case 1:
                    tarifPerKwh = TARIF_450;
                    namaGolongan = "450 VA";
                    break;
                case 2:
                    tarifPerKwh = TARIF_900;
                    namaGolongan = "900 VA";
                    break;
                case 3:
                    tarifPerKwh = TARIF_1300;
                    namaGolongan = "1300 VA";
                    break;
                case 4:
                    tarifPerKwh = TARIF_2200;
                    namaGolongan = "2200 VA";
                    break;
                case 5:
                    tarifPerKwh = TARIF_DIATAS_2200;
                    namaGolongan = "Di atas 2200 VA";
                    break;
                default:
                    System.out.println("Error: Pilihan golongan tidak valid!");
                    pilihanValid = false;
                    break;
            }

            if (pilihanValid) {
                double totalTagihan = kwh * tarifPerKwh;

                // 5) Menampilkan hasil akhir dengan format rapi
                System.out.println("\n=== RINCIAN TAGIHAN LISTRIK ===");
                System.out.println("Golongan Daya     : " + namaGolongan);
                System.out.printf("Jumlah Pemakaian  : %.2f kWh\n", kwh);
                System.out.printf("Tarif per kWh     : Rp %.2f\n", tarifPerKwh);
                System.out.println("--------------------------------");
                System.out.printf("TOTAL TAGIHAN     : Rp %.2f\n", totalTagihan);
                System.out.println("================================");
            }
        }

        input.close();
    }
}