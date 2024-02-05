package Generics.GenericMethod.ProblemOne;

public class ArrayUtils {
    public static <T> void swapElements(T[] array, int index1, int index2)
    {
        try{
        if(index1>=0 && index2>=0 && index1<array.length && index2<array.length)
        {

        }
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Exception caught: "+ e.getMessage());
        }
        catch(Exception e )
        {
            System.out.println("An expected error occured!");
        }
    }
}
