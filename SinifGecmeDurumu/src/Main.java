import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        double mat, fizik, turkce, kimya, muzik, avarage;

        // Girdiler
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        // Hesaplar
        if (mat <= 0 || mat >= 100) {
            mat = 0;
        }

        if (turkce <= 0 || turkce >= 100) {
            turkce = 0;
        }

        if (fizik <= 0 || fizik >= 100) {
            fizik = 0;
        }

        if (kimya <= 0 || kimya >= 100) {
            kimya = 0;
        }

        if (muzik <= 0 || muzik >= 100) {
            muzik = 0;
        }

        avarage = (mat + fizik + turkce + kimya + muzik) / 5;

        // Çıktı
        if (avarage < 55) {
            System.out.println("Ortalamanız : " + avarage + " Sınıfta kaldınız.");
        } else {
            System.out.println("Ortalamanız : " + avarage + " Tebrikler sınıfı geçtiniz.");
        }
    }
}