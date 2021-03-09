package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main (String args[]) {
        System.out.println("Enter you letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case  "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work harder";
                break;
            case "F":
                message = "Opps!";
                break;
            default:
                message = "Error!";
                break;
        }
    }
}
