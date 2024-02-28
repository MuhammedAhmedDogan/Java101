import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int n;

        // Inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır değerini giriniz : ");
        n = input.nextInt();

        // Calculations
        System.out.println("\n0'dan Girilen sayıya kadar 4'ün kuvveleri : ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i+", ");
        }

        System.out.println("\n\n0'dan Girilen sayıya kadar 5'ün kuvveleri : ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.print(i+", ");
        }
    }
}