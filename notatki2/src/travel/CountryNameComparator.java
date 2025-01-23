package travel;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Destination> {
    public int compare(Destination o1, Destination o2) {

        //o1.compareTo(o2) → naturalny porządek (A → Z).
        //o2.compareTo(o1) → odwrotny porządek (Z → A).

        // identyczne wynik = 0, zgodnie z akualnym porzadkiem = 1, nie zgodne wynik = -1

        if(o2.getCountry().compareTo(o1.getCountry()) != 0){
            return o2.getCountry().compareTo(o1.getCountry());
        }
        return o2.getName().compareTo(o1.getName());
    }
}
