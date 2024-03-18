package org.example;

public class Problem9 {
    public static void main(String[] args) {
        int [] array = {-20, 10,20,5,6,7,8};
        int max = array[0];
        int secondMax = array[0];

        for (int i=0; i< array.length; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        for (int i=0; i< array.length; i++) {
            if (secondMax<array[i] && array[i]!=max){
                secondMax=array[i];
            }
        }
        System.out.println("Overall MAX is "+max);
        System.out.println("Second MAX is "+secondMax);

    }
}
