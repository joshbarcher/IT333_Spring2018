package examples;

public class TestOrderedBag
{
    public static void main(String[] args)
    {
        //create the bag and elements to insert
        OrderedBag<Integer> numbersBag = new OrderedBag<>(10);
        int[] elements = {10, 3, 9, 14, 21};

        //insert the elements into the bag
        for (int element : elements)
        {
            numbersBag.add(element);
        }
        System.out.println(numbersBag.toString());
        System.out.println();

        System.out.println("Min element: " + numbersBag.findMinimum());

        //sort and show our results
        numbersBag.sort();
        System.out.println(numbersBag.toString());
        System.out.println();
        System.out.println("Min element: " + numbersBag.findMinimum());
    }
}
