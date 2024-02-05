package Generics.Parameters.MultipleParameter;

public class Main {
    public static void main(String[] args) {
        // Creating a Pair of Integer and String
        Pair<Integer, String> myPair = new Pair<>(42, "Java");

        // Retrieving values
        Integer firstValue = myPair.getFirst();
        String secondValue = myPair.getSecond();

        // Printing values
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);
    }
}