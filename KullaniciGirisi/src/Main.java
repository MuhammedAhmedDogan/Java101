import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        String userName, password, newPassword;
        int n1;

        // Girdiler
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        //Şifre kontrol ve sıfırlama işlemleri. ( Kullanıcı adı: "patika" , Şifre: Java123 )
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız !");
        } else {
            if (userName.equals("patika")) {
                System.out.println("Kullanıcı adı doğru. Şifre yanlış !\nŞifrenizi sıfırlamak ister misiniz ?\n1-Evet\n2-Hayır");
                n1 = input.nextInt();
                switch (n1) {
                    case 1:
                        System.out.print("Yeni şifrenizi giriniz : ");
                        newPassword = input.nextLine();
                        newPassword = input.nextLine();
                        if (newPassword.equals("java123")) {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        } else {
                            System.out.println("Şifre oluşturuldu.\nYeni şifreniz : " + newPassword);
                        }
                        break;
                    case 2:
                        System.out.println("Tekrar bekleriz :)");
                        break;
                    default:
                        System.out.println("Hatalı giriş yaptınız !");
                }
            } else if (password.equals("java123")) {
                System.out.println("Kullanıcı adı hatalı !");
            } else {
                System.out.println("Bilgileriniz yanlış !");
            }
        }
    }
}