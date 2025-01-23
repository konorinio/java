import java.util.ArrayList;

public class Sklep
{
    public ArrayList<Produkt> produkty = new ArrayList<Produkt>();
    public String nazwaSklepu;
    public String dataPowstania;
    public Magazyn magazynSklepu;

    public Sklep(ArrayList<Produkt> produkty)
    {
        this.produkty = produkty;
    }

    public Sklep(ArrayList<Produkt> produkty, String nazwaSklepu, String dataPowstania, Magazyn magazynSklepu)
    {
        this.produkty = produkty;
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }

    public void dodajProdukt(Produkt produktDoDodania)
    {
        this.produkty.add(produktDoDodania);
    }

    public void wyswietlOferty()
    {
        System.out.println("Skelp zawiera nastepujace produkty");

        for(int i = 0; i < produkty.size(); i++)
        {
            Produkt produkt = produkty.get(i);
            produkt.WyswietlInformacje();
        }
    }

    @Override
    public String toString()
    {
        String result = "";
        result += "Skelp zawiera nastepujace produkty\n";

        for(int i = 0; i < produkty.size(); i++)
        {
            Produkt produkt = produkty.get(i);
            result += String.format("%s\n", produkt.toString());
        }

        return result;
    }

    public Produkt wyszukajProdukt(String nazwaProduktu)
    {
        for (int i = 0; i < produkty.size(); i++)
        {
            Produkt produkt = produkty.get(i);

            if(produkt.nazwa == nazwaProduktu)
            {
                System.out.println(String.format("Znaleziono produkt %s!", produkt.nazwa));
                return produkt;
            }
        }


        System.out.println(String.format("Nie znaleziono produktu :("));
        return null;
    }

    public void zakupy(Produkt produktDoDodania, int ilosc)
    {
        produktDoDodania.iloscNaMagazynie -= ilosc;
        this.produkty.add(produktDoDodania);
    }

}
