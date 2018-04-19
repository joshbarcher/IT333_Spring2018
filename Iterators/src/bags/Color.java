package bags;

import java.util.Iterator;

public class Color implements Iterable<Integer>
{
    private int red;
    private int green;
    private int blue;
    private double alpha; //0.0 (transparent) - 1.0 (opaque)

    public Color(int red, int green, int blue, double alpha)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public int getRed()
    {
        return red;
    }

    public int getGreen()
    {
        return green;
    }

    public int getBlue()
    {
        return blue;
    }

    public double getAlpha()
    {
        return alpha;
    }

    @Override
    public String toString()
    {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", alpha=" + alpha +
                '}';
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new ColorIterator(new int[] {red, green, blue});
    }

    private class ColorIterator implements Iterator<Integer>
    {
        private int[] components;
        private int position;

        public ColorIterator(int[] components)
        {
            this.components = components;
        }

        @Override
        public boolean hasNext()
        {
            return position != components.length;
        }

        @Override
        public Integer next()
        {
            int element = components[position];
            position++;
            return element;
        }
    }
}
