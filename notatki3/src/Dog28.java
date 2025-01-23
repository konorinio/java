import java.util.ArrayList;

public class Dog28 extends Animal28
{
    private int age;

    public Dog28(int age)
    {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void findMinMaxAge(ArrayList<Dog28> dog28ArrayList, Pair<?super Dog28> result)
    {
        Dog28 minDog = dog28ArrayList.get(0);
        Dog28 maxDog = dog28ArrayList.get(0);

        for(int i = 0; i < dog28ArrayList.size(); i++)
        {
            Dog28 currentDog = dog28ArrayList.get(i);

            if(currentDog.age < minDog.age)
                minDog = currentDog;

            if(currentDog.age > maxDog.age)
                maxDog = currentDog;

        }

        result.obiekt1 = minDog;
        result.obiekt2 = maxDog;
    }

}
