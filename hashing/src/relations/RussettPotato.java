package relations;

public class RussettPotato extends Potato
{
    public RussettPotato(String color, int calories, double weight)
    {
        super(color, calories, weight);
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
        else if (!(other instanceof RussettPotato))
        {
            return false;
        }
        else
        {
            RussettPotato otherPotato = (RussettPotato)other;

            //compare potatoes based on their fields
            return this.getCalories() == otherPotato.getCalories();
        }
    }
}
