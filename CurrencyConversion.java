//Currency conversion


import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        double rate = 0.012; // Example rate (1 INR ≈ 0.012 USD)

        double usd = inr * rate;

        System.out.println("Amount in USD = " + usd);
    }
}