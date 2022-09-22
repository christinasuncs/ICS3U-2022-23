package day4;

/**
 * Write a program that can calculate the volume of a sphere. Look up the equation if you need do not know it.
 * V = 4/3 * pi * r^3
 */

public class QuestionTwo {
    public static void main(String[] args) {
        final double pi = 3.1415;
        int r = 7;
        double volume = 4/3 * pi * Math.pow(r, 3);
        System.out.println("the volume of the sphere is: " + volume);
    }
}
