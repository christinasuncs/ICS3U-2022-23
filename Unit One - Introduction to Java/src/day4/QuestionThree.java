package day4;

/**
 * Create a program that can solve the equation y = ax^2+bx+c given a, b, c and x.
 */

public class QuestionThree {
    public static void main(String[] args) {
        double a = 1.5;
        double b = 2.5;
        double c = 4;
        double x = 3;
        double y = a * x * x + b * x + c;
        System.out.println("y equals: " + y);
    }
}
