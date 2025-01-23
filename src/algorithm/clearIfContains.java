package algorithm;

//twórz statyczną metodę generyczną clearIfContains, która przyjmuje kolekcję elementów typu T
//oraz pojedynczy element tego samego typu. Metoda powinna sprawdzać, czy dany element znajduje
//się w kolekcji. Jeśli tak, to cała kolekcja powinna zostać wyczyszczona. Metoda modyfikuje istniejącą
//kolekcję, a nie tworzy nową. Dodaj zabezpieczenie, aby metoda nie mogła być wywołana z kolekcją
//o wartości null. Zaimplementuj przypadek testowy dla tej metody.

public class clearIfContains {
    public static <T> void clearIfContains(T[] collection, T item){
        if(collection != null) {
            for (int i = 0; i < collection.length; i++) {
                if (collection[i] == item) {
                    for (int j = 0; j < collection.length; j++) {
                        collection[j] = null;
                    }
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] collection = {1,2,3,4,5,6};
        clearIfContains(collection, 2);
        for(int i = 0; i < collection.length; i++){
            System.out.println(collection[i]);
        }
    }
}
