package org.example;

public class Problem4 {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 1, 1, 1}, {2,2,2,2,2}};
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j]%2 == 0) {
                    sumEven +=array[i][j];
                }
                else {
                    sumOdd +=array[i][j];
                }
            }

        }
        System.out.println("The sum of Evens is "+ sumEven);
        System.out.println("The sum of Odds is "+ sumOdd);



    }
}
