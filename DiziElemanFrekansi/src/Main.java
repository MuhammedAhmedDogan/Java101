import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array tanımlandı
        int[] numbers = {10, 20, 11, 20, 10, 10, 20, 5, 20, 11};
        // Array sıralandı
        Arrays.sort(numbers);

        // Tekrar eden sayıları tekrar bastırmamak için kontrol değişkeni
        int control = numbers[numbers.length - 1];

        // Sayıların tekrar sayısını hesaplayan döngü
        for (int i = 0; i < numbers.length; i++) {
            int count = 1; // Tekrar sayısı
            for (int j = 0; j < numbers.length; j++) {
                if ((i != j) && (numbers[i] == numbers[j])) {
                    count++;
                    control = numbers[i]; //
                }
            }
            System.out.println(numbers[i] + " sayısı " + count + " kere tekrar edildi.");

             // Tekrar eden sayı bulunkduktan sonra o sayı geçilene kadar dizinin sonraki elemanına giden döngü
            while (control == numbers[i]) {
                // Dizinin sonuna gelince işlemi durduran şart
                if (i == (numbers.length - 1)) {
                    break;
                }
                i++;
            }
        }

    }
}