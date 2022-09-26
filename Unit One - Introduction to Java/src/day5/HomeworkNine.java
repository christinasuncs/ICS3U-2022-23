package day5;

import java.util.Scanner;

public class HomeworkNine {
    public static void main(String[] args) {
        int sales;

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of items you've sold: ");
        sales = in.nextInt();
        double pay = 0.27*sales;

        System.out.println("The amount of pay due is: $" + pay);

        in.close();
    }
}
