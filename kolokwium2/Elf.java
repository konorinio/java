import java.util.Objects;

public class Elf {
    String imie;
    int wiek;
    String stanowisko;

    //konstruktor
    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    //gettery
    public String getImie() {
        return imie;
    }
    public int getWiek() {
        return wiek;
    }
    public String getStanowisko() {
        return stanowisko;
    }

    //settery
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    //metody
    public void przedstawSie(){
        System.out.println("Czesć, nayzwam się " + imie + ", mam " + wiek + " lat, a moje staonwisko pracy to " + stanowisko);
    }



    @Override
    public String toString() {
        return imie + " " + wiek + " " + stanowisko;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elf elf = (Elf) o;
        return imie.equals(elf.imie) && wiek == elf.wiek && stanowisko.equals(elf.stanowisko);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, stanowisko);
    }
}
