package chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main (String args[]){
        System.out.println("Enter you test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        char grade;

        if (score < 60) {
            grade = 'F';
        } else if (score < 70 ) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("you grade is " + grade);
    }
}