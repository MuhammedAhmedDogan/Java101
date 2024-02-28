import java.util.Scanner;

public class Main {
    static int power(int base, int exponent) {
        if (base == 1 || exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        int base = input.nextInt();

        System.out.print("Üs değeri giriniz : ");
        int exponent = input.nextInt();

        System.out.println(base + " üzeri " + exponent + " = " + power(base, exponent));

    }
}