import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ebob = 0, ekok = 0;

        // Girdiler
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz :");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz :");
        int n2 = input.nextInt();

        // Küçük sayıyı n1'e büyük sayıyı n2'ye atayan kodlar.
        int tN1 = n1;
        n1 = Math.min(n1, n2);
        n2 = Math.max(tN1, n2);

        // EKOK bulan döngü
        int i = 1;
        while (i <= (n1 * n2)) {
            if ((i % n1 == 0) && (i % n2 == 0)) {
                ekok = i;
                break;
            }
            i++;
        }

        //EBOB bulan döngü
        int j = n1;
        while (j >= 1) {
            if ((n1 % j == 0) && (n2 % j == 0)) {
                ebob = j;
                break;
            }
            j--;
        }
         // Çıktı
        System.out.println("EKOK = " + ekok + "\nEBOB = " + ebob);
    }
}