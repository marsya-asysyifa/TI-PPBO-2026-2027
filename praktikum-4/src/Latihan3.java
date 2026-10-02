import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Masukkan 10 bilangan: ");
        for (int i = 0; i <= 9; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        //menampilkan array terbalik
        System.out.println("\nArray dalam urutan terbalik: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
    }
    System.out.println();
    input.close();
    }
}