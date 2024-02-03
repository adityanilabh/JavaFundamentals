package Generics.Intro.CodingProblemOne;

public class Box<T> {
    private T content;
    
    public Box(T content)
    {
        this.content= content;
    }

    public T getContent()
    {
        return content;
    }

    public void setContent(T content)
    {
        this.content= content;
    }

    public void displayBoxType()
    {
        System.out.println("Box type is: "+content.getClass().getName());
    }

    public <U> void genericMethod(U value) {
        System.out.println("Generic method with value: " + value);
    }

    public static <U> void staticGenericMethod(U value) {
        System.out.println("Static generic method with value: " + value);
    }
}
