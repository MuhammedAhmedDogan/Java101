import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        // Değişkenler
        int mat, fizik, kimya, turkce, tarih, muzik, toplam;

        // Scanner sınıfı
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değer al
        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuz : ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik = input.nextInt();

        // Ortalama hesapla
        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ort = toplam / 6.0;

        //Geçme durumu belirle
        boolean sonuc = ort >= 60.0;
        String cikti = sonuc ? " Sınıfı geçti." : " Sınıfta kaldı.";

        System.out.println("Ortalama: " + ort + cikti);
    }

}