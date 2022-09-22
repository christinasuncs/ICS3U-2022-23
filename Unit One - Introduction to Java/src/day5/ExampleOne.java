package day5;

import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        //reading data from keyboard
        // not on monday's quiz or ap exam
        Scanner in = new Scanner(System.in);

        double radius;

        System.out.print("Please enter the radius: ");
        radius = in.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle of radius " + radius + " is: " + area);

        //scanners are resources, close it when your done with it

        in.close();

    }
}
