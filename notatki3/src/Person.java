public class Person implements Comparable<Person>
{
    public String name;
    public int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person other)
    {
        return Integer.compare(this.age, other.age);
    }

}
