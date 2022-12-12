/*
add the following
1. the ability to choose a letter or guess the answer
2. if they guess wrong add 1 to numWrong
3. if they get it right say they win
 */

import java.util.Scanner;

public class Hangman {

    static Scanner in = new Scanner(System.in);
    static final String VALID_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int MAX_BODY_PARTS = 7;

    public static void main(String[] args) {
        String phrase = getPhrase();
        String guessedLetters = "";
        int numWrong = 0;
        boolean win = false;

        while(numWrong < MAX_BODY_PARTS){
            displayDecodedMessage(phrase,guessedLetters);


            System.out.println("Guess a letter (1) or guess the entire phrase (2)");
            int playerAnswer = in.nextInt();
            if(playerAnswer == 1){
                String letter = getLetter(guessedLetters);
                guessedLetters += letter;

                if(phrase.indexOf(letter) < 0){
                    numWrong++;
                    drawHangman(numWrong);
                }
            }if(playerAnswer == 2){
                System.out.print("Guess the phrase: ");
                String playerGuessPhrase = in.nextLine();
                if(playerGuessPhrase.equals(phrase)){
                    System.out.println("you win");
                }
            }else{
                System.out.println("INVALID INPUT TRY AGAIN");
            }


        //     for(int i = 0; i < phrase.length(); i++){
        //         String phraseLetter = phrase.substring(i, i+1);
        //         if(phraseLetter.indexOf(guessedLetters) >= 0){
        //             win = true;
        //         }
        //     }
        }
        // if(win){
        //     System.out.println("You won");
        // }
    }

    private static String getLetter(String guessedLetters) {
        while(true){

                System.out.print("Please enter a letter: ");
                String letter = in.nextLine().toUpperCase();
                if(VALID_LETTERS.indexOf(letter) < 0)
                    System.out.println("Letters only");
                else if(guessedLetters.indexOf(letter) >= 0)
                    System.out.println("You already guessed that");
                else 
                    return letter;
        }
    }

    private static void displayDecodedMessage(String phrase, String guessedLetters) {
        String result = "";
        String result2 = "";
        for(int i = 0; i < phrase.length(); i++){
            String letter = phrase.substring(i, i+1);
            if(letter.equals(" ")){
                result += "/ ";
                result2 += " ";
            }
            else if(guessedLetters.indexOf(letter) >= 0){
                result += letter + " ";
                result2 += letter;
            }
            else
                result += "_ ";
        }
        System.out.println(result);
        if(result2.equals(phrase)){
            System.out.println("You win");
        }
    }

    private static String getPhrase() {
        boolean validInput = false;
        String phrase = "";
        while(!validInput){
            System.out.print("Please enter a phrase (letters and spaces only): ");
            phrase = in.nextLine().toUpperCase();
            validInput = true;
            for(int i = 0; i < phrase.length(); i++){
                String letter = phrase.substring(i, i+1);
                if((VALID_LETTERS + " ").indexOf(letter) < 0){
                    validInput = false;
                }
            }
        }
        return phrase;
    }

    private static void drawHangman(int numBodyParts) {
        if(numBodyParts == 0){
            System.out.println(" _______");
            System.out.println("|       |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("----------------");
        }else if(numBodyParts == 1){
            System.out.println(" _______");
            System.out.println("|       |");
            System.out.println("|       o");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("----------------");
        }else if(numBodyParts == 2){
            System.out.println(" _______");
            System.out.println("|       |");
            System.out.println("|       o");
            System.out.println("|       |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("----------------");
        }else if(numBodyParts == 3){
            System.out.println(" _______");
            System.out.println("|       |");
            System.out.println("|       o");
            System.out.println("|      /|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("----------------");
        }else if(numBodyParts == 4){
            System.out.println(" _______");
            System.out.println("|       |");
            System.out.println("|       o");
            System.out.println("|      /|\\");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("----------------");
        }else if(numBodyParts == 5){
            System.out.println(" _______");
            System.out.println("|       |");
            System.out.println("|       o");
            System.out.println("|      /|\\");
            System.out.println("|       |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("----------------");
        }else if(numBodyParts == 6){
            System.out.println(" _______");
            System.out.println("|       |");
            System.out.println("|       o");
            System.out.println("|      /|\\");
            System.out.println("|       |");
            System.out.println("|     _/");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("----------------");
        }else if(numBodyParts == 7){
            System.out.println(" _______");
            System.out.println("|       |");
            System.out.println("|       o");
            System.out.println("|      /|\\");
            System.out.println("|       |");
            System.out.println("|     _/ \\_");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("----------------");
        }
    }
}
