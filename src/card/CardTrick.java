/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 *
 * BRITTANY_LANGLEY_ICE1 branch
 * @author brittany langley username: langlbri student number: 991805350 ICE 1
 */
import java.util.Random;
//import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        //Code for user to enter card value and suit
        //commenting to replace user input with luckyCard
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Pick any card by entering a value of 1 to 13: ");
        int userValue = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.nextLine().trim();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);*/

        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Spades");
        System.out.println("Lucky Card: " + luckyCard.getValue() + " of " + luckyCard.getSuit());

        //code to check for luckyCard match in array
        boolean cardMatch = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && luckyCard.getSuit().equals(luckyCard.getSuit())) {
                cardMatch = true;
                break;

            }
        }

        //output for result after checking array
        if (cardMatch) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
        System.out.println("Cards in Hand: ");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        //scanner.close();
    }

}
