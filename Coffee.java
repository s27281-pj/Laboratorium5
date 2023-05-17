import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coffee {
    public static void main(String[] args) {
        List<String> coffeeList = new ArrayList<>();

        coffeeList.add("espresso");
        coffeeList.add("latte");
        coffeeList.add("cappuccino");
        coffeeList.add("mocha");
        coffeeList.add("auLait");
        coffeeList.add("macchiato");

        // Wypisanie listy na konsolę
        System.out.println("Lista kaw:");
        for (String coffee : coffeeList) {
            System.out.println(coffee);
        }

        // Użycie Iteratora do wypisania listy na konsolę
        System.out.println("\nLista kaw (Iterator):");
        Iterator<String> iterator = coffeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Użycie pętli foreach do wypisania listy dużymi literami na konsolę
        System.out.println("\nLista kaw (duże litery):");
        for (String coffee : coffeeList) {
            System.out.println(coffee.toUpperCase());
        }

        // Wypisanie pierwszych 4 liter z każdego wyrazu w liście
        System.out.println("\nPierwsze 4 litery z każdej kawy:");
        for (String coffee : coffeeList) {
            if (coffee.length() >= 4) {
                System.out.println(coffee.substring(0, 4));
            }
        }
    }
}
