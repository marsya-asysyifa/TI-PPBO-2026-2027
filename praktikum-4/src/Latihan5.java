import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Masukkan " + n + " bilangan:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        //nilai terbesar kedua
        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > terbesar) {
                terbesarKedua = terbesar;
                terbesar = arr[i];
            } else if (arr[i] > terbesarKedua && arr[i] != terbesar) {
                terbesarKedua = arr[i];
            }
        }

        if (terbesarKedua == Integer.MIN_VALUE) {
            System.out.println("Tidak ada nilai terbesar kedua (semua elemen sama).");
        } else {
            System.out.println("Nilai terbesar kedua: " + terbesarKedua);
        }
        input.close();
    }
}