import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        int price;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz");
                do {
                    System.out.println("1- Para yatırma\n2- Para çekme\n3- Bakiye sorgulama\n4- Çıkış yap.");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz para miktarı :");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarı :");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz !");
                            } else {
                                balance -= price;
                                System.out.println("Bakiyeniz : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                        default:
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");

                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz");
                    System.out.println("Kalan hakkınız : " + right);
                }
            }


        }


    }
}