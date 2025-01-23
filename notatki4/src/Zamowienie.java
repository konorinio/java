public class Zamowienie
{
    public KoszykZakupowy koszykZakupowy;
    public String statusZamowienia;
    public Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy,  String statusZamowienia)
    {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
    }

    public Zamowienie(KoszykZakupowy koszykZakupowy,  String statusZamowienia, Platnosc platnosc)
    {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = platnosc;
    }

    public void ustawStatusZamowienia(String statusZamowienia)
    {
        this.statusZamowienia = statusZamowienia;
    }

    public void wyswietlZamowienie()
    {
        System.out.println("Status zamowienia koszyka to: " + statusZamowienia);
        System.out.println("Koszyk zawiera");
        for(int i = 0; i < koszykZakupowy.listaProdukt.size(); i++)
        {
            Produkt produkt = koszykZakupowy.listaProdukt.get(i);
            System.out.println(String.format("Produkt: (%s) cena(%d) ilosc(%d)", produkt.nazwa, produkt.cena, produkt.iloscNaMagazynie));
        }
    }

    @Override
    public String toString()
    {
        String result = "";
        result += "Status zamowienia koszyka to: " + statusZamowienia + "\n";
        result += "Koszyk zawiera\n";
        for(int i = 0; i < koszykZakupowy.listaProdukt.size(); i++)
        {
            Produkt produkt = koszykZakupowy.listaProdukt.get(i);
            result += String.format("Produkt: (%s) cena(%d) ilosc(%d)\n", produkt.nazwa, produkt.cena, produkt.iloscNaMagazynie);
        }

        return result;
    }

    public void finalizujZamowienie()
    {
        if(platnosc.statusPlatnosci == "Oplacone")
        {
            this.statusZamowienia = "Gotowe do wysyłki";
        }
    }

    public void zwrocProdukt(Produkt produkt, int ilosc)
    {
        produkt.UsunZMagazynu(ilosc);
        this.koszykZakupowy.listaProdukt.remove(produkt);
    }
}
