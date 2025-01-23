import java.util.Objects;

public class Platnosc
{
    public int kwota;
    public String statusPlatnosci;

    public Platnosc(int kwota, String statusPlatnosci)
    {
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj.getClass() != this.getClass())
        {
            return false;
        }

        Platnosc platnosc = (Platnosc)obj;

        if(Objects.equals(this.statusPlatnosci, platnosc.statusPlatnosci) && this.kwota == platnosc.kwota)
            return true;

        return false;
    }

    public void zaplac()
    {
        this.statusPlatnosci = "Oplacone";
        this.kwota = 0;
    }
}
