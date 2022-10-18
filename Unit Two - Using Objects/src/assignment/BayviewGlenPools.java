package assignment;

import java.util.Scanner;

public class BayviewGlenPools {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the length of the pool followed by the width: ");
        int length = in.nextInt();
        int width = in.nextInt();

        System.out.print("Please enter the depth of the deep end of the pool, followed by the depth of the shallow end: ");
        int deepDepth = in.nextInt();
        int shallowDepth = in.nextInt();

        System.out.print("Please enter the length of the slope: ");
        int slopeLength = in.nextInt();

        System.out.print("Enter the length of the shallow end: ");
        int shallowLength = in.nextInt();

        System.out.print("Enter the price per square meter of the chosen liner: ");
        double linerPrice = in.nextDouble();

        // find more variables, difference in depth, length of transition, length of deep end, and length of base
        int depthDiff = deepDepth - shallowDepth;
        double transitionLength = Math.sqrt(Math.pow(slopeLength, 2) - Math.pow(depthDiff, 2));
        double deepLength = length - shallowLength - transitionLength;
        double baseLength = deepLength + slopeLength + shallowLength;

        //part a
        // find volume, then multiply by 0.9 or 90%
        // side wall area
        double area4 = deepDepth * deepLength;
        double area5 = (deepDepth + shallowDepth)/2.0 * transitionLength;
        double area6 = shallowDepth * shallowLength;
        double sideAreaTotal = area4 + area5 + area6;

        double finalVolume = sideAreaTotal * width;
        double waterNeeded = finalVolume * 0.9;

        System.out.println("The amount of water required to fill the pool to 90% is: " + (double)(Math.round(waterNeeded*100))/100 + " square metres");


        // part b
        // find surface area components
        // base and two ends
        double area1 = baseLength * width; //base area
        double area2 = deepDepth * width;
        double area3 = shallowDepth * width;

        double finalArea = area1 + area2 + area3 + 2*(sideAreaTotal);

        System.out.println("The total amount of liner needed is: " + (double)(Math.round(finalArea*100))/100 + " square metres");


        // part c
        // calculate total cost
        double finalPrice = finalArea * linerPrice;

        System.out.println("The total cost of the pool liner is: $"+ ((Math.round(finalPrice*100))/100.0));
    }
}
