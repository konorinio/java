package travel;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class TestDestination {
    public static void main(String[] args) {
        //tablica obiektów
        Destination[] jeden ={
                new Destination("Lublin", "Polska", 20),
                new Destination("Paryz", "Francja", 30),
                new Destination("Berlin", "Niemcy", 24),
                new Destination("Lublin", "Polska", 20),
        };

        //sortowanie złozone
        Arrays.sort(jeden, (o1, o2) -> {
            if(Integer.compare(o1.getDistance(), o2.getDistance()) != 0){
                return Integer.compare(o1.getDistance(), o2.getDistance());
            }
            CountryNameComparator trzy = new CountryNameComparator();
            return trzy.compare(o1, o2);
        });

        for(Destination d : jeden){
            System.out.println(d.getName() + " " + d.getCountry() + " " + d.getDistance());
        }
    }
}
