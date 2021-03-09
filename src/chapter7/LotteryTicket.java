package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String args[]) {
        int[] ticket = generateNumber();
        Arrays.sort(ticket);
        printTicker(ticket);
    }


    public static int[] generateNumber() {
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i< LENGTH; i++) {
            //ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
            int randomNumber;

            //generate random number
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket,randomNumber));

            //number is unique if we get here. Add it to the array
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find value
     * @param array Array to search to through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor) {
        //enhanced loop. It iterates through 'array' and each time assigns the current element to 'value'
        for(int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }

        // if we have reached this point, then the entire array was searched and the value was not found
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array,numberToSearchFor);
        if (index >=0) {
            return true;
        } else return false;
    }

    public static void printTicker(int ticker[]) {
        for (int i=0; i<LENGTH; i++) {
            System.out.print(ticker[i] + " | ");
        }
    }
}
