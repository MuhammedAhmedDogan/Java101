public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonic = 0;
        for (int number : numbers) {
            harmonic += (1.0 / number);
        }

        System.out.println("Dizideki sayıların harmonik ortalaması : " + numbers.length / harmonic);
    }
}