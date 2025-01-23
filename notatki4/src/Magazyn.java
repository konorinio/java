import java.util.ArrayList;

public class Magazyn
{
    public ArrayList<Produkt> produkty = new ArrayList<Produkt>();
    public int ilosc() { return produkty.size(); }

    public Magazyn(ArrayList<Produkt> produkty)
    {
        this.produkty = produkty;
    }

    public void wyswietl()
    {
        for(int i = 0; i < produkty.size(); i++)
        {
            produkty.get(i).WyswietlInformacje();
        }
    }

}
