package sorting;

import java.util.*;

public class TestSorting {
    public static void main(String[] args) {
        // Tworzymy tablicę obiektów typu Product
        Product[] products = {
                new Product("Jablko", 1.5),
                new Product("Banan", 0.9),
                new Product("wisnia", 2.0),
                new Product("cola", 1.8)
        };

        // Wyświetlamy tablicę przed posortowaniem
        System.out.println("Before sorting:");
        for (Product product : products) {
            System.out.println(product);
        }

        // Sortowanie tablicy w porządku malejącym
        SortDecending.sortDecending(products);

        // Wyświetlamy tablicę po posortowaniu
        System.out.println("\nAfter sorting:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
