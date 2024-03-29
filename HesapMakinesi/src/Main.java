import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int n1, n2, select;

        // Girdiler
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        // Hesaplar ve çıktı. if yerine switch case kullanıldı.
        switch (select) {
            case 1:
                System.out.println("Toplama : " + n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez.");
                        break;
                    default:
                        System.out.println("Bölme : " + n1 + " / " + n2 + " = " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız. Tekrar deneyiniz.");
        }
    }
}