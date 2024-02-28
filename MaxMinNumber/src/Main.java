import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int n, number, max = -2147483648, min = 2147483647;

        // Inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = input.nextInt();

        // Calculations

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ". sayıyı giriniz : ");
                number = input.nextInt();
                max = (number > max) ? number : max;
                min = (number < min) ? number : min;
            }

            System.out.println("En büyük sayı : " + max);
            System.out.println("En küçük sayı : " + min);

        } else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}