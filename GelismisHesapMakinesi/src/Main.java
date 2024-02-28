import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1, counter;
        do {
            System.out.print("Kaç adet sayı gireceksiniz : ");
            counter = scan.nextInt();
        } while (counter < 1);

        do {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            result += number;
        } while (i != counter + 1);

        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, counter;
        do {
            System.out.print("Kaç adet sayı gireceksiniz : ");
            counter = scan.nextInt();
        } while (counter < 1);

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1, counter;
        do {
            System.out.print("Kaç adet sayı gireceksiniz :");
            counter = scan.nextInt();
        } while (counter < 1);

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            result *= number;

            if (i == counter + 1)
                break;

            if (number == 0) {
                result = 0;
                System.out.println("Çarpma işlemine 0 Girdininiz. Geri kalan sayılar sorulmayacaktır.");
                break;
            }
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        int counter;
        double number, result = 0.0;
        do {
            System.out.print("Kaç adet sayı gireceksiniz :");
            counter = scan.nextInt();
        } while (counter < 1);

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                result = 0;
                break;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        int n1, n2, result;
        System.out.print("Bölünecek sayıyı giriniz : ");
        n1 = scan.nextInt();
        System.out.print("Bölen sayıyı giriniz : ");
        n2 = scan.nextInt();

        result = n1 % n2;

        System.out.println(n1 + " sayısının " + n2 + " sayısına bölünden kalan : " + result);
    }

    static void rectangle() {
        Scanner scan = new Scanner(System.in);
        int n1, n2, area, perimeter;
        System.out.print("Dikdörtgenin 1. Kenar Uzunluğu : ");
        n1 = scan.nextInt();
        System.out.print("Dikdörtgenin 2. Kenar Uzunluğu : ");
        n2 = scan.nextInt();

        if (n1 <= 0 || n2<=0){
            System.out.println("Kenar uzunlukları sıfır veya daha küçük olamaz.");
            area = 0;
            perimeter = 0;
        } else {
            area = n1 * n2;
            perimeter = 2 * (n1 + n2);
        }

        System.out.println("Dikdörtgenin Alanı : " + area + "\nDikdörtgenin Çevresi : " + perimeter);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = """
                ----------------------------------------
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap""";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}