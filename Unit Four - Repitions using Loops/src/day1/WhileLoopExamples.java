package day1;

import java.util.Scanner;

public class WhileLoopExamples {
   public static void main(String[] args) {
      //exampleOne();
      //exampleTwo();
      //exampleThree();
      //exampleFour();
      exampleFive();
   }

   /*
    * find the percentage of even numbers when you get 1000 random numbers 1 - 100
    */
   private static void exampleFive() {
        int counter = 1;
        int numEven = 0;
        final int NUM_ITERATIONS = 1000;
        while(counter <= NUM_ITERATIONS){
            int rnd = (int)(Math.random()*100) + 1;
            if( rnd % 2 == 0)
                numEven++;

            counter++;
        }
        System.out.println(((double) numEven / NUM_ITERATIONS) * 100);
   }

   /*
    * Introduction to While Loops - Keep asking for a number until the number is
    * even.
    */
   private static void exampleOne() {
    /* 
    If statement 
    if(condition){
        // do the code in condition is true
    }
    */

    /* 
    While statement 
    while(condition){
        //repeat this while the condition is true
    }
    */

    Scanner in = new Scanner(System.in);

    System.out.print("Please enter a number (even to quit): ");
    int number = in.nextInt();

    while(number % 2 == 1){
        System.out.print("Please enter a number (even to quit): ");
        number = in.nextInt();
    }
    in.close();
   }

   /* Sum the numbers from 1 to 1000 using a while loop */
   private static void exampleTwo() {
    int currNum = 1;
    int sum = 0;
    while(currNum <= 1000){
        sum += currNum;
        currNum++;
    }

    System.out.println(sum);
   }

   /*
    * Prompt the user for a number and add it to a sum. Continue as long as the
    * number is positive
    */
   private static void exampleThree() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number (negative to quit): ");
    int number =in.nextInt();
    int sum = 0;

    while(number >= 0){
        sum += number;
        System.out.print("Enter a number (negative to quit): ");
        number = in.nextInt();
    }
    System.out.println(sum);
    in.close();
   }

   /* Prompt the user for a String and count the number of vowels in the String. */
   private static void exampleFour() {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a sentence: ");
    String sentence = in.nextLine();

    int index = 0;
    int numVowels = 0;

    while(index < sentence.length()){
        String letter = sentence.substring(index, index+1);

        if("aeiou".indexOf(letter.toLowerCase())>=0){
            numVowels++;
        }
        index++;
    }
    System.out.println(numVowels);
    in.close();
   }

}