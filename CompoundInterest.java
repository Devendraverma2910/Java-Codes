//Compound interest

public class CompoundInterest {
    public static void main(String[] args) {

        double P = 1000;  // Principal
        double R = 5;     // Rate
        double T = 2;     // Time

        double amount = P * Math.pow((1 + R/100), T);
        double CI = amount - P;

        System.out.println("Compound Interest = " + CI);
    }
}