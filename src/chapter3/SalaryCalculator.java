package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]) {

        // All salespeople get a payment of $1000 a week
        // Salespeople who exceed 10 sales get an additional bonus $250

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did employee make this week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota) {
            salary = salary + bonus;
            System.out.println("salary with bonus will be: " + salary);
        }

    }
}
