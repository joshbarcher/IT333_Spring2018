package relations;

import java.util.Objects;

public class Potato
{
    private String color;
    private int calories;
    private double weight;

    public Potato(String color, int calories, double weight)
    {
        this.color = color;
        this.calories = calories;
        this.weight = weight;
    }

    public String getColor()
    {
        return color;
    }

    public int getCalories()
    {
        return calories;
    }

    public double getWeight()
    {
        return weight;
    }

    @Override
    public boolean equals(Object other)
    {
        //nothing is equal to null
        if (other == null)
        {
            return false;
        }
        else if (other == this) //optimization
        {
            return true;
        }
        //make sure we have a potato! (instanceof or getClass())
        //else if (!(other instanceof Potato))
        else if (!other.getClass().equals(this.getClass()))
        {
            return false;
        }
        else
        {
            Potato otherPotato = (Potato)other;

            //compare potatoes based on their fields
            return this.calories == otherPotato.calories;
        }
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(color, calories, weight);
    }

    @Override
    public String toString()
    {
        return "Potato{" +
                "color='" + color + '\'' +
                ", calories=" + calories +
                ", weight=" + weight +
                '}';
    }
}
