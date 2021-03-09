package chapter4;

import java.util.Random;

public class Game {

    // https://testautomationu.applitools.com/java-programming-course/chapter4d.html
    // The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.

    public static void main (String args[]) {
        int numberOfRolls = 5;
        int spaces = 20;

        Random random = new Random();

        int currentSpace = 0;
        int spacesLeft;

        for (int i = 1; i <= numberOfRolls; i++) {
            int generateNumber = random.nextInt(6) + 1;

            currentSpace = currentSpace + generateNumber;

            spacesLeft = spaces - currentSpace;

            System.out.println("Roll #" + i + ": " + "You have rolled a " + generateNumber + ". " + "You are now on space "
                       + currentSpace + " and have " + spacesLeft + " more to go");

            if (currentSpace == spaces) {
                System.out.println("You are on a space " + currentSpace + ". You win!");
                break;
            } else if (currentSpace > spaces) {
                System.out.println("You lose! You have minus.");
                break;
            } else if (i == numberOfRolls && currentSpace < spaces ) {
                System.out.println("You current space " + currentSpace);
                System.out.println("You didn't make it all " + spaces + ". You lose!");
            } else {
                System.out.println("You are on space" + currentSpace + ". You have " + spacesLeft + " more to go");
            }
        }
    }
}
