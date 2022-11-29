package blackjack;

import java.util.Scanner;

public class BlackJack {

   static Scanner in = new Scanner(System.in);
   static final int MIN_BET = 5;
   static final int STARTING_WALLET = 500;
   private static final int WIN = 1;
   private static final int LOST = -1;
   private static final int TIE = 0;
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

   public static void main(String[] args) {

      int wallet = STARTING_WALLET;
      boolean stillPlaying = true;

      while (stillPlaying) {
         int bet = getBet(wallet);
         String playerHand = getCard() + " " + getCard();
         String dealerHand = getCard();

         displayHand(playerHand, false, "Player: ");
         displayHand(dealerHand, true, "Dealer: ");

         // returns who won
         int result = playHand(playerHand, dealerHand);

         if (result == WIN) {
            wallet += bet;
            System.out.println("You WIN!");
         } else if (result == LOST) {
            wallet -= bet;
            System.out.println("You LOSE!");
         } else {
            System.out.println("You TIE!");

         }

         if (wallet < MIN_BET) {
            stillPlaying = false;
            System.out.println("You do not have enough $$ to play.");
         } else
            stillPlaying = playAgain();
      }

   }

   private static boolean playAgain() {
      while (true) {
         System.out.print("Play Again ([Y]es/[N]o): ");
         String result = in.nextLine().toLowerCase();

         if (result.equals("y") || result.equals("yes"))
            return true;
         else if (result.equals("n") || result.equals("no"))
            return false;
      }

   }

   // return WIN if player wins, LOST if player LOST and TIE if they tie
   private static int playHand(String playerHand, String dealerHand) {
      playerHand = playerTurn(playerHand);
      dealerHand = dealerTurn(dealerHand);

      int playerValue = getCardsValue(playerHand);
      int dealerValue = getCardsValue(dealerHand);

      if(playerValue <= 21 && (playerValue > dealerValue || dealerValue > 21)){
         return WIN;
      }else if(dealerValue <= 21 && (dealerValue > playerValue || playerValue > 21)){
         return LOST;
      }else{
         return TIE;
      }
   }

   private static int getCardsValue(String cards) {
      int sum = 0;
      int numAces = 0;
      for(int i = 0; i < cards.length(); i++){
         String s = cards.substring(i, i+1);
         if("JQK1".indexOf(s) >= 0)
            sum += 10;
         else if("A".equals(s))
            numAces++;
         else if("23456789".indexOf(s)>=0){
            sum += Integer.parseInt(s);
         }
         if(numAces > 0){
            sum += 11 + numAces - 1;
            if(sum > 21){
               sum -= 10;
            }
         }
      }
      return sum;
   }

   // private static String dealerTurn(String dealerHand) {
   //    if(getCardsValue(dealerHand) <= 17)
   //       dealerHand += " " + getCard();
   //    else
   //       return dealerHand;
   // }

   private static String dealerTurn(String dealerHand) {
      while(true){
          if (getCardsValue(dealerHand)<=17)
          dealerHand += " " + getCard();
          else 
          return dealerHand;
      }
  }

   private static String playerTurn(String playerHand) {
      boolean isPlaying = true;

      if(isPlaying){
         displayHand(playerHand, false, "Player: ");
         System.out.print("Hit (1) or Stand (2): ");
         String result = in.nextLine();
         if(result.equals("1")){
            playerHand += " " + getCard();
            if(getCardsValue(playerHand) > 21){
               isPlaying = false;
            }else if(result.equals("2")){
               isPlaying = false;
            }
         }
      }
      return playerHand;
   }

   private static void displayHand(String cards, boolean isHidden, String label) {
      String result = "";
      if (isHidden)
         result += label + "XX " + cards;
      else
         result += label + cards;

      System.out.println(result);
   }

   private static String getCard() {
      return getValue() + getSuit();
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

   private static int getBet(int maxBet) {

      boolean validBet = false;
      int bet = 0; // etst
      System.out.print("Please enter bet (MIN: $" + MIN_BET + ")");
      while (!validBet) {
         try {
            bet = Integer.parseInt(in.nextLine());

            if (bet > maxBet)
               System.out.print("Please enter bet (MAX: $" + maxBet + ")");
            else if (bet < MIN_BET)
               System.out.print("Please enter bet (MIN: $" + MIN_BET + ")");
            else
               validBet = true;
         } catch (NumberFormatException ex) {
            System.out.println("Invalid Bet");
            System.out.print("Please enter bet (MIN: $" + MIN_BET + ")");
         }
      }

      return bet;

   }
}