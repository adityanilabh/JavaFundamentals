package Generics.Intro.CodingProblemTwo;

public class Main {
    public static void main(String[] args) {
        // Creating a custom array with a capacity of 5 elements
        CustomArray<String> stringArray = new CustomArray<>(5);

        // Setting elements in the custom array
        stringArray.setElement(0, "Hello");
        stringArray.setElement(1, "World");

        // Retrieving elements from the custom array
        String element1 = stringArray.getElement(0);
        String element2 = stringArray.getElement(1);

        // Displaying the retrieved elements
        System.out.println("Element at index 0: " + element1);
        System.out.println("Element at index 1: " + element2);

        // Similarly, you can create custom arrays for other data types
        CustomArray<Integer> intArray = new CustomArray<>(3);
        intArray.setElement(0, 42);
        intArray.setElement(1, 123);
        intArray.setElement(2, 789);

        int intElement = intArray.getElement(1);
        System.out.println("Element at index 1 (integer): " + intElement);
    }
}