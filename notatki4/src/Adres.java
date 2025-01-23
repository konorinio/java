import java.util.Objects;

public class Adres
{
    public String ulica;
    public int numerDomu;
    public int numerMieszkania;
    public String miasto;
    public String kodPocztowy;

    public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, String kodPocztowy)
    {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy)
    {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj.getClass() != this.getClass())
        {
            return false;
        }

        Adres adres = (Adres)obj;

        if(Objects.equals(this.ulica, adres.ulica) &&  this.numerDomu == adres.numerDomu && this.numerMieszkania == adres.numerMieszkania
        && Objects.equals(this.miasto, adres.miasto) && Objects.equals(this.kodPocztowy, adres.kodPocztowy))
            return true;

        return false;
    }

    public void pokaz()
    {
        System.out.println(String.format("%s %s\n%s %d / %d", this.kodPocztowy, this.miasto, this.ulica, this.numerDomu, this.numerMieszkania));
    }

    @Override
    public String toString()
    {
        return String.format("%s %s\n%s %d / %d\n", this.kodPocztowy, this.miasto, this.ulica, this.numerDomu, this.numerMieszkania);
    }

    public void przed()
    {
        //TODO
    }



}

