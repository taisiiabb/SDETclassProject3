package org.example;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
       int[] array = {2, 3, 5, 7, 11, 13, 17, 19,
               23, 29, 31, 37, 41, 43, 47, 53, 59,
               61, 67, 71, 73, 79, 83, 89, 97, 101,
               103, 107, 109, 113, 127, 131, 137,
               139, 149, 151, 157, 163, 167, 173,
               179, 181, 191, 193, 197, 199, 211,
               223, 227, 229, 233, 239, 241, 251,
               257, 263, 269, 271, 277, 281, 283,
               293, 6, 8, 10, 12, 24, 32, 50};
        boolean isPrime;

        for (int i = 0; i < array.length; i++) {
            if (array[i]==2) {
                isPrime = true;
                System.out.println("Is number " + array[i] + " Prime: " + isPrime);
            } else if (array[i]%2== 0) {
                isPrime = false;
                System.out.println("Is number " + array[i] + " Prime: " + isPrime);
            } else {
                isPrime = true;
                System.out.println("Is number " + array[i] + " Prime: " + isPrime);
            }
        }


    }
}
