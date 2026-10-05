public class Latihan3 {

    // Versi 1: Celsius ke Fahrenheit
    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Versi 2: Celsius ke Fahrenheit atau Kelvin
    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;
        } else if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else {
            System.out.println("Skala tidak dikenali!");
            return celsius;
        }
    }

    public static void main(String[] args) {
        System.out.println("30°C ke Fahrenheit (versi 1): " + konversiSuhu(30));

        System.out.println("30°C ke Fahrenheit (versi 2): " + konversiSuhu(30, "Fahrenheit"));
        System.out.println("30°C ke Kelvin (versi 2): " + konversiSuhu(30, "Kelvin"));
    }
}