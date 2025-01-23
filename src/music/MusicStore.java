package music;

import java.util.ArrayList;

public class MusicStore {
    String name;
    String city;
    ArrayList<String> albums;

    public MusicStore() {}

    public MusicStore(String name, String city, ArrayList<String> albums) {
        this.name = name;
        this.city = city;
        this.albums = albums;
    }

    public void addAlbum(String album) {
        albums.add(album);
    }
    public void removeAlbum(String album) {
        albums.remove(album);
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public ArrayList<String> getAlbums(){
        return albums;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setAlbums(ArrayList<String> albums){
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "MusicStore [name=" + name + ", city=" + city + ", albums=" + albums + "]";
    }

    @Override
    public int hashCode() {
        return name.hashCode()+city.hashCode()+albums.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj.getClass() != this.getClass()) return false;
        MusicStore other = (MusicStore) obj;
        return name.equals(other.name) && city.equals(other.city) && albums.equals(other.albums);
    }
}
