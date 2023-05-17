import java.util.ArrayList;

public class zadanie5_1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; numbers.size() < 50; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Liczba: " + numbers.get(i) + ", Indeks: " + i);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // czas w milisekundach
        System.out.println("Czas operacji: " + duration + " ms");
    }
}
