package Generics.GenericMethod.ProblemOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Integer[] intArray= {1,2,3,4,5};
        System.out.println("elements of Array are: "+Arrays.toString(intArray));
        ArrayUtils.swapElements(intArray,1,3);
    }
}
