import java.util.Scanner;

public class Main {
    // Palindrom sayı bulan metot
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return reverseNumber == number;
    }

    public static void main(String[] args) {

        // Girdiler
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        // Çıktı
        String sonuc = isPalindrom(number) ? "Girilen sayı palindrom sayıdır." : "Girilen sayı palindrom sayı değildir.";
        System.out.println(sonuc);
    }
}