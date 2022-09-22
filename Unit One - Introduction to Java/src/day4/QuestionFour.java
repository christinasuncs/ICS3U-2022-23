package day4;

/**
 * Write a program to calculate the slope of a line give (x1, y1) and (x2,y2).
 * rise / run = (y2 - y1) / (x2 - x1)
 */

public class QuestionFour {
    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;
        double x2 = 3;
        double y2 = 6;
        double slope = (y2 - y1) / (x2 - x1);
        System.out.println(slope);
    }
}
