package bags;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Bag<T> implements Iterable<T>
{
    private T[] data;
    private int initialSize;
    private int currentPosition;
    private int modCount;

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
        modCount++;

        return true;
    }

    public void clear()
    {
        this.data = (T[]) new Object[initialSize];
        currentPosition = 0;
        modCount++;
    }

    @Override
    public String toString()
    {
        return "Bag: " + Arrays.toString(data) + ", size: " + currentPosition;
    }

    @Override
    public Iterator<T> iterator()
    {
        return new BagIterator(data, modCount);
    }

    private class BagIterator implements Iterator<T>
    {
        private T[] bagData;
        private int validPosition = 0; //default to zero
        private int modCountSnapshot;

        public BagIterator(T[] bagData, int modCountSnapshot)
        {
            this.bagData = bagData;
            this.modCountSnapshot = modCountSnapshot;
        }

        @Override
        public boolean hasNext()
        {
            checkConcurrentChanges();

            return validPosition < bagData.length &&
                    bagData[validPosition] != null;
        }

        @Override
        public T next()
        {
            checkConcurrentChanges();

            T result = bagData[validPosition];
            validPosition++;
            return result;
        }

        private void checkConcurrentChanges()
        {
            if (modCountSnapshot != modCount)
            {
                throw new ConcurrentModificationException(
                        "You cannot modify the bag while using an iterator");
            }
        }
    }
}














