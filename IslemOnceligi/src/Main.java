import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int a, b, c, sonuc;

        // Girdi
        Scanner input = new Scanner(System.in);

        System.out.println("a sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("b sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("c sayısını giriniz : ");
        c = input.nextInt();

        // Hesaplar
        sonuc = a + b * c - b;


        // Çıktı
        System.out.println("a+b*c-b işleminin sonucu : " + a + "+" + b + "*" + c + "-" + b + " = " + sonuc);
    }
}