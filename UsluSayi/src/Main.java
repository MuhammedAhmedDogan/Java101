import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int n, k, result = 1;

        // Inputs
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = inp.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = inp.nextInt();

        // Calculations
        for (int i = 1; i <= k; i++) {
            result *= n;
        }

        // Output
        System.out.println(n + " üssü " + k + " = " + result);
    }
}