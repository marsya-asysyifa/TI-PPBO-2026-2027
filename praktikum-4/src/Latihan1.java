import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bilangan = input.nextInt();

        System.out.println("Tabel Perkalian " + bilangan + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(bilangan + " x " + i + " = " + (bilangan * i));
        }
        input.close();
    }
}
