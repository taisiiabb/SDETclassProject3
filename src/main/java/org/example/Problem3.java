package org.example;

public class Problem3 {
    public static void main(String[] args) {
        int [][] array = {
                {2,4,7,3,2},
                {14,8,6,1,1,15}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]% 2 == 0) {
                    System.out.print(array[i][j]+" ");
                }
            }
        }
    }
}
