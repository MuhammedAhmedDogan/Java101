import java.util.Scanner;

public class Main {
    static int primeNumber(int number, int divisor) {
        if (divisor == 1) { // Metotu geri çağırma işlemini durduran şart.
            return 1;
        } else {            // Sayıyı kendisinden başlayıp böleni bir azaltarak bölecek ve kalansız bölünen sayısını sayarak metota geri döndürecek.
            int counter = (number % divisor == 0) ? 1 : 0;
            return counter+ primeNumber(number, divisor - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir pozitif tam sayı giriniz : ");
        int n = input.nextInt();

        // Girilen sayı pozitif ise bölen sayısını kontrol eder. Yalnızca kendisi ve 1'e kalansız bölünüyorsa bölen sayısı 2 olacaktır. Bu durumda sayı asaldır.
        if (n>0){
            String result = (primeNumber(n, n) == 2) ? " sayısı ASALDIR !" : " sayısı ASAL değildir !";
            System.out.println(n + result);
        } else {
            System.out.println("Hatalı sayı girdiniz.");
        }

    }
}