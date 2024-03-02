import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Kullancıdan dizinin boyutunu al
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n :");
        int n = scan.nextInt();
        int[] list = new int[n];

        // Kullanıcıdan dizinin elemanlarını al
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemanı :");
            list[i] = scan.nextInt();
        }

        // Sıralama ve ekrana yazdırma
        Arrays.sort(list);
        System.out.print("Sıralama : ");
        for (int i : list) {
            System.out.print(i + " ");
        }

    }
}