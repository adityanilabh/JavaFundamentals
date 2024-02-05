package Generics.Parameters.SingleParameter;

public class Main {
    
        public static void main(String[] args) {
            // Creating a Box of Integer
            Box<Integer> integerBox = new Box<>(42);
    
            // Creating a Box of String
            Box<String> stringBox = new Box<>("Hello, Generics!");
    
            // Retrieving values
            Integer intValue = integerBox.getValue();
            String stringValue = stringBox.getValue();
    
            // Printing values
            System.out.println("Integer Value: " + intValue);
            System.out.println("String Value: " + stringValue);
        }
    
}
