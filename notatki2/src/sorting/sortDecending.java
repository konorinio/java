package sorting;

import java.util.*;

public class SortDecending {
    public static <T extends Comparable<T>> void sortDecending(T[] tablica){
        Arrays.sort(tablica, (o1, o2) -> o2.compareTo(o1));
    }
}


//        //babelkowe sortowanko
//        for (int i = 0; i < tablica.length-1; i++) {
//            for (int j = i+1; j < tablica.length; j++) {
//                T temp;
//
//                //to jest w porzadku malejacym, jesli ma byc w rosnacym zmieniam "<" na ">"
//                if((int)tablica[i] < (int)tablica[j]){
//                    temp = tablica[i];
//                    tablica[i] = tablica[j];
//                    tablica[j] = temp;
//                }
//            }
//        }
