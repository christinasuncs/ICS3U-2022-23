// write function for if need to take card away and card is first or last in hand

package gofish;

import java.util.Scanner;

public class GoFish {
   static Scanner in = new Scanner(System.in);
   private static final int NUM_SUITS = 4;
   private static final String HEARTS = "H";
   private static final String CLUBS = "C";
   private static final String SPADES = "S";
   private static final String DIAMONDS = "D";
   private static final int NUM_VALUES = 13;
   private static final String JACK = "J";
   private static final String ACE = "A";
   private static final String QUEEN = "Q";
   private static final String KING = "K";

   private static int player1Points = 0;
   private static int player2Points = 0;
   private static int player3Points = 0;
   private static int player4Points = 0;

   private static String playerHand = dealCards(); // player 1
   private static String comp1Hand = dealCards(); // player 2
   private static String comp2Hand = dealCards(); // player 3
   private static String comp3Hand = dealCards(); // player 4

   private static int currentPlayer = 0; // 0 = real human player, 1, 2, and 3 are computer
   public static void main(String[] args) {
      boolean isPlaying = true;

      while(isPlaying){
         displayHands(true);
         System.out.println("\nChecking all players hands for pairs...\n");
         playerHand = checkPairs(playerHand, player1Points);
         playerHand = checkPairs(playerHand, player1Points);
         currentPlayer = (currentPlayer + 1) % 4;
         comp1Hand = checkPairs(comp1Hand, player2Points);
         comp1Hand = checkPairs(comp1Hand, player2Points);
         currentPlayer = (currentPlayer + 1) % 4;
         comp2Hand = checkPairs(comp2Hand, player3Points);
         comp2Hand = checkPairs(comp2Hand, player3Points);
         currentPlayer = (currentPlayer + 1) % 4;
         comp3Hand = checkPairs(comp3Hand, player4Points);
         comp3Hand = checkPairs(comp3Hand, player4Points);
         currentPlayer = (currentPlayer + 1) % 4;
         displayHands(true);

         System.out.println("\nPlayer 1's turn!");
         playerAskPlayer(currentPlayer); // real player picks computer player they want to ask
         displayHands(true);
         currentPlayer = (currentPlayer + 1) % 4;
         System.out.println("\nPlayer 2's turn!");
         compPlayerAskPlayer(currentPlayer);
         currentPlayer = (currentPlayer + 1) % 4;
         System.out.println("\nPlayer 3's turn!");
         compPlayerAskPlayer(currentPlayer);
         currentPlayer = (currentPlayer + 1) % 4;
         System.out.println("\nPlayer 4's turn!");
         compPlayerAskPlayer(currentPlayer);
         currentPlayer = (currentPlayer + 1) % 4;

         if (player1Points == 10 || player2Points == 10 || player3Points == 10 || player4Points == 10) {
            isPlaying = false;
            System.out.println("\nGAME OVER");
            System.out.println("Player 1 score: " + player1Points);
            System.out.println("Player 2 score: " + player2Points);
            System.out.println("Player 3 score: " + player3Points);
            System.out.println("Player 4 score: " + player4Points);
            if(player1Points == 10)
               System.out.println("Player 1 has won!");
            else if(player2Points == 10)
               System.out.println("Player 2 has won!");
            else if(player3Points == 10)
               System.out.println("Player 3 has won!");  
            else if(player4Points == 10)
               System.out.println("Player 4 has won!"); 
            isPlaying = playAgain();       
         }
      }
   }

   private static void displayHands(boolean isHidden) {
      if(isHidden){
         System.out.println("Player 1 (that's you!): " + playerHand);
         String player2Display = "";
         String player3Display = "";
         String player4Display = "";
         for (int i = 0; i < tenToZero(comp1Hand).length()/3; i++) {
            player2Display += "XX ";
         }
         for (int i = 0; i < tenToZero(comp2Hand).length()/3; i++) {
            player3Display += "XX ";
         }
         for (int i = 0; i < tenToZero(comp3Hand).length()/3; i++) {
            player4Display += "XX ";
         }
         System.out.println("Player 2: " + player2Display);
         System.out.println("Player 3: " + player3Display);
         System.out.println("Player 4: " + player4Display);
      }else{
         System.out.println("Player 1: " + playerHand);
         System.out.println("Player 2: " + comp1Hand);
         System.out.println("Player 3: " + comp2Hand);
         System.out.println("Player 4: " + comp3Hand);
      }
      System.out.println("Player 1 points: " + player1Points);
      System.out.println("Player 2 points: " + player2Points);
      System.out.println("Player 3 points: " + player3Points);
      System.out.println("Player 4 points: " + player4Points);
   }

   private static boolean playAgain() {
      boolean isPlaying = true;
      boolean yass = true;
      while(yass){
         System.out.print("Play Again ([Y]es/[N]o): ");
         String result = in.nextLine().toLowerCase();
         if (result.equals("y") || result.equals("yes")){
            isPlaying = true;
            yass = false;
            player1Points = 0;
            player2Points = 0;
            player3Points = 0;
            player4Points = 0;
            playerHand = dealCards();
            comp1Hand = dealCards();
            comp2Hand = dealCards();
            comp3Hand = dealCards();
         }
         else if (result.equals("n") || result.equals("no")){
            isPlaying = false;
            yass = false;
         }
         else{
            System.out.println("Answer [Y]es or [N]o");
            yass = true;
         }
      }
      return isPlaying;
   }

   private static void playerAskPlayer(int askerPlayer) {
      // real player picks computer player they want to ask
      // input is one of three computer player
      // returned is selected computer player by real player
      boolean validPlayer = false;
      String askedPlayer = "";
      while(!validPlayer){
         System.out.println("Who do you want to ask?");
         System.out.print("player 2, 3, or 4?: ");
         askedPlayer = in.nextLine();
         if(askedPlayer.equals("2") || askedPlayer.equals("3") || askedPlayer.equals("4")){
            validPlayer = true;
         }else{
            System.out.println("That is not a player. Ask an active player in the game.");
         }
      }
      while(validPlayer){
         boolean askerHasCard = false;
         System.out.print("What card do you want? ");
         String wantedCard = in.nextLine().toUpperCase();
         askerHasCard = checkAskerHasCard(wantedCard);
         if(askerHasCard){
            checkHasCard(wantedCard, askedPlayer);
            playerHand = checkPairs(playerHand, player1Points);
            validPlayer = false;
            playerHand = checkEmptyHand(playerHand);
         }else{
            System.out.println("Ask for a card that you have in your hand.");
         }
      }
   }

   private static String checkEmptyHand(String hand) {
      if(hand.length() < 2){
         hand = dealCards();
      }
      return hand;
   }

   private static boolean checkAskerHasCard(String wantedCard) {
      if(playerHand.indexOf(wantedCard) >= 0){
         return true;
      }
      return false;
   }

   private static void checkHasCard(String wantedCard, String askedPlayer) { // check if player wantedCard and changes both players hands to match
      wantedCard = tenToZero(wantedCard);
      if(currentPlayer == 0){ // asker player is human
         if(askedPlayer.equals("2")){
            // computer 1 is being asked for wantedCard by human player
            if(tenToZero(comp1Hand).indexOf(wantedCard) >= 0){
               playerHand = tenToZero(playerHand);
               comp1Hand = tenToZero(comp1Hand);
               playerHand += comp1Hand.substring(comp1Hand.indexOf(wantedCard), comp1Hand.indexOf(wantedCard)+2);
               comp1Hand = removeWantedCard(comp1Hand, wantedCard);
               playerHand = zeroToTen(playerHand);
               comp1Hand = zeroToTen(comp1Hand);
            }else
               goFish();
         }else if(askedPlayer.equals("3")){
            // computer 2 is being asked for wantedCard by human player
            if(tenToZero(comp2Hand).indexOf(wantedCard) >= 0){
               playerHand = tenToZero(playerHand);
               comp2Hand = tenToZero(comp2Hand);
               playerHand += comp2Hand.substring(comp2Hand.indexOf(wantedCard), comp2Hand.indexOf(wantedCard)+2);
               comp2Hand = removeWantedCard(comp2Hand, wantedCard);
               playerHand = zeroToTen(playerHand);
               comp2Hand = zeroToTen(comp2Hand);
            }else
               goFish();
         }else if(askedPlayer.equals("4")){
            // computer 3 is being asked for wantedCard by human player
            if(tenToZero(comp3Hand).indexOf(wantedCard) >= 0){
               playerHand = tenToZero(playerHand);
               comp3Hand = tenToZero(comp3Hand);
               playerHand += comp3Hand.substring(comp3Hand.indexOf(wantedCard), comp3Hand.indexOf(wantedCard)+2);
               comp3Hand = removeWantedCard(comp3Hand, wantedCard);
               playerHand = zeroToTen(playerHand);
               comp3Hand = zeroToTen(comp3Hand);
            }else
               goFish();
         }
      }else if(currentPlayer == 1){ // asker player is comp 1
         if(askedPlayer.equals(playerHand)){// human player is being asked for wantedCard by comp 1
            if(tenToZero(askedPlayer).indexOf(wantedCard) >= 0){
               comp1Hand = tenToZero(comp1Hand);
               playerHand = tenToZero(playerHand);
               comp1Hand += " " + playerHand.substring(playerHand.indexOf(wantedCard), playerHand.indexOf(wantedCard)+2);
               playerHand = removeWantedCard(playerHand, wantedCard);
               comp1Hand = zeroToTen(comp1Hand);
               playerHand = zeroToTen(playerHand);
            }else
               goFish();
         }else if(askedPlayer.equals(comp2Hand)){ // comp 2 is being asked for wantedCard by comp 1
            if(tenToZero(askedPlayer).indexOf(wantedCard) >= 0){
               comp1Hand = tenToZero(comp1Hand);
               comp2Hand = tenToZero(comp2Hand);
               comp1Hand += " " + comp2Hand.substring(comp2Hand.indexOf(wantedCard), comp2Hand.indexOf(wantedCard)+2);
               comp2Hand = removeWantedCard(comp2Hand, wantedCard);
               comp1Hand = zeroToTen(comp1Hand);
               comp2Hand = zeroToTen(comp2Hand);
            }else
               goFish();
         }else if(askedPlayer.equals(comp3Hand)){ // comp 3 is being asked for wantedCard by comp 1
            if(tenToZero(askedPlayer).indexOf(wantedCard) >= 0){
               comp1Hand = tenToZero(comp1Hand);
               comp3Hand = tenToZero(comp3Hand);
               comp1Hand += " " + askedPlayer.substring(askedPlayer.indexOf(wantedCard), askedPlayer.indexOf(wantedCard) + 2);
               comp3Hand = removeWantedCard(comp3Hand, wantedCard);
               comp1Hand = zeroToTen(comp1Hand);
               comp3Hand = zeroToTen(comp3Hand);
            }else 
               goFish();
         }
      }else if(currentPlayer == 2){ // asker player is comp 2
         if(askedPlayer.equals(playerHand)){ // human player is being asked for wantedCard by comp 2
            if(tenToZero(askedPlayer).indexOf(wantedCard) >= 0){ // human player has wantedCard
               comp2Hand = tenToZero(comp2Hand);
               playerHand = tenToZero(playerHand);
               comp2Hand += " " + askedPlayer.substring(askedPlayer.indexOf(wantedCard), askedPlayer.indexOf(wantedCard)+2);
               playerHand = removeWantedCard(playerHand, wantedCard);
               comp2Hand = zeroToTen(comp2Hand);
               playerHand = zeroToTen(playerHand);
            }else 
               goFish();
         }else if(askedPlayer.equals(comp1Hand)){
            if(tenToZero(askedPlayer).indexOf(wantedCard) >= 0){ // comp 1 has wantedCard
               comp2Hand = tenToZero(comp2Hand);
               comp1Hand = tenToZero(comp1Hand);
               comp2Hand += " " + askedPlayer.substring(askedPlayer.indexOf(wantedCard), askedPlayer.indexOf(wantedCard)+2);
               comp1Hand = removeWantedCard(comp1Hand, wantedCard);
               comp2Hand = zeroToTen(comp2Hand);
               comp1Hand = zeroToTen(comp1Hand);
            }else 
               goFish();
         }else if(askedPlayer.equals(comp3Hand)){
            if(tenToZero(askedPlayer).indexOf(wantedCard) >= 0){ // comp 3 has wantedCard
               comp2Hand = tenToZero(comp2Hand);
               comp3Hand = tenToZero(comp3Hand);
               comp2Hand += " " + askedPlayer.substring(askedPlayer.indexOf(wantedCard), askedPlayer.indexOf(wantedCard)+2);
               comp3Hand = removeWantedCard(comp3Hand, wantedCard);
               comp2Hand = zeroToTen(comp2Hand);
               comp3Hand = zeroToTen(comp3Hand);
            }else 
               goFish();
         }
      }else if(currentPlayer == 3){ // asker player is comp 3
         if(askedPlayer.equals(playerHand)){ // human player is being asked for wantedCard by comp 3
            if(tenToZero(askedPlayer).indexOf(wantedCard) >= 0){ // human player has wantedCard
               comp3Hand = tenToZero(comp3Hand);
               playerHand = tenToZero(playerHand);
               comp3Hand += " " + askedPlayer.substring(askedPlayer.indexOf(wantedCard), askedPlayer.indexOf(wantedCard)+2);
               playerHand = removeWantedCard(playerHand, wantedCard);
               comp3Hand = zeroToTen(comp3Hand);
               playerHand = zeroToTen(playerHand);
            }else
               goFish();
         }else if(askedPlayer.equals(comp1Hand)){
            if(tenToZero(askedPlayer).indexOf(wantedCard) >= 0){ // comp 1 has wantedCard
               comp3Hand = tenToZero(comp3Hand);
               comp1Hand = tenToZero(comp1Hand);
               comp3Hand += " " + askedPlayer.substring(askedPlayer.indexOf(wantedCard), askedPlayer.indexOf(wantedCard)+2);
               comp1Hand = removeWantedCard(comp1Hand, wantedCard);
               comp3Hand = zeroToTen(comp3Hand);
               comp1Hand = zeroToTen(comp1Hand);
            }else 
               goFish();
         }else if(askedPlayer.equals(comp2Hand)){ // comp 2 is being asked for wantedCard by comp 3
            if(tenToZero(askedPlayer).indexOf(wantedCard) >= 0){
               comp3Hand = tenToZero(comp3Hand);
               comp2Hand = tenToZero(comp2Hand);
               comp3Hand += " " + comp2Hand.substring(comp2Hand.indexOf(wantedCard), comp2Hand.indexOf(wantedCard)+2);
               comp2Hand = removeWantedCard(comp2Hand, wantedCard);
               comp3Hand = zeroToTen(comp3Hand);
               comp2Hand = zeroToTen(comp2Hand);
            }else
               goFish();
         }
      }
      playerHand = checkPairs(playerHand, player1Points);
      comp1Hand = checkPairs(comp1Hand, player2Points);
      comp2Hand = checkPairs(comp2Hand, player3Points);
      comp3Hand = checkPairs(comp3Hand, player4Points);
   }

   private static void goFish() {
      System.out.println("Go Fish!");
      System.out.println("Please take a card from the deck\n");
      if(currentPlayer == 0){ // human player is currentPlayer, human player is asker player
         playerHand += getCard();
      }else if(currentPlayer == 1) // asker player is comp 1
         comp1Hand += getCard();
      else if(currentPlayer == 2) // asker player is comp 2
         comp2Hand += getCard();
      else if(currentPlayer == 3) // asker player is comp 3
         comp3Hand += getCard();
   }

   private static void compPlayerAskPlayer(int currentPlayer) {
      // computer player asks random player for card
      // input is current player
      // return asked player
      String compAskedPlayer = ""; //player being asked by computer
      String wantedCard = "";
      int temp = (int)(Math.random()*3+1);
      if(currentPlayer == 1){ // comp 1 is currentPlayer
         wantedCard = compWantCard(comp1Hand);
         if(temp == 1){ // ask human player
            compAskedPlayer = playerHand;
         }else if(temp == 2){
            compAskedPlayer = comp2Hand;
         }else if(temp == 3){
            compAskedPlayer = comp3Hand;
         }
      }else if(currentPlayer == 2){ // comp 2 is currentPlayer
         wantedCard = compWantCard(comp2Hand);
         if(temp == 1){
            compAskedPlayer = playerHand;
         }else if(temp == 2){
            compAskedPlayer = comp1Hand;
         }else if(temp == 3){
            compAskedPlayer = comp3Hand;
         }
      }else if(currentPlayer == 3){ // comp 3 is currentPlayer
         wantedCard = compWantCard(comp3Hand);
         if(temp == 1){
            compAskedPlayer = playerHand;
         }else if(temp == 2){
            compAskedPlayer = comp1Hand;
         }else if(temp == 3){
            compAskedPlayer = comp2Hand;
         }
      }
      checkHasCard(wantedCard, compAskedPlayer);
      comp1Hand = checkEmptyHand(comp1Hand);
      comp2Hand = checkEmptyHand(comp2Hand);
      comp3Hand = checkEmptyHand(comp3Hand);
   }

   private static String compWantCard(String askedPlayer) {
      String wantedCard = "";
      askedPlayer = tenToZero(askedPlayer) + " ";
      int temp = (int)(Math.random()*(askedPlayer.length()/3))*3;
      wantedCard = askedPlayer.substring(temp, temp+1);
      wantedCard = zeroToTen(wantedCard);
      return wantedCard;
   }

   private static String checkPairs(String hand, int points) {
      String tempHand = tenToZero(hand);
      hand = tenToZero(hand);
      for(int i = 0; i < hand.length()-3; i+=3){
         String tempNum = hand.substring(i, i+1);
         for(int j = i+3; j < hand.length(); j+=3){
            if(tempNum.equals(hand.substring(j, j+1))){ // if true, means there is pair
               if(i == 0 && j == hand.length()-3)
                  hand = hand.substring(i+3, j);
               else if(i == 0)
                  hand = hand.substring(3, j)+ hand.substring(j+3, hand.length());
               else if(i == hand.length()-6)
                  hand = hand.substring(0, i-1);
               else{
                  hand = hand.substring(0,i-1) + hand.substring(i+2, j-1) + hand.substring(j+2, hand.length());
               }
            }
         }
      }
      checkPoints(tempHand, hand);
      hand = zeroToTen(hand);
      return hand;
    }

   private static String removeWantedCard(String hand, String wantedCard) {
      // askedPlayer has wantedCard
      // remove wantedCard from askedPlayer
      int ind = hand.indexOf(wantedCard);
      if(ind == 0){
         hand = hand.substring(ind + 3, hand.length());
      }else if(ind >= hand.length()-2){
         hand = hand.substring(0, ind);
      }else
         hand = hand.substring(0, ind) + hand.substring(ind+3,hand.length());
      return hand;
   }

   private static void checkPoints(String oldHand, String newHand) {
      if(oldHand.length()-newHand.length() >= 6){
         if(currentPlayer == 0)
            player1Points++;
         if(currentPlayer == 1)
            player2Points++;
         if(currentPlayer == 2)
            player3Points++;
         if(currentPlayer == 3)
            player4Points++;
      }
   }

   private static String tenToZero(String hand) {
      for(int i = 0; i < hand.length(); i++){
         String letter = hand.substring(i, i+1);
         if(letter.equals("1")){
            hand = hand.substring(0,i) + hand.substring(i+1, hand.length());
         }
      }
      if(hand.length() != 0){
         if((!hand.substring(hand.length()-1).equals(" ")) && (hand.length() != 1)){
            hand += " ";
         }
      }
      return hand;
   }

   private static String zeroToTen(String hand) {
      for (int i = 0; i < hand.length(); i++) {
         if(hand.substring(i, i+1).equals("0")){
            hand = hand.substring(0, i) + "1" + hand.substring(i, hand.length());
            i++;
         }
      }
      for (int i = 0; i < hand.length()-2; i++) {
         if(hand.substring(i, i+2).equals("  "))
            hand = hand.substring(0, i) + hand.substring(i+1);
      }
      return hand;
   }

   private static String dealCards() {
      return getCard() + getCard() + getCard() + getCard() + getCard();
   }

   private static String getCard() {
      return getValue() + getSuit() + " ";
   }
  
   private static String getSuit() {
      int iSuit = (int) (Math.random() * NUM_SUITS) + 1;
  
      if (iSuit == 1)
         return HEARTS;
      else if (iSuit == 2)
         return SPADES;
      else if (iSuit == 3)
         return CLUBS;
      else
         return DIAMONDS;
   }
  
   private static String getValue() {
      int iValue = (int) (Math.random() * NUM_VALUES) + 1;
  
      if (iValue == 1)
         return ACE;
      else if (iValue == 11)
         return JACK;
      else if (iValue == 12)
         return QUEEN;
      else if (iValue == 13)
         return KING;
      else
         return "" + iValue;
   }
}