import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        /*//Zad21
        Dog piesMlody = new Dog(2);
        Dog piesStary = new Dog(10);

        Dog zwroconyPies = Dog.findMax(piesMlody, piesStary);

        System.out.println(zwroconyPies.wiek);


        System.out.println();


        //Zad28
        Dog28 pies1 = new Dog28(2);
        Dog28 pies2 = new Dog28(1);
        Dog28 pies3 = new Dog28(6);
        Dog28 pies4 = new Dog28(15);
        Dog28 pies5 = new Dog28(9);

        ArrayList<Dog28> dog28ArrayList = new ArrayList<Dog28>();
        dog28ArrayList.add(pies1);
        dog28ArrayList.add(pies2);
        dog28ArrayList.add(pies3);
        dog28ArrayList.add(pies4);
        dog28ArrayList.add(pies5);

        //ogranicza typ do klasy Dog28 lub dowolnej jej nadklasy
        Pair<Dog28> result = new Pair<>();

        Dog28.findMinMaxAge(dog28ArrayList, result);

        System.out.println(result.obiekt1.getAge());
        System.out.println(result.obiekt2.getAge());*/


        //Zad12
        /*Integer[] array = {2, 3, 14, 5 , 6, 99, 1, 352, 21};
        Utility.printArray(array);
        System.out.println();

        Utility.swap(array, 0, array.length-1);
        Utility.printArray(array);*/

        //Zad14
        Integer[] array = {2, 3, 1, 5, 6};
        Double[] arrayDouble = {54.3, 1.2, 5.6, 77.5, 0.3, 5.3, 6.7};
        String[] arrayString = {"b", "d", "essa", "a", "ale jazda"};
        Person[] arrayPerson = {new Person("osoba 1", 1), new Person("osoba 0", 0), new Person("osoba 3", 3)};

        System.out.println(Utility.minvalue(array));
        System.out.println(Utility.minvalue(arrayDouble));
        System.out.println(Utility.minvalue(arrayString));
        Person person = Utility.minvalue(arrayPerson);
        System.out.println(person.name + " " + person.age);







    }
}