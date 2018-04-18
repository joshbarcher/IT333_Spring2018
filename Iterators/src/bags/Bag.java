package bags;

import java.util.Arrays;
import java.util.Iterator;

public class Bag<T> implements Iterable<T>
{
    private T[] data;
    private int initialSize;
    private int currentPosition;

    public Bag(int size)
    {
        initialSize = size;
        this.data = (T[]) new Object[initialSize];
    }

    public boolean add(T element)
    {
        if (currentPosition == data.length)
        {
            return false;
        }

        data[currentPosition] = element;
        currentPosition++;

        return true;
    }

    public void clear()
    {
        this.data = (T[]) new Object[initialSize];
        currentPosition = 0;
    }

    @Override
    public String toString()
    {
        return "Bag: " + Arrays.toString(data) + ", size: " + currentPosition;
    }

    @Override
    public Iterator<T> iterator()
    {
        return new BagIterator(data);
    }

    private class BagIterator implements Iterator<T>
    {
        private T[] bagData;
        private int validPosition = 0; //default to zero

        public BagIterator(T[] bagData)
        {
            this.bagData = bagData;
        }

        @Override
        public boolean hasNext()
        {
            return validPosition < bagData.length &&
                    bagData[validPosition] != null;
        }

        @Override
        public T next()
        {
            T result = bagData[validPosition];
            validPosition++;
            return result;
        }
    }
}














