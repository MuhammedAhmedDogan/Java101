import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int n;

        // Girdi
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz : ");
        n = input.nextInt();

        // Yıldızlar ile ekrana ters üçgen basan döngü
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}