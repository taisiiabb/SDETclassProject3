package org.example;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        String[] words = {"Terminator", "Slicer", "Ninja",
                "cow", "Robot", "littlegirl", "Robot", "Terminator", "Cow", ""};

       /*for this problem I spent an hour and could not figure out how to solve it,
       so I referred to ChatGPT, even though it was forbidden. I don;t think we had
        enough of examples and practice with nested loops + arrays for this matter.
       */

        System.out.println("Duplicate elements:");
        for (int i = 0; i < words.length - 1; i++) {
            // Check if the element at index 'i' is a duplicate
            boolean isDuplicate = false;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    isDuplicate = true;
                    break; // Break the loop as soon as a duplicate is found
                }
            }
            // If the element is a duplicate, print it
            if (isDuplicate) {
                System.out.println(words[i]);
            }
        }
    }
}
