package tryingitout;

public class Printer<T> implements Printable<Cat>
{
    @Override
    public void print(Cat other)
    {
        System.out.println(other.toString());
    }
}
