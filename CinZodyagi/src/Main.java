import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int birthDate, result;
        String zod = "";
        boolean isError = false;

        // Girdiler
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        birthDate = input.nextInt();

        // Hesaplamalar
        result = birthDate % 12;
        switch (result) {
            case 0:
                zod = "Maymun";
                break;
            case 1:
                zod = "Horoz";
                break;
            case 2:
                zod = "Köpek";
                break;
            case 3:
                zod = "Domuz";
                break;
            case 4:
                zod = "Fare";
                break;
            case 5:
                zod = "Öküz";
                break;
            case 6:
                zod = "Kaplan";
                break;
            case 7:
                zod = "Tavşan";
                break;
            case 8:
                zod = "Ejderha";
                break;
            case 9:
                zod = "Yılan";
                break;
            case 10:
                zod = "At";
                break;
            case 11:
                zod = "Koyun";
                break;
            default:
                isError = true;
        }

        // Çıktı
        if (isError) {
            System.out.println("Hatalı tarih girdiniz.");
        } else {
            System.out.println("Çin Zodyağı Burcunuz : " + zod);
        }
    }
}