package sorting;
//klasa
public class Product implements Comparable<Product> {
    private String name;
    private double price;

    //konstruktor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //gettery
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    // Implementacja metody compareTo z porównaniem po cenie (price)
    @Override
    public int compareTo(Product other) {
        // Porównanie malejące na podstawie ceny
        return Double.compare(other.getPrice(), this.price);  // Zmiana miejscami, by uzyskać porządek malejący
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
