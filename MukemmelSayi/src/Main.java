import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int n, control = 0;
        String result;

        // Inputs
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();

        // Calculations
        for (int i = 1; i < n; i++) {
            control = (n % i == 0) ? control + i : control;
        }

        // Result
        result = (control == n) ? " Mükemmel sayıdır." : "Mükemmel sayı değildir.";
        System.out.println(n + " " + result);
    }
}