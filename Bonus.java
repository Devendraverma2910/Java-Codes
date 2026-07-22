//Bonus

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter bonus percentage: ");
        double percent = sc.nextDouble();

        double bonus = (basic * percent) / 100;

        System.out.println("Bonus = " + bonus);
    }
}