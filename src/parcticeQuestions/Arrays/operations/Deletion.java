package parcticeQuestions.Arrays.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Deletion {
    // using arrays by creating two arrays 1st
}


import java.util.Arrays;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int indexToRemove = 2; // Index of the element to remove (e.g., removing the element '3')

        // Check if the index is valid
        if (indexToRemove < 0 || indexToRemove >= originalArray.length) {
            System.out.println("Invalid index");
            return;
        }

        int[] newArray = new int[originalArray.length - 1];

        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = originalArray[i];
            }
        }

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}







import java.util.ArrayList;
import java.util.Arrays;

public class DeleteArrayElement {
    public static void main(String[] args) {
        Integer[] originalArray = {1, 2, 3, 4, 5};
        int indexToRemove = 2; // Index of the element to remove (e.g., removing the element '3')

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(originalArray));
        arrayList.remove(indexToRemove);

        Integer[] newArray = arrayList.toArray(new Integer[0]);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}

