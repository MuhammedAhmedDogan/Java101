import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int year;
        boolean result;

        // Girdiler. Kullanıcıya yıl sor.
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        // Hesaplamalar
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                result = year % 400 == 0;
            } else {
                result = true;
            }
        } else {
            result = false;
        }

        // Çıktı
        if (result){
            System.out.println(year+" bir artık yıldır !");
        } else {
            System.out.println(year+" bir artık yıl değildir !");
        }
    }
}