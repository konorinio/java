public class Dog extends Animal
{
    public Dog(int wiek)
    {
        super(wiek);
    }

    public static <T extends Animal> T findMax(T element1, T element2)
    {
        if(element1.wiek > element2.wiek)
            return element1;

        return element2;
    }
}
