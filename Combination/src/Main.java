import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int n, r, nFac = 1, rFac = 1, nrFac = 1, result;

        //Inputs
        Scanner inp = new Scanner(System.in);

        System.out.print("Küme eleman sayısı : ");
        n = inp.nextInt();

        System.out.print("Oluşturulacak grubun eleman sayısı : ");
        r = inp.nextInt();

        //Calculations
        for (int i = 1; i <= n; i++) {
            nFac *= i;
        } // n!

        for (int i = 1; i <= r; i++) {
            rFac *= i;
        } // r!

        for (int i = 1; i <= (n - r); i++) {
            nrFac *= i;
        } //(n-r)!

        result = nFac / (rFac * nrFac); // C(n,r) = n! / (r! * (n-r)!)

        // Output
        System.out.println(n + " elemanlı bir kümenin elemanları ile oluşturulacak " + r + " elemanlı farklı grupların sayısı : " + result);
    }
}