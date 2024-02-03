package CollectionJava.Collections.List.ArrayList.CodingProblems;

import java.io.*;
import java.util.*;

public class One {

    public static Integer getTheSize() throws IOException {
        System.out.println("Enter the size of the ArrayList:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static String getNewColour(int index) throws IOException {
        System.out.println("Enter color #" + (index + 1) + ":");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static void printArrayList(List<String> arrayList) {
        System.out.println("Colors in the collection:");
        for (String color : arrayList) {
            System.out.print(color + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Declare the ArrayList
        List<String> newArrayList = new ArrayList<>();

        try {
            // Get the size of the ArrayList
            Integer getSizeOfList = getTheSize();

            // Get colors from the user and add them to the ArrayList
            for (int index = 0; index < getSizeOfList; index++) {
                String colour = getNewColour(index);
                newArrayList.add(colour);
            }

            // Print the ArrayList
            printArrayList(newArrayList);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
