import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int n, toplam = 0;

        // Scanner sınıfından input tanımlama
        Scanner input = new Scanner(System.in);

        //Hesaplar
        do {
            System.out.print("Bir Sayı Giriniz : ");
            n = input.nextInt();
            if (n % 4 == 0) {
                toplam += n;
            }
        } while (n % 2 == 0);

        // Çıktı
        System.out.println("Girilen sayılardan 4'ün katı olanların tolplamı : " + toplam);
    }
}