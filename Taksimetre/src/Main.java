import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        double acilisUcreti = 10, kmUcreti = 2.20, tutar, km;

        // Girdi
        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen km'yi giriniz : ");
        km = input.nextDouble();

        // Hesaplar
        tutar = acilisUcreti + kmUcreti * km;
        tutar = (tutar >= 20) ? tutar : 20;

        // Çıktı
        System.out.println("Ödenecek tutar : " + tutar + " TL");
    }
}