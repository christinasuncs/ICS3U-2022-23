package day5;

import java.util.Scanner;

public class HomeworkEight {
    public static void main(String[] args) {
        double num;
        
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a positive number: ");

        num = in.nextInt();

        double square = num * num;
        double squareRoot = Math.sqrt(num);

        System.out.println("The sqaure of your number is: " + square);
        System.out.println("And the square root of your number is: " + squareRoot);

        in.close();
    }
}
