//ProfitLoss

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        if(sp > cp) {
            double profit = sp - cp;
            double profitPercent = (profit / cp) * 100;

            System.out.println("Profit = " + profit);
            System.out.println("Profit % = " + profitPercent);
        } 
        else if(cp > sp) {
            double loss = cp - sp;
            double lossPercent = (loss / cp) * 100;

            System.out.println("Loss = " + loss);
            System.out.println("Loss % = " + lossPercent);
        } 
        else {
            System.out.println("No Profit No Loss");
        }
    }
}