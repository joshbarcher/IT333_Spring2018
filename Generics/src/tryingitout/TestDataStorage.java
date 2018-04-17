package tryingitout;

public class TestDataStorage
{
    public static void main(String[] args)
    {
        DataStorage<Cat> catBox = new DataStorage<Cat>(new Cat());
        //DataStorage<String> stringBox = new DataStorage<String>("hello");
        DataStorage<Kitten> kittyBox = new DataStorage<Kitten>(new Kitten());
    }
}
