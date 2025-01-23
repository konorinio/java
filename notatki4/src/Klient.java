import java.util.ArrayList;
import java.util.Objects;

public class Klient
{
    public String imie;
    public String nazwisko;
    public ArrayList<Zamowienie> listaZamowien = new ArrayList<Zamowienie>();
    public Adres adres;

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
    }

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
        this.adres = adres;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj.getClass() != this.getClass())
        {
            return false;
        }

        Klient klient = (Klient) obj;

        if(Objects.equals(this.imie, klient.imie) && Objects.equals(this.nazwisko, klient.nazwisko) && this.adres.equals(klient.adres))
            return true;

        return false;
    }

    public void dodajZamowienie(Zamowienie noweZamowienie)
    {
        this.listaZamowien.add(noweZamowienie);
    }

    public void wyswietlHistorieZamowien()
    {
        for(int i = 0; i < listaZamowien.size(); i++)
        {
            System.out.println(String.format("Zamowienie nr %d", i + 1));
            Zamowienie zamowienie = listaZamowien.get(i);
            zamowienie.wyswietlZamowienie();
            System.out.println();
        }
    }

    public void obliczLacznyKosztDostawyZamowien()
    {
        int sum = 0;
        for(int i = 0; i < listaZamowien.size(); i++)
        {
            Zamowienie zamowienie = listaZamowien.get(i);
            for(int j = 0; j < zamowienie.koszykZakupowy.listaProdukt.size(); j++)
            {
                Produkt produkt = zamowienie.koszykZakupowy.listaProdukt.get(j);
                sum += produkt.cena;
            }
        }

        System.out.println(String.format("Laczny koszt dostawy zamowien: %d", sum));
    }
}
