import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        double kilo, boy, indeks;

        // Girdiler
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen kilonuzu kg cinsinde giriniz : ");
        kilo = input.nextDouble();

        System.out.println("Lütfen boyunuzu metre cinsinde giriniz : ");
        boy = input.nextDouble();

        // Hesaplar
        indeks = kilo / (boy * boy);

        // Çıktı
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);
    }
}