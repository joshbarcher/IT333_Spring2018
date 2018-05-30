package relations;

public class PotatoTest
{
    public static void main(String[] args)
    {
        Potato[] potatoes = {
            new Potato("red", 200, 0.1),
            new Potato("brown", 100, 0.05),
            new RussettPotato("pink", 200, 0.05),
            new Potato("brown", 200, 1.0)
        };

        //reflexive - for every value a, a.equals(a) is true
        System.out.println("Reflexive: " + potatoes[0].equals(potatoes[0]));
        System.out.println("Reflexive: " + potatoes[1].equals(potatoes[1]));
        System.out.println("Reflexive: " + potatoes[2].equals(potatoes[2]));

        //symmetric - if a.equals(b) is true, then b.equals(a) must be true
        System.out.println("Symmetric: " + potatoes[0].equals(potatoes[2]));
        System.out.println("Symmetric: " + potatoes[2].equals(potatoes[0]));

        //transitive - if a.equals(b) is true and b.equals(c) is true, then
        //a.equals(c) must be true
        System.out.println("Transitive: " + potatoes[0].equals(potatoes[2]));
        System.out.println("Transitive: " + potatoes[2].equals(potatoes[3]));
        System.out.println("Transitive: " + potatoes[0].equals(potatoes[3])); // must be true!
    }
}
