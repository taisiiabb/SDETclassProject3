package org.example;

public class Problem1 {
    public static void main(String[] args) {
        int [] temps = {78,89,90,101,32,75,77};
        int i =0;
        int min = temps[i];
        int max = temps[i];

        for (i = 0; i < temps.length; i++) {
            if (temps[i]<=min) {
                min = temps[i];
            }
        }
        System.out.println("This is min: "+min);
        for (i = 0; i < temps.length; i++) {
            if (temps[i]>=max) {
                max = temps[i];

            }
        }
        System.out.println("This is max: "+max);
    }
}
