package music;
import java.util.ArrayList;

import java.lang.reflect.Array;

public class VinylStore extends MusicStore{
    private int numberOfVinyls;

    public VinylStore(String name, String city, ArrayList<String> albums, int numberOfVinyls){
        super(name, city, albums);
        this.numberOfVinyls = numberOfVinyls;
    }

    @Override
    public String toString(){
        return "name: " + this.name + ", city: " + this.city + ", albums: " + albums + ", number of vinyls: " + numberOfVinyls;
    }

    @Override
    public int hashCode(){
        return name.hashCode()+city.hashCode()+albums.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj.getClass() != this.getClass()) return false;
        VinylStore other = (VinylStore) obj;
        return name.equals(other.name) && city.equals(other.city) && albums.equals(other.albums);
    }
}
