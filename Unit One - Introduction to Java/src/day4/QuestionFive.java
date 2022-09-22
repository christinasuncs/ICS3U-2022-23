package day4;

/**
 * Write a program that given the number of pennies, nickles, dimes, quarters, loonies and toonies calculates how much money the user has.
 */

public class QuestionFive {
    public static void main(String[] args) {
        int pennyCount = 20;
        int nickleCount = 2;
        int dimeCount = 3;
        int quarterCount = 4;
        int loonieCount = 3;
        int toonieCount = 1;
        double total = pennyCount * 0.01 + nickleCount * 0.05 + dimeCount * 0.1 + quarterCount * 0.25 + loonieCount * 1.0 + toonieCount * 2.0;
        System.out.println("the person has " + total + " dollars.");
    }
}
