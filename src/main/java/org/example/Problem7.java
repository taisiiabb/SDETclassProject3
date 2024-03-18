package org.example;

public class Problem7 {
    public static void main(String[] args) {
        int counterOne=0;
        int counterTwo=1;

        for (int i = 1; i < 11; i++) {

            int counterThree = counterOne + counterTwo;
            System.out.println("#"+i+" Fibonacci number is "+ counterTwo);
            counterOne = counterTwo;
            counterTwo =counterThree;
        }
    }
}
