import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int girdi, bolen = 0, toplam = 0;

        // Scanner sınıfından input tanımlama
        Scanner input = new Scanner(System.in);

        // Girdiler
        System.out.print("Bir tam sayı giriniz : ");
        girdi = input.nextInt();

        // Hesaplar
        for (int i = 1; i <= girdi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                bolen++;
            }
        }

        // Çıktı
        if (bolen==0){
            System.out.println("0");
        } else {
            System.out.println("0 " + girdi + " arası 3'e ve 4'e tam bölünen sayıların ortalaması : " + toplam / bolen);
        }
    }
}