import music.MusicStore;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> albums = new ArrayList<>();
        albums.add("Kootas");
        albums.add("Peenis");
        MusicStore store1 = new MusicStore("Szypulownia", "kootas", albums);
        MusicStore store2 = new MusicStore("Szypulownia", "kootas", albums);
        System.out.println(store1.equals(store2));
    }
}