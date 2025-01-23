package music;
import java.util.ArrayList;
public class TestMusicStore {
    public static void main(String[] args) {
        ArrayList<String> albums1 = new ArrayList<>();
        ArrayList<String> albums2 = new ArrayList<>();
        albums1.add("Kootasy");
        albums1.add("Hhhhh");
        albums2.add("P");
        albums2.add("O");
        MusicStore store1 = new MusicStore("ppp", "kurwinki male", albums1);
        VinylStore store2 = new VinylStore("ggg", "pokurwy wielkie", albums2, 10);
        store1.addAlbum("figofagot");
        store1.removeAlbum("figofagot");
        store2.addAlbum("discoooo");
        System.out.println(store1.toString());
        System.out.println(store2.toString());

    }
}
