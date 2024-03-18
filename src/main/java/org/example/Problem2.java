package org.example;

public class Problem2 {
    public static void main(String[] args) {
        int [] values = {1,0,-567,0,0,0};
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println(sum);
    }
}
