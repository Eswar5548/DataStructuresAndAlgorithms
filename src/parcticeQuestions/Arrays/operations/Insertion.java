package parcticeQuestions.Arrays.operations;

import javax.swing.*;
import java.util.Scanner;

public class Insertion {

}

public class ArrayInsertionExample {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array:");
        printArray(originalArray);

        // New element to be inserted
        int newElement = 10;
        // Position where the new element is to be inserted
        int position = 2;

        // Step 2: Create a new array that is one element larger
        int[] newArray = new int[originalArray.length + 1];

        // Step 3: Copy elements and insert the new element
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = newElement;  // Insert the new element
            } else {
                newArray[i] = originalArray[j++];
            }
        }

        // Print the new array
        System.out.println("Array after insertion:");
        printArray(newArray);
    }

    // Utility method to print the array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

