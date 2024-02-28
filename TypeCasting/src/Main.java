import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Girdiler
        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz : ");
        int n1 = input.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz : ");
        double n2 = input.nextDouble();

        // Dönüşümler
        double n1Double = n1;
        int n2Int = (int) n2
                ;
        // Çıktı
        System.out.println("Girilen int tipindeki sayı double'a dönüştürüldü : " + n1Double);
        System.out.println("Girilen double tipindeki sayı int'e dönüştürüldü : " + n2Int);

    }
}