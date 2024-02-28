import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        double age, km, ticket, price, a, b;

        // Girdiler
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextDouble();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextDouble();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        ticket = input.nextDouble();

        // Hesaplamalar ve Çıktı
        if ((km > 0) && (age > 0) && ((ticket == 1) || (ticket == 2))) {
            price = (ticket == 1) ? km * 0.1 : 2 * km * 0.1;
            a = (age < 12) ? 0.5 : (age <= 24) ? 0.1 : (age >= 65) ? 0.3 : 0;
            b = (ticket == 1) ? 0 : 0.2;

            // Burada iki adet çıktı verdim. İlk sonuç açıklamada bilet fiyatı üzerinden dediği durumda olması gereken. İkinci sonuç senaryo 1'e uygun olan.
            System.out.println("Toplam Tutar : " + price * (1 - (a + b)));      // Açıklamaya uygun sonuç.
            System.out.println("Toplam Tutar : " + price * (1 - a) * (1 - b));  // Senaryo 1'e uygun sonuç.
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}