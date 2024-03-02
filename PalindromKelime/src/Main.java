import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return str.contentEquals(reverse);
    }

    public static void main(String[] args) {
        // Kullanıcıdan veri al
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String str = scan.nextLine();

        // Alınan kelimenin bütün harflerini küçük harfe çevir
        str = str.toLowerCase();

        // isPalindrome metotları kullanılarak kelimenin palindrom olup olmadığını kontrol et ve ekrana bastır
        String output = isPalindrome(str) && isPalindrome2(str) ? str + " kelimesi palindromik kelimedir." : str + " kelimesi palindromik kelime değildir.";
        System.out.println(output);

    }
}