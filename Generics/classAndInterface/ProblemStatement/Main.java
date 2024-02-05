package Generics.classAndInterface.ProblemStatement;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the generic class
        MathOperations<Double> doubleMath = new MathOperations<>();

        // Using the generic interface method
        Double result = doubleMath.add(3.5, 7.2);

        // Printing the result
        System.out.println("Result: " + result);
    }
}