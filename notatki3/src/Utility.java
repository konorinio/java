import java.util.ArrayList;

public class Utility
{

    public static<T> void swap(T[] array, int i, int j)
    {
        int arrayLength = array.length;
        if(i < 0 || i >= arrayLength || j < 0 || j >= arrayLength)
            throw new IndexOutOfBoundsException(String.format("Index of %d or %d is out of bounds", i, j));

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static<T> void printArray(T[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static<T extends Comparable<T>> T minvalue(T[] array)
    {
        if(array.length == 0)
            throw new IndexOutOfBoundsException(String.format("Array is empty"));

        T min = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if(min.compareTo(array[i]) > 0)
                min = array[i];
        }

        return min;
    }



}
