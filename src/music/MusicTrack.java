package music;

public record MusicTrack(String title, String artist, double duration) {
    public MusicTrack(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        if(duration <= 0){
            throw new IllegalArgumentException("duration jest mniejsze lub równe 0");
        }
    }

    public boolean isLongTrack(){
        if(duration >= 5){
            return true;
        }
        return false;
    }

    public void printDetails(){
        System.out.println(title);
        System.out.println(artist);
        System.out.println(duration);
    }
}
