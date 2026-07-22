//Discount

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total amount: ");
        double amount = sc.nextDouble();

        double discount, finalAmount;

        if(amount >= 1000) {
            discount = amount * 0.10;
        } else {
            discount = amount * 0.05;
        }

        finalAmount = amount - discount;

        System.out.println("Discount = " + discount);
        System.out.println("Final Amount = " + finalAmount);
    }
}