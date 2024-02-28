import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int n, basDeg, toplam = 0;

        // Girdiler
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n = inp.nextInt();

        // Hesaplar
        while (n != 0) {
            basDeg = n % 10;
            toplam += basDeg;
            n /= 10;
        }

        // Çıktı
        System.out.println("Girilen sayının basmaklarındaki rakamların toplamı : " + toplam);
    }
}