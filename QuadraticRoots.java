//Quadratic roots

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double d = (b * b) - (4 * a * c);

        if(d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Two Real Roots");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        }
        else if(d == 0) {
            double r = -b / (2 * a);

            System.out.println("Equal Roots");
            System.out.println("Root = " + r);
        }
        else {
            System.out.println("Imaginary Roots");
        }
    }
}