package chapter5;

import java.util.Scanner;

public class CellPhoneBill {

    public static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {

        double baseCost = getBaseCost();
        int overageMinutes = getOverageMinutes();
        scanner.close();

        double overageCharge = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost + overageCharge);

        calculateAndPrint(baseCost, overageCharge, tax);

    }

    public static double getBaseCost() {

        System.out.println("Enter base cost of the plan: ");
        double baseCost = scanner.nextDouble();

        return baseCost;
    }

    public static int getOverageMinutes() {

        System.out.println("Enter overage minutes: ");
        int overageMinutes = scanner.nextInt();

        return overageMinutes;
    }

    public static double calculateOverages(double overageMinutes) {
        double rate = 0.25;
        double overage = overageMinutes * rate;
        return overage;
    }

    public static double calculateTax(double baseCost) {
        double rate = 0.15;
        double tax = baseCost*rate;
        return tax;
    }

    public static void calculateAndPrint(double base, double overage, double tax) {
        double finalTotal = base + overage + tax;

        System.out.println("Phone Bill:");
        System.out.println("Plan: " + base + "$");
        System.out.println("Overage: " + overage + "$");
        System.out.println("Tax: " + tax + "$");
        System.out.println("Total: " + finalTotal + "$");
    }
}
