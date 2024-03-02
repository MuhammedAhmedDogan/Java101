import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(101);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while (right < 5) {
            System.out.println("=================================");
            System.out.print("Lütfen tahmininizi giriniz (0 - 100 arası) :");
            selected = input.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen 0 - 100 arasında bir değer giriniz.");
                if (isWrong) {
                    wrong[right++] = selected;
                    System.out.println("Çok fazla hatalı giriş yaptınız kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde can hakkınızdan düşülecektir.");
                    System.out.println("Kalan hak : " + (5 - right));
                }
                continue;
            }

            if (selected == number) {
                isWin = true;
                wrong = Arrays.copyOfRange(wrong, 0, (right + 1));
                wrong[right] = selected;
                break;
            } else {

                System.out.println("Hatalı bir sayı girdiniz");
                if (selected > number) {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hak : " + (5 - right));
            }
        }

        if (isWin) {
            System.out.println("Tebrikler, doğru tahmin ! Gizli sayı : " + number);
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        } else {
            System.out.println("=================================");
            System.out.println("Kaybettiniz");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            System.out.println("Gizli sayı : " + number);

        }

    }
}