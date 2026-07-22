//Tax

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        System.out.print("Enter tax rate (%): ");
        double rate = sc.nextDouble();

        double tax = (income * rate) / 100;
        double netIncome = income - tax;

        System.out.println("Tax = " + tax);
        System.out.println("Net Income = " + netIncome);
    }
}