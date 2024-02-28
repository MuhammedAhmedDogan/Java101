import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        // Girdiler
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz : ");
        tutar = input.nextDouble();

        // Hesaplar
        boolean tutarKontrol = tutar >= 1000.0;
        kdvOran = tutarKontrol ? 0.08 : 0.18;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        // Çıktı
        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV'li Fiyat = " + kdvliTutar);
        System.out.println("KDV tutarı = " + kdvTutar);
        System.out.println("KDV oranı %" + kdvOran * 100);
    }
}