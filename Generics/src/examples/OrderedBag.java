package examples;

import java.util.Arrays;

public class OrderedBag<T extends Comparable<T>>
{
    private T[] data;
    private int nextOpenIndex;

    public OrderedBag(int size)
    {
        data = (T[]) new Comparable[size];
    }

    public boolean add(T element)
    {
        if (nextOpenIndex == data.length)
        {
            return false; //no space left in the bag
        }

        data[nextOpenIndex] = element;
        nextOpenIndex++;
        return true;
    }

    public void sort()
    {
        Arrays.sort(data, 0, nextOpenIndex);
    }

    public T findMinimum()
    {
        if (nextOpenIndex == 0)
        {
            return null; //the bag is empty
        }

        T min = data[0];

        for (int i = 1; i < data.length; i++)
        {
            if (data[i] != null && data[i].compareTo(min) < 0)
            {
                min = data[i];
            }
        }

        return min;
    }

    public String toString()
    {
        return "Ordered bag: " + Arrays.toString(data);
    }
}
