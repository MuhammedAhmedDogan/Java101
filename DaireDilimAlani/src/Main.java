import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        double r, a, alan;

        // Girdi
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz (m) : ");
        r = input.nextDouble();
        System.out.println("Daire diliminin merkez açısını giriniz : ");
        a = input.nextDouble();

        // Hesaplar
        alan = 3.14 * r * r * a / 360;

        // Çıktı
        System.out.println("Daire diliminin alanı : " + alan + " metrekaredir.");
    }
}