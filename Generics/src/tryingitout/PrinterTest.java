package tryingitout;

public class PrinterTest
{
    public static void main(String[] args)
    {
        Printer<Cat> catPrinter = new Printer<>();
        catPrinter.print(new Cat());

        Printer<Kitten> textPrinter = new Printer<>();
        catPrinter.print(new Kitten());
    }
}
