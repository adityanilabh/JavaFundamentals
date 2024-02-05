package Generics.WildCardsAndUnbounded.UpperBound.CodingProblemOne;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Player<Integer>>integerPlayer=     Arrays.asList(new Player<>(80),new Player<>(90));
        List<Player<Double>>doublePlayer= Arrays.asList(new Player<>(4.3),new Player<>(4.1) );

        @SuppressWarnings("unused")
        Team<Integer> teamInteger=  new Team<>(integerPlayer);
        @SuppressWarnings("unused")
        Team<Double> teamDouble= new Team<>(doublePlayer);
    }
}
