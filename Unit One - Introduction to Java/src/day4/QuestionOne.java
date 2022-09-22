package day4;
/**
 * Write program that can calculate the area of circle. You will need to declare and initialise variables for the radius and the area. Display the area to the screen.
 * a = pi*r^2
 */
public class QuestionOne {

    public static void main(String[] args) {
        final double pi = 3.14159;
        int r = 3;
        double area = r*r*pi;
        System.out.println("The area of the circle is: " + area);
    }
}