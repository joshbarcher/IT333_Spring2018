package bags;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterators
{
    public static void main(String[] args)
    {
        //bag iterators
        Bag<String> bagOfWords = new Bag<>(5);

        //insert some elements
        String[] words = {"eloquent", "terrible", "alive", "bequeath"};
        for (int i = 0; i < words.length; i++)
        {
            bagOfWords.add(words[i]);
        }

        for (String word : bagOfWords)
        {
            System.out.println(word);
        }
        System.out.println();

        //color iterators
        Color tomato = new Color(255,99,71, 1.0);
        for (int component : tomato)
        {
            System.out.println(component);
        }
        System.out.println();

        //contact iterators
        Contact contact = new Contact("Sarah", "Smithers",
                "1000 apple lane. Seattle, WA 98999",
                "(425)777-8888");

        for (String detail : contact)
        {
            System.out.println(detail);
        }
    }
}
