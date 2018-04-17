package tryingitout;

//create bounds on type T (Cat is an ancestor class
//and implements the IJumpable interface)
public class DataStorage<T extends Cat & IJumpable>
{
    private T data;

    public DataStorage(T data)
    {
        this.data = data;

        data.jump();

        //cannot instantiate type T
        //T cat = new T("furrball");
    }

    public T getData()
    {
        return data;
    }

    @Override
    public String toString()
    {
        return "DataStorage{" +
                "data=" + data +
                '}';
    }
}
