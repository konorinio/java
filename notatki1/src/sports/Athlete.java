package sports;
import java.util.*;

//Zaimplementuj generyczny interfejs Comparable w
//taki sposób, aby obiekty klasy Athlete były porównywane według rosnąco według roku osiągnię-
//cia sukcesu. Stwórz listę tablicową (ArrayList) 4 obiektów klasy Athlete i posortuj ją według
//sprecyzowanego kryterium.

public class Athlete implements Comparable<Athlete>{
    String name;
    String sport;
    int yearOfAchievement;

    public Athlete(String name, String sport, int yearOfAchievement) {
        this.name = name;
        this.sport = sport;
        this.yearOfAchievement = yearOfAchievement;
    }
    public int compareTo(Athlete a) {
        return this.yearOfAchievement - a.yearOfAchievement;
    }

    @Override
    public String toString() {
        return "name: " + name + ", sport: " + sport + ", yearOfAchievement: " + yearOfAchievement;
    }

    public static void main(String[] args) {
        ArrayList<Athlete> lista = new ArrayList<Athlete>();
        lista.add(new Athlete("jack szypulson", "opierdalanie sie", 2025));
        lista.add(new Athlete("piojas", "krol wydzialu", 2023));
        lista.add(new Athlete("student", "alkoholizm", 2024));
        lista.add(new Athlete("p", "g", 1));

        lista.sort(Athlete::compareTo);
        System.out.println(lista);
    }
}
