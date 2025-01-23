// pakiet robi sie jak projekt i klasy w pakiecie
package travel;

//klasa
public class Destination {
    String name;
    String country;
    int distance;

    //konstruktor
    public Destination(String name, String country, int distance) {
        this.name = name;
        this.country = country;
        this.distance = distance;
    }

    //gettery
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public int getDistance() {
        return distance;
    }


    //settery
    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
}
