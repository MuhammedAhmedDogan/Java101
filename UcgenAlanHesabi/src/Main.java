import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        double a, b, c, u, alan;

        // Girdi
        Scanner girdi = new Scanner(System.in);
        System.out.println("1.Kenarı Giriniz (m) : ");
        a = girdi.nextDouble();
        System.out.println("2.Kenarı Giriniz (m) : ");
        b = girdi.nextDouble();
        System.out.println("3.Kenarı Giriniz (m) : ");
        c = girdi.nextDouble();

        // Hesaplar
        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // Çıktı
        System.out.println("Üçgenin alanı : " + alan + " metrekare");

    }
}