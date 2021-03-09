package chapter5;

import java.util.Scanner;

public class Greetings {

    public static void main (String args[]) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String tte = "kss";

        greetUser(tte, name);
    }

    public static void greetUser(String name, String tte) {
        System.out.println("Hello " + name + "!" + tte);
    }
}
