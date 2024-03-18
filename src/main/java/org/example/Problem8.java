package org.example;

public class Problem8 {
    public static void main(String[] args) {
        int[] array = {1,5,10,0,-20};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
            } else if (min>array[i]) {
                min=array[i];
            }
        }
        System.out.println("The MAX number is "+max);
        System.out.println("The MIN number is "+min);
    }
}
