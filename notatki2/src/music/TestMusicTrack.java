package music;

public class TestMusicTrack {
    public static void main(String[] args) {
        MusicTrack muza = new MusicTrack("Czerwony Rum", "Slon", 1);
        MusicTrack muza2 = new MusicTrack("Zlon", "Slon", 5);

        muza.printDetails();
        System.out.println(muza2.isLongTrack());
    }
}
