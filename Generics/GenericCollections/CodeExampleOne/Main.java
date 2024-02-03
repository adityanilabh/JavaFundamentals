package Generics.GenericCollections.CodeExampleOne;

public class Main {
    public static void main(String[] args)
    {
        Box<Integer>box1= new Box<>();
        box1.setValue(54);
        int valueOfElement= box1.getValue();
        System.out.println(valueOfElement);
    }
    
}
