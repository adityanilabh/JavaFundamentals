package Generics.Intro.CodingProblemOne;

public class MainApp {
    public static void main(String[] args)
    {
        Box<Integer> integerBox= new Box<>(10);
        System.out.println("Box content: "+ integerBox.getContent());

        integerBox.displayBoxType();

        /* to be known later  */
        integerBox.genericMethod("Hello, Generics!");

        // Using the static generic method
        Box.staticGenericMethod(3.14);
    }
}
