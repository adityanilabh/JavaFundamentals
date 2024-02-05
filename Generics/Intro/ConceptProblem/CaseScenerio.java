package Generics.Intro.ConceptProblem;
import java.util.*;
public class CaseScenerio{
       public static void main(String[] args)
       {
           /* below is the old style collection declaration */
           /* 
            * List list1 = new List;
              list1.add("Melon");
             // list1.add(2); // error.
              // also look this code below: 
              String data1= (String)list1.get(0); 
              // for above code , we always had to type case the data type to get element.
            */
            // below is the new code:
            List<Integer>newInteger= new ArrayList<>(3);
            // now for above case, we have specified that list will only take integer.
            List<String>newString= new ArrayList<>(2);
            //now for above case, we have specified that list will only take String.
       }
}