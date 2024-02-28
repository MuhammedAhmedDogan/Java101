import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int n, n1 = 0, n2 = 1, j;

        // Inputs
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci serisinin kaç elemanını görmek istersiniz : ");
        n = inp.nextInt();

        // Calculation
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 1; i <= (n - 2); i++) {
            System.out.print(n1 + n2 + " ");
            j = n1 + n2;
            n1 = n2;
            n2 = j;
        }
    }
}