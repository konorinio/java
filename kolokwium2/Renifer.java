import java.util.Arrays;
import java.util.Objects;

public class Renifer {
    String imie;
    int predkosc;

    //konstruktor
    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }

    //gettery
    public String getImie() {
        return imie;
    }
    public int getPredkosc() {
        return predkosc;
    }

    //settery
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    //metody
    public void nakarmRenifera(){
        System.out.println(imie + " " + (predkosc+5));
    }


    @Override
    public String toString() {
        return imie + " " + predkosc;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Renifer renifer = (Renifer) o;
        return imie.equals(renifer.imie) && predkosc == renifer.predkosc;
    }
    @Override
    public int hashCode() {
        return Objects.hash(imie, predkosc);
    }
}
