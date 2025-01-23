import java.util.Objects;

public class Produkt
{
    public String nazwa;
    public int cena;
    public int iloscNaMagazynie;

    public Produkt(String nazwa, int cena, int iloscNaMagazynie)
    {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }


    @Override
    public boolean equals(Object obj)
    {
        if (obj.getClass() != this.getClass())
        {
            return false;
        }

        Produkt produkt = (Produkt)obj;
        if(Objects.equals(this.nazwa, produkt.nazwa) && this.cena == produkt.cena)
            return true;

        return false;
    }

    public void WyswietlInformacje()
    {
        System.out.println("Nazwa " + nazwa);
        System.out.println("Cena " + cena);
        System.out.println("Ilosc na magazynie " + iloscNaMagazynie);
    }

    @Override
    public String toString()
    {
        return String.format("Nazwa %s\nCena%d\nIlosc na magazynie %d\n", this.nazwa, this.cena, this.iloscNaMagazynie);
    }

    public void DodajDoMagazynu(int ilosc)
    {
        this.iloscNaMagazynie+= ilosc;
    }

    public void UsunZMagazynu(int ilosc)
    {
        int temp = this.iloscNaMagazynie - ilosc;
        if(temp > 0)
            this.iloscNaMagazynie-=ilosc;
    }
}
