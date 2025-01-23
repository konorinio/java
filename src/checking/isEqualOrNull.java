package checking;

//twórz statyczną metodę generyczną isEqualOrNull. Metoda ta przyjmuje dwa argumenty tego
//samego typu generycznego T i zwraca true, jeśli oba argumenty są równe sobie lub oba są null.
//Metoda ma sprawdzać, czy oba argumenty są identyczne lub jednocześnie niezainicjalizowane. Na
//przykład, isEqualOrNull(object1, object2) zwróci true, jeśli object1 i object2 są identyczne
//lub oba są null. Zaimplementuj przypadek testowy dla tej metody.

public class isEqualOrNull {
    public static <T> boolean isEqualOrNull(T obj1, T obj2) {
        if (obj1 == null && obj2 == null) {
            return true;
        }
        if(obj1.equals(obj2)) {
            return true;
        }
        return false;
    }
}
