package day5;

public class HomeworkTwo {
    public static void main(String[] args) {
        double length = 4.5;
        double width = 2.3;
        double area = ((double)Math.round(length * width * 100)) / 100;
        double perimeter = ((double)Math.round((2 * length + 2 * width)*100))/100;
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
    }
}
