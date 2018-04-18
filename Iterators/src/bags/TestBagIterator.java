package bags;

import java.util.Iterator;

public class TestBagIterator
{
    public static void main(String[] args)
    {
        //prepare a bag and some words
        Bag<String> bagOfWords = new Bag<>(5);
        String[] words = {"challenge", "stupefy", "allegory", "tautology",
                          "simplify"};

        //add the words to the bag
        for (int i = 0; i < words.length; i++)
        {
            bagOfWords.add(words[i]);
        }

        //then use the iterator to iterate over the words
        /*Iterator<String> wordIterator = bagOfWords.iterator();
        while (wordIterator.hasNext())
        {
            String word = wordIterator.next();
            System.out.println(word);
        }
        System.out.println();*/

        for (String word : bagOfWords)
        {
            System.out.println(word);
        }

        BagOfFruit fruitBag = new BagOfFruit();
        /*for (String fruit : fruitBag) //only works for
        {

        }*/
    }
}
