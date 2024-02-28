public class Main {
    public static void main(String[] args) {
        //Calculations
        for (int i = 1; i <= 100; i++) {
            int bolenSayisi = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bolenSayisi++;
                }
            }
            if (bolenSayisi == 2) {
                System.out.print(i + " ");
            }
        }
    }
}