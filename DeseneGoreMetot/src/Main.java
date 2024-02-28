import java.util.Scanner;

public class Main {
    static int minus(int n) {
        if (n <= 0) { // Metotun kendini çağırmasını durduran şart
            System.out.print(n + " ");
            return n;
        } else {      // Metot şart sağlanana kadar kendini çağırır (Recursive)
            System.out.print(n + " ");
            return minus(n - 5);
        }
    }

    static int plus(int n, int minus) {
        if ((minus + 5) == n) { // Metotun kendini çağırmasını durduran şart
            System.out.print(n + " ");
            return n;
        } else {                // Metot şart sağlanana kadar kendini çağırır (Recursive)
            System.out.print((minus + 5) + " ");
            return plus(n, minus + 5);

        }
    }

    public static void main(String[] args) {

        // Kullanıcıdan girdi alma
        Scanner input = new Scanner(System.in);
        int n;

        // Kullanıcı 0 veya daha küçük değer girerse tekrar girdi ister
        do {
            System.out.print("N sayısı : ");
            n = input.nextInt();
        } while (n <= 0);

        // Çıktı için recursive metotlar çağırıldı
        plus(n, minus(n));

    }
}