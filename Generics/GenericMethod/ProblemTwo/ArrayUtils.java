package Generics.GenericMethod.ProblemTwo;

public class ArrayUtils {
    public static <T,U> T[] concatenateArrays(T[] array1, U[] array2)
    {
          if(array1==null || array2==null)
          {
            throw  new IllegalArgumentException("Array can't be null");
          }
          int length1= array1.length;
          int length2= array2.length;

          @SuppressWarnings({ "Unchecked", "unchecked" })
          T[] newResultArray= (T[]) new Object[length1+length2];
          System.arraycopy(array1, 0, newResultArray,0, length1);
          System.arraycopy(array2, 0, newResultArray, length1, length2);
          return newResultArray;
    }
    
}
