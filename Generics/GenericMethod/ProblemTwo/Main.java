package Generics.GenericMethod.ProblemTwo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Integer[] array1= {1,3,4,5};
        String[] array2= {"reash","fsfs","sfsfsd"};
        Object[] concatenateArray= ArrayUtils.concatenateArrays(array1,array2);
        System.out.println("array elements are: "+ Arrays.toString(concatenateArray));
    }
}
