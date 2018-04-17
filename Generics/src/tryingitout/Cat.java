package tryingitout;

public class Cat implements IJumpable
{
    private String name;
    private String breed;
    private boolean isDiva;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public boolean isDiva()
    {
        return isDiva;
    }

    public void setDiva(boolean diva)
    {
        isDiva = diva;
    }

    @Override
    public void jump()
    {
        //do something
    }
}
