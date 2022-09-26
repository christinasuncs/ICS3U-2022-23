package day5;

import java.util.Scanner;

public class HomeworkTen {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double length;
        double width;

        System.out.print("Please input the length and width: ");

        length = in.nextDouble();
        width = in.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("The area is: " +  area);
        System.out.println("The perimeter is: " + perimeter);

        in.close();

    }
}
