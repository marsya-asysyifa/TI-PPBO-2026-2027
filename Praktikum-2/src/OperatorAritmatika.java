import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan bulat kedua: ");
        int b = input.nextInt();

        System.out.println("\n--- Hasil Aritmatika ---");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + ((double) a / b)); // Cast ke double agar pembagian presisi
        System.out.println(a + " % " + b + " = " + (a % b));

        System.out.println("\n--- Hasil Perbandingan (Boolean) ---");
        System.out.println(a + " > " + b + " : " + (a > b));
        System.out.println(a + " < " + b + " : " + (a < b));
        System.out.println(a + " == " + b + " : " + (a == b));

        input.close();
    }
}
