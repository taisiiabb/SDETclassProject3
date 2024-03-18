package org.example;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();

        System.out.println("Your first number is "+firstNumber);
        System.out.println("Your second number is "+secondNumber);

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("Your first number is "+firstNumber);
        System.out.println("Your second number is "+secondNumber);

    }
}
