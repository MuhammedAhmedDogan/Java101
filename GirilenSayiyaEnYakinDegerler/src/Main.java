import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = scan.nextInt();

        int min = list[0];
        int max = list[0];

        // Dizinin en büyük ve en küçük elemanlarını bulan döngü
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        // Girilen sayıdan küçük ve büyük en yakın dizi elemanlarını bulan döngü
        for (int i : list) {
            if (i < number) {
                min = Math.max(min, i);
            }
            if (i > number) {
                max = Math.min(max, i);
            }
        }

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen sayı :" + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}