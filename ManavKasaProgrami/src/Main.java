import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, a, e, d, m, p, tutar;

        // Girdiler
        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo ? : ");
        a = input.nextDouble();

        System.out.println("Elma kaç kilo ? : ");
        e = input.nextDouble();

        System.out.println("Domates kaç kilo ? : ");
        d = input.nextDouble();

        System.out.println("Muz kaç kilo ? : ");
        m = input.nextDouble();

        System.out.println("Patlıcan kaç kilo ? : ");
        p = input.nextDouble();

        // Hesaplar
        tutar = armut*a + elma*e + domates*d + muz*m + patlican*p;

        // Çıktı
        System.out.println("Toplam Tutar : " + tutar + " TL");
    }
}