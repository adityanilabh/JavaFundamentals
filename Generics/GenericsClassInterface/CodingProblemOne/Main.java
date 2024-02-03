package Generics.GenericsClassInterface.CodingProblemOne;

public class Main {
    public static void main(String[] args) {
        // Create a generic stack of integers
        GenericStack<Integer> integerStack = new ArrayStack<>();

        // Push elements onto the stack
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        // Display and pop elements from the stack
        System.out.println("Top element: " + integerStack.peek());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + integerStack.isEmpty());
    }
}
